package com.lzw.wind.tibmas.core.service;

import com.lzw.wind.tibmas.core.dto.CommonIdDTO;
import com.lzw.wind.tibmas.core.dto.CommonOperationDTO;
import com.lzw.wind.tibmas.core.dto.DeleteUsersFromTeamDTO;
import com.lzw.wind.tibmas.core.dto.TeamAndUserDTO;
import com.lzw.wind.tibmas.core.vo.TeamUserVO;
import com.lzw.wind.tibmas.core.vo.UserVO;

import java.util.List;

public interface TeamAndUserService {

    /**
     * 往团队中增加新成员(所有人都可以)
     */
    public Integer addUserToTeam(TeamAndUserDTO teamAndUserDTO);

    /**
     *
     * @param commonOperationDTO
     * @return
     */
    public Integer deleteUserFromTeamByUserId(CommonOperationDTO commonOperationDTO);

    /**
     *
     * @param id
     * @return
     */
    public UserVO getUserByUserId(CommonIdDTO id);

    /**
     *
     * @param id
     * @return
     */
    public List<TeamUserVO> getUsersByTeamId(CommonIdDTO id);

    /**
     * 从团队中批量删除用户
     * @param deleteUsersFromTeamDTO
     * @return
     */
    public Integer deleteUserByUserIds(DeleteUsersFromTeamDTO deleteUsersFromTeamDTO);


    /**
     * 批量新增
     * @param teamAndUserDTOS
     * @return
     */
    public Integer addUsers(List<TeamAndUserDTO> teamAndUserDTOS);
}
