package com.lzw.wind.tibmas.core.service;

import com.hyzs.gz.common.core.bo.PageBO;
import com.hyzs.tibmas.core.bo.ListTeamInfoByUserIdBO;
import com.hyzs.tibmas.core.dto.*;
import com.hyzs.tibmas.core.vo.TeamUserVO;
import com.hyzs.tibmas.core.vo.UserBasicInfoVO;

import java.util.List;

public interface TeamUserService {


    /**
     *
     * @param listTeamUsersDTO
     * @return
     */
    public PageBO<UserBasicInfoVO> listTeamUserByTeamId(ListTeamUsersDTO listTeamUsersDTO);

    /**
     *
     * @param teamUserIdsDTO
     * @return
     */
    public Integer operateTeamUser(TeamUserIdsDTO teamUserIdsDTO);

    /**
     *
     * @param listOtherUserDTO
     * @return
     */
    public List<TeamUserVO> listUsersByUserId(ListOtherUserDTO listOtherUserDTO);


    /**
     * 根据团队Id列出团队成员，不分页
     * @param teamIdDTO
     * @return
     */
    public List<UserBasicInfoVO> listUserByTeamId(TeamIdDTO teamIdDTO);


    /**
     * 选择协办人，模糊查询
     * @param coordinatorDTO
     * @return
     */
    public List<TeamUserVO> getCoordinator(CoordinatorDTO coordinatorDTO);



    public List<ListTeamInfoByUserIdBO> listTeamInfoByUserId(Long userId);

}
