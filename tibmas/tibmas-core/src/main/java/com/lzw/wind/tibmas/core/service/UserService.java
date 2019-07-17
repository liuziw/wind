package com.lzw.wind.tibmas.core.service;

import com.lzw.common.core.bo.PageBO;
import com.lzw.common.dao.dto.IdDTO;
import com.lzw.wind.tibmas.core.bo.*;
import com.lzw.wind.tibmas.core.dbo.PermDO;
import com.lzw.wind.tibmas.core.dbo.UserDO;
import com.lzw.wind.tibmas.core.dto.*;
import com.lzw.wind.tibmas.core.vo.*;

import java.util.List;

/**
 * @author liys
 * @date 2018/3/139:15
 */
public interface UserService {


    /**
     * 登陆信息查询
     * @param accountInfo 账号、手机、email等
     * @return
     */
    public UserDO getUserDOByLoginAccountInfo(String accountInfo);


    /**
     * 根据用户id获取用户的所有信息
     * @param userId
     * @return
     */
    public UserDetailsBO getUserDetailByUserId(Long userId);

    /**
     * 根据用户名和密码得到用户信息
     * @param dto
     * @return
     */
    public UserDetailsVO getUserByAccountAndPassword(QueryUserDTO dto);

    /**
     * 小程序登录
     * @return
     */
    Integer miniProgremLogin(MiniProgremLoginDTO dto);

    /**
     * 小程序退出登录
     * @param dto
     * @return
     */
    Integer miniProgremLogout(MiniProgremLogoutDTO dto);

    /**
     *
     * 根据用户id获取用户的所有信息(给用户详情用)
     * @param userId
     * @return
     */
    UserDetailsVO getUserByUserId(Long userId);

    /**
     * 根据openId得到用户信息
     * @param openIdDTO
     * @return
     */
    UserDetailsVO getUserByOpenId(OpenIdDTO openIdDTO);

    /**
     * 根据id得到用户注册详细信息
     * @param dto
     * @return
     */
    UserRegisterDetailVO getUserRegisterDetailsById(IdDTO<Long> dto);


    /**
     * 通过用户Id和应用Id查询用户拥有的菜单并构建菜单树
     * @param listOwnerMenusDTO
     * @return
     */
    public List<PermTreeVO> listOwnerMenus(ListOwnerMenusDTO listOwnerMenusDTO);


    /**
     * 通过用户Id和应用Id获取用户拥有的权限
     * @param listOwnerMenusDTO
     * @return
     */
    public List<PermDO> listOwnerPerms(ListOwnerMenusDTO listOwnerMenusDTO);

    /**
     * 新增用户信息
     * @param dto 用户信息传输对象
     * @return 操作结果 影响记录数
     */
    public Integer insert(AddUserDTO dto);

    /**
     * 注册用户
     * @param dto
     * @return
     */
    public Integer register(AddUserDTO dto);

    /**
     * 审核用户注册
     * @param examineDTO
     * @return
     */
    public Integer examine(ExamineDTO examineDTO);

    /**
     * 通过Id删除用户信息
     * @param id
     * @return
     */
    public Integer deleteById(Long id);

    /**
     * 批量删除用户信息
     * @param ids
     * @return
     */
    public Integer deleteByIds(List<Long> ids);

    /**
     * 修改用户信息
     * @param dto 用户信息传输对象
     * @return
     */
    public Integer updateById(UpdateUserDTO dto);

    /**
     * 重置密码操作
     * @param resetPasswordDTO
     * @return
     */
    public Integer resetPassword(ResetPasswordDTO resetPasswordDTO);

    /**
     * 为用户分配角色
     * @param grantRolesToUserDTO
     * @return
     */
    public Integer grantRolesToUser(GrantRolesToUserDTO grantRolesToUserDTO);

    /**
     * 根据用户查询角色信息，返回所有的角色信息,包含用户对应的角色id
     * @param dto
     * @return
     */
    public AppRoleTreeVO listRoleTreeWithSelectForRoleUpdate(IdDTO<Long> dto);

    /**
     * 根据userId和应用appId返回菜单树和权限
     * @param dto
     * @return
     */
    public UserAppBO getMenuByUserIdAndAppId(UserAndAppIDDTO dto);

    /**
     * 查询用户信息列表
     * @return
     */
    public PageBO<TibmasUserBO> listQuery(ListQueryUserDTO listQueryUserDTO);


    /**
     * 根据关键字查询用户
     * @param dto
     * @return
     */
    List<UserDeptBO> listUserByKeyWords(UserByKeyWordsDTO dto);

    /**
     * 查询注册用户信息列表
     * @param listQueryUserDTO
     * @return
     */
    PageBO<UserRegisterVO> listQueryUserRegister(ListQueryUserDTO listQueryUserDTO);

    /**
     * 根据用户账号得到用户所能访问的应用列表
     * @param dto
     * @return
     */
    List<AppDTO> listAppByUserAccount(ListAppByUserAccountDTO dto);

    /**
     * 得到最近的角色人员
     * @param dto
     * @return
     */
    List<UserVO> listClosestUserByRoles(ClosestUserByRolesDTO dto);

    /**
     * 根据发起人账号和上级角色编码，部门编码找到最近的人员
     * @param listTaskProcessingUsersDTO
     * @return
     */
    List<String> listTaskProcessingUsers(ListTaskProcessingUsersDTO listTaskProcessingUsersDTO);

    UserDO getUserDOById(Long id);

    /**
     * 查询用户的可执行人
     * @param listCanDoTaskUsersDTO
     * @return
     */
    public List<UserBO> listCanDoTaskUsers(ListCanDoTaskUsersDTO listCanDoTaskUsersDTO);


    public List<UserBO> listUserInfoByIds(ListUserInfoByIdsDTO listUserInfoByIdsDTO);


    public List<UserBO> listCopyForUsers(ListCopyForUsersDTO listCopyForUsersDTO);


    public List<UserBO> listUsersByDeptAndRoleDTO(ListUsersByDeptAndRoleDTO listUsersByDeptAndRoleDTO);

    public Boolean disabledUser(IdDTO<Long> dto);

    /**
     * 解锁用户（包括登录失败多次后的锁定和账号过期）
     * @param userId
     * @return
     */
    Integer unlock(Long userId);


    /**
     * 查询用户信息，用户选择框组件专用
     * @param pageListUserInfoForComponentDTO
     * @return
     */
    public PageBO<PageListUserInfoForComponentVO> pageListUserInfoForComponent(PageListUserInfoForComponentDTO pageListUserInfoForComponentDTO);


    public List<AreaUserVO> listAreaUserByDeptIdAndRoleCode(ListAreaUserByDeptIdAndRoleCodeDTO listAreaUserByDeptIdAndRoleCodeDTO);
}
