package com.lzw.wind.tibmas.core.service.impl;

import com.lzw.common.core.exception.CommonErrorCode;
import com.lzw.common.core.exception.CommonException;
import com.lzw.common.core.util.CommonUtils;
import com.lzw.common.dao.dto.QueryItemDTO;
import com.lzw.common.dao.util.DaoUtils;
import com.lzw.wind.tibmas.core.daomanager.TeamDaoManager;
import com.lzw.wind.tibmas.core.daomanager.TeamUserDaoManager;
import com.lzw.wind.tibmas.core.daomanager.UserDaoManager;
import com.lzw.wind.tibmas.core.dbo.TeamUserDO;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import com.lzw.wind.tibmas.core.dto.CommonIdDTO;
import com.lzw.wind.tibmas.core.dto.CommonOperationDTO;
import com.lzw.wind.tibmas.core.dto.DeleteUsersFromTeamDTO;
import com.lzw.wind.tibmas.core.dto.TeamAndUserDTO;
import com.lzw.wind.tibmas.core.service.TeamAndUserService;
import com.lzw.wind.tibmas.core.vo.TeamUserVO;
import com.lzw.wind.tibmas.core.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamAndUserServiceImpl implements TeamAndUserService {

    @Autowired
    private TeamUserDaoManager teamUserDaoManager;

    @Autowired
    private UserDaoManager userDaoManager;

    @Autowired
    private TeamDaoManager teamDaoManager;

    @Override
    public Integer addUserToTeam(TeamAndUserDTO teamAndUserDTO) {
        /**
         * 判断团队是否存在
         */
        if (teamDaoManager.getById(teamAndUserDTO.getTeamId()) == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "不存在团队相关信息，请重新核对");
        }

        /**
         * 查询该用户是否存在
         */
        if (userDaoManager.getById(teamAndUserDTO.getUserId()) == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "不存在该用户相关信息，请重新核对");
        }

//       查询用户是否已经存在该团队中
        List<QueryItemDTO> list = new ArrayList<>();
        if (teamAndUserDTO.getTeamId() != null && teamAndUserDTO.getUserId() != null) {
            list.add(DaoUtils.buildEqualTo("team_id", teamAndUserDTO.getTeamId()));
            list.add(DaoUtils.buildEqualTo("user_id", teamAndUserDTO.getUserId()));
        }

        List<TeamUserDO> teamUserDOList = this.teamUserDaoManager.listByQueryItems(list);
        if (teamUserDOList != null && !teamUserDOList.isEmpty()) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "用户已经存在");
        }
        TeamUserDO teamUserDO = CommonUtils.newInstance(teamAndUserDTO, TeamUserDO.class);
        this.teamUserDaoManager.insertNotNullProperties(teamUserDO);
        return teamUserDO.getId().intValue();
    }

    @Override
    public Integer deleteUserFromTeamByUserId(CommonOperationDTO commonOperationDTO) {

        if (commonOperationDTO.getUserId() == null || commonOperationDTO.getOperatorUserId() == null || commonOperationDTO.getTeamId() == null) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请输入正确的id");
        }

        /**
         * 判断身份
         */
        TeamUserDO teamUserDO = teamUserDaoManager.singleResultByUserId(commonOperationDTO.getOperatorUserId());
        System.out.println("++++++" + teamUserDO);
        if (teamUserDO.getUserType() == 2) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "抱歉,您没有操作权限");
        }

        List<QueryItemDTO> qurryList = new ArrayList<>();

        qurryList.add(DaoUtils.buildEqualTo("team_id", commonOperationDTO.getTeamId()));
        qurryList.add(DaoUtils.buildEqualTo("user_id", commonOperationDTO.getUserId()));
        List<TeamUserDO> teamUserDOS = teamUserDaoManager.listByQueryItems(qurryList);
        if (teamUserDOS == null || teamUserDOS.isEmpty()) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "用户不存在");
        }
        return teamUserDaoManager.deleteByUserId(commonOperationDTO.getUserId());
    }

    @Override
    public UserVO getUserByUserId(CommonIdDTO id) {
        Integer countByUserId = teamUserDaoManager.countByUserId(id.getId());
        if (countByUserId < 0) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "用户不存在");
        }
        UserDO userDO = userDaoManager.getById(id.getId());
        UserVO userVO = CommonUtils.newInstance(userDO, UserVO.class);
        return userVO;
    }

    @Override
    public List<TeamUserVO> getUsersByTeamId(CommonIdDTO id) {
        /**
         * 存在该团队？
         */
        Integer countByTeamId = teamUserDaoManager.countByTeamId(id.getId());
        if (countByTeamId < 0) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "该团队不存在");
        }
        List<Long> userIds = teamUserDaoManager.listByTeamId(id.getId()).stream().map(TeamUserDO::getUserId).collect(Collectors.toList());

        if (userIds.isEmpty()) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "团队为空");
        }

        List<UserDO> userDOS = this.userDaoManager.listByIds(userIds);
        System.out.println(userDOS);
        List<TeamUserVO> teamUserVOS = CommonUtils.collection2List(userDOS, userDO -> {
            return CommonUtils.newInstance(userDO, TeamUserVO.class);
        });
        return teamUserVOS;
    }

    /**
     * 批量删除
     *
     * @param deleteUsersFromTeamDTO
     * @return
     */
    @Override
    public Integer deleteUserByUserIds(DeleteUsersFromTeamDTO deleteUsersFromTeamDTO) {

        // 判断ids是否为空
        if (CollectionUtils.isEmpty(deleteUsersFromTeamDTO.getIds())) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "请选择要删除的用户");
        }

