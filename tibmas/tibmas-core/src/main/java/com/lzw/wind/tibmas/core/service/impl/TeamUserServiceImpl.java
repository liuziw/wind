package com.lzw.wind.tibmas.core.service.impl;


import com.google.common.collect.Lists;
import com.lzw.common.core.bo.PageBO;
import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.dao.enums.IsDeletedEnum;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.wind.tibmas.core.bo.ListTeamInfoByUserIdBO;
import com.lzw.wind.tibmas.core.daomanager.*;
import com.lzw.wind.tibmas.core.dbo.*;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.service.TeamUserService;
import com.lzw.wind.tibmas.core.vo.TeamUserVO;
import com.lzw.wind.tibmas.core.vo.UserBasicInfoVO;
import com.lzw.wind.tibmas.core.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class TeamUserServiceImpl implements TeamUserService {


    @Autowired
    private TeamUserDaoManager teamUserDaoManager;

    @Autowired
    private TeamTypeDaoManager teamTypeDaoManager;

    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private DeptDaoManager deptDaoManager;

    @Autowired
    private TeamDaoManager teamDaoManager;


    /**
     * 根据teamId查询团队成员并进行分页处理
     * 该接口暂时保留，后期使用直接去掉TeamUserController中的相关注释就可以
     *
     * @param listTeamUsersDTO
     * @return
     */
    @Override
    public PageBO<UserBasicInfoVO> listTeamUserByTeamId(ListTeamUsersDTO listTeamUsersDTO) {
        PageBO<TeamUserDO> teamUserDOPageBO = DaoUtils.listDOByPage(() -> teamUserDaoManager.listByTeamId(listTeamUsersDTO.getTeamId()), listTeamUsersDTO);
        return CommonUtils.convertPageBO(teamUserDOPageBO, teamUserDO -> {
            UserDO userDO = userDaoManager.getById(teamUserDO.getUserId());
            UserBasicInfoVO userBasicInfoVO = CommonUtils.newInstance(userDO, UserBasicInfoVO.class);
            userBasicInfoVO.setDeptName(deptDaoManager.getById(userDO.getDeptId()).getDeptName());
            userBasicInfoVO.setUserId(userDO.getId());
            return userBasicInfoVO;
        });
    }


    /**
     * 该接口统一处理添加用户和删除用户
     * <PRE>
     * 前端参数必须封装所有要操作用户的Id和type
     * 此外，还要附带teamId以及teamTypeCode
     * </PRE>
     *
     * @param teamUserIdsDTO
     * @return
     */
    @Override
    public Integer operateTeamUser(TeamUserIdsDTO teamUserIdsDTO) {
        Set<Long> userIdSet = new HashSet<>();



        //排同工作
        teamUserIdsDTO.getUserInfo().forEach(userInfoVo -> {
            if (userIdSet.contains(userInfoVo.getUserId())) {
                throw CommonException.paramException("用户已经存在");
            }
//            如果没有，就把userid加进db中的userIdSet
            userIdSet.add(userInfoVo.getUserId());
        });

//       数据库中已经存在的teamId
        List<TeamUserDO> old = this.teamUserDaoManager.listByTeamId(teamUserIdsDTO.getTeamId());

//      通过已经存在的teamId去判断找到对应的userId
//       得到数据库中没有的userId，但是前端传了的，也就是要执行新增的userId-----》insertSet
        Map<Long, TeamUserDO> oldMap = CommonUtils.mapping(old, TeamUserDO::getUserId);
        Set<UserInfoVo> insertSet = CommonUtils.filter2Set(teamUserIdsDTO.getUserInfo(), userInfoVo -> !oldMap.containsKey(userInfoVo.getUserId()));

//        得到前端传的userId并判断数据库数据库中对应teamId的userId得到
//        数据库中有，但是前端没传的userId的集合deleteSet
        Map<Long, UserInfoVo> newMap = CommonUtils.mapping(teamUserIdsDTO.getUserInfo(), UserInfoVo::getUserId);
        Set<TeamUserDO> deleteSet = CommonUtils.filter2Set(old, teamUserDO -> !newMap.containsKey(teamUserDO.getUserId()));

//       如果deleteSet不为空，执行删除
        if (CommonUtils.isNotEmpty(deleteSet)) {
            this.teamUserDaoManager.deleteByIds(deleteSet, TeamUserDO::getId);
        }
//        如果insertSet不为空，执行新增
        if (CommonUtils.isNotEmpty(insertSet)) {
            TeamTypeDO teamTypeDO = teamTypeDaoManager.singleResultByTeamTypeCode(teamUserIdsDTO.getTeamTypeCode());
            this.checkWhenUserAddTeam(CommonUtils.collection2Set(insertSet,UserInfoVo::getUserId),teamTypeDO);
//            把insertSet中的属性copy到insertTeamUserDO
            List<TeamUserDO> insertTeamUserDO = CommonUtils.collection2List(insertSet, addUserToTeamDTO -> {
//               将DTO对象转为DO，并将属性值复制
                TeamUserDO teamUserDO = CommonUtils.newInstance(addUserToTeamDTO, TeamUserDO.class);
                teamUserDO.setIsDeleted(IsDeletedEnum.NOT_DELETED.getCode());
                teamUserDO.setTeamId(teamUserIdsDTO.getTeamId());
                return teamUserDO;
            });
            this.teamUserDaoManager.insertAllPropertiesList(insertTeamUserDO);
        }
        return 1;
    }

    /**
     * 判断用户是否可以加入到这个团队类型，重复性校验
     * @param userIds
     * @param teamTypeDO
     */
    private void checkWhenUserAddTeam(Set<Long> userIds,TeamTypeDO teamTypeDO){
        if(CommonUtils.isEmpty(userIds)){
            return;
        }

        //可以重复加
        if (teamTypeDO == null || teamTypeDO.getTeamTypeRepeat() !=1) {
            return;
        }

        //不可以重复加
        Map<Long, TeamDO> teamMap = this.teamDaoManager.mapByTeamTypeCode(teamTypeDO.getTeamTypeCode());
        if(CommonUtils.isEmpty(teamMap)){
            throw CommonException.paramException("团队类型下没有团队");
        }
        List<TeamUserDO> teamUserList = this.teamUserDaoManager.listByQueryItems(Lists.newArrayList(
                DaoUtils.buildIn(TeamUserDO.TEAM_ID, CommonUtils.collection2Set(teamMap.values(), TeamDO::getId)),
                DaoUtils.buildIn(TeamUserDO.USER_ID, userIds)
        ));
        if(CommonUtils.isEmpty(teamUserList)){
            //没有加入其他团队，可以加
            return;
        }

        //不可以加，报错信息包装好一点
        TeamUserDO teamUserDO = teamUserList.get(0);
        UserDO userDO = this.userDaoManager.getById(teamUserDO.getUserId());
        TeamDO teamDO=teamMap.get(teamUserDO.getTeamId());
        throw CommonException.paramException(String.format("用户【%s】已经加入了团队【%s】",userDO.getUserName(),teamDO.getTeamName()));

    }

    /**
     * 根据当前用户的id，查看其团队中的其他成员
     *
     * @param listOtherUserDTO
     * @return
     */
    @Override
    public List<TeamUserVO> listUsersByUserId(ListOtherUserDTO listOtherUserDTO) {

        UserDO userDO = userDaoManager.getById(listOtherUserDTO.getUserId());
        if (userDO == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "参数异常");
        }
        List<Long> userIds = teamUserDaoManager.listByTeamId(listOtherUserDTO.getTeamId()).stream().map(TeamUserDO::getUserId).collect(Collectors.toList());
        if (userIds.isEmpty()) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请确认参数");
        }
        List<UserDO> userDOS = this.userDaoManager.listByIds(userIds);
        List<UserDO> userDOList = userDOS.stream().filter(concurrentUserDO -> concurrentUserDO.getId() != listOtherUserDTO.getUserId()).collect(Collectors.toList());

        List<TeamUserVO> teamUserVOS = CommonUtils.collection2List(userDOList, otherUserDo -> {
            TeamUserVO teamUserVO = CommonUtils.newInstance(otherUserDo, TeamUserVO.class);
            teamUserVO.setUserId(otherUserDo.getId());
            teamUserVO.setDeptName(deptDaoManager.getById(otherUserDo.getDeptId()).getDeptName());
            return teamUserVO;
        });

        return teamUserVOS;
    }

    /**
     * 根据团队ID查询团队中成员的基本信息，不进行分页处理
     *
     * @param teamIdDTO
     * @return
     */
    @Override
    public List<UserBasicInfoVO> listUserByTeamId(TeamIdDTO teamIdDTO) {
        if (teamIdDTO.getTeamId() == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请输入正确的参数");
        }
        List<TeamUserDO> listTeamUserDO = teamUserDaoManager.listByTeamId(teamIdDTO.getTeamId());
        List<UserBasicInfoVO> userBasicInfoVOList = CommonUtils.collection2List(listTeamUserDO, teamUserDO -> {
            UserBasicInfoVO userBasicInfoVO = CommonUtils.newInstance(teamUserDO, UserBasicInfoVO.class);
            UserDO userDO = userDaoManager.getById(teamUserDO.getUserId());
            DeptDO deptDO = new DeptDO();
            if (userDO != null) {
                CommonUtils.copyProperties(userDO, userBasicInfoVO);
                deptDO = deptDaoManager.getById(userDO.getDeptId());
            }
            if (deptDO != null) {
                userBasicInfoVO.setDeptName(deptDO.getDeptName());
            }
            return userBasicInfoVO;
        });

        return userBasicInfoVOList.stream().filter(userBasicInfoVO -> userBasicInfoVO.getUserName() != null).collect(Collectors.toList());

    }


    @Override
    public List<ListTeamInfoByUserIdBO> listTeamInfoByUserId(Long userId) {
        List<TeamUserDO> teamUserDOList = this.teamUserDaoManager.listByUserId(userId);
        if (CommonUtils.isEmpty(teamUserDOList)) {
            return new ArrayList<>(0);
        }
        List<TeamDO> teamDOS = this.teamDaoManager.listByIds(teamUserDOList, TeamUserDO::getTeamId);

        return CommonUtils.collection2List(teamDOS, teamDO -> CommonUtils.newInstance(teamDO, ListTeamInfoByUserIdBO.class));
    }


    /**
     * 预制接口
     * 该接口用来选择协办人
     * 提供模糊查询搜索协办人
     *
     * @param coordinatorDTO
     * @return
     */
    @Override
    public List<TeamUserVO> getCoordinator(CoordinatorDTO coordinatorDTO) {

//        根据teamId得到该团队的所有成员
        List<TeamUserDO> listTeamUserDO = teamUserDaoManager.listByTeamId(coordinatorDTO.getTeamId());

        List<Long> listUserIds = listTeamUserDO.stream().map(TeamUserDO::getUserId).collect(Collectors.toList());

        List<UserDO> userDOList = userDaoManager.listByIds(listUserIds);
        // 剔除当前操作人，
        List<UserDO> listCoordinator = userDOList.stream().filter(concurrentUserDO -> concurrentUserDO.getId() != coordinatorDTO.getUserId()).collect(Collectors.toList());

        List<UserDO> coordinators = new ArrayList<>();
        if (CommonUtils.isNotBlank(coordinatorDTO.getQueryCondition())) {
            List<UserDO> listCoordinatorByAccount = listCoordinator.stream().filter(userDO -> userDO.getUserAccount().contains(coordinatorDTO.getQueryCondition())).collect(Collectors.toList());
            List<UserDO> listCoordinatorByUserName = listCoordinator.stream().filter(userDO -> userDO.getUserName().contains(coordinatorDTO.getQueryCondition())).collect(Collectors.toList());
            List<UserDO> listCoordinatorByPhone = listCoordinator.stream().filter(userDO -> userDO.getMobileNo().contains(coordinatorDTO.getQueryCondition())).collect(Collectors.toList());
            coordinators = Stream.of(listCoordinatorByAccount, listCoordinatorByUserName, listCoordinatorByPhone).flatMap(Collection::stream).distinct().collect(Collectors.toList());

        } else {
            coordinators = userDaoManager.listByIds(listUserIds);
        }

        return CommonUtils.collection2List(coordinators, coordinator -> {
            TeamUserVO teamUserVO = CommonUtils.newInstance(coordinator, TeamUserVO.class);
            teamUserVO.setUserId(coordinator.getId());
            teamUserVO.setDeptName(deptDaoManager.getById(coordinator.getDeptId()).getDeptName());
            return teamUserVO;
        });

    }
}