//       判断用户类型
        TeamUserDO teamUserDO = teamUserDaoManager.singleResultByUserId(deleteUsersFromTeamDTO.getOperatorUserId());
        System.out.println("++++++" + teamUserDO);
        if (teamUserDO.getUserType() == 2) {
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE, "抱歉,您没有操作权限");
        }

        deleteUsersFromTeamDTO.getIds().forEach(id -> {
            List<QueryItemDTO> list = new ArrayList<>();
            list.add(DaoUtils.buildEqualTo("user_id", id));
            list.add(DaoUtils.buildEqualTo("team_id", deleteUsersFromTeamDTO.getTeamId()));
            this.teamUserDaoManager.deleteByQueryItems(list);
        });
        return 1;
    }

    @Override
    public Integer addUsers(List<TeamAndUserDTO> teamAndUserDTOS) {

        StringBuilder stringBuilder = new StringBuilder();
        List<TeamUserDO> teamUserDOList = CommonUtils.collection2List(teamAndUserDTOS, teamAndUserDTO -> {
            ArrayList<QueryItemDTO> insertUsersList = new ArrayList<>();
            if (teamAndUserDTO.getUserId() != null && teamAndUserDTO.getTeamId() != null) {
                insertUsersList.add(DaoUtils.buildEqualTo("team_id", teamAndUserDTO.getTeamId()));
                insertUsersList.add(DaoUtils.buildEqualTo("user_id", teamAndUserDTO.getUserId()));
            }
            List<TeamUserDO> teamUserDOS = teamUserDaoManager.listByQueryItems(insertUsersList);
            if (!teamUserDOS.isEmpty() && teamUserDOS != null) {
                stringBuilder.append(teamAndUserDTO.getTeamId());
                stringBuilder.append("团队的");
                stringBuilder.append(teamAndUserDTO.getUserId());
                stringBuilder.append("成员已经存在"+" ");
            }
            return CommonUtils.newInstance(teamAndUserDTO, TeamUserDO.class);
        });
        teamUserDaoManager.insertAllPropertiesList(teamUserDOList);

        if (CommonUtils.isNotBlank(stringBuilder.toString())){
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,stringBuilder+"");
        }
        return 1;
    }
}
