package com.lzw.wind.tibmas.core.manager;

import com.hyzs.tibmas.core.bo.DeptBO;
import com.hyzs.tibmas.core.dbo.DeptDO;
import com.hyzs.tibmas.core.dbo.DeptRoleDO;
import com.hyzs.tibmas.core.dbo.UserDO;
import com.hyzs.tibmas.core.vo.DeptTreeVO;
import com.hyzs.tibmas.core.vo.SelectTreeVO;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/**
 * @author liys
 * @date 2018/3/139:30
 */
public interface DeptManager {

    public List<UserDO> listUserByDeptId(Long deptId);

    public List<DeptRoleDO> listDeptRoleDOByDeptId(Long... deptIds);

    public <T> List<DeptRoleDO> listDeptRoleDOByDeptId(Collection<T> deptIds, Function<T, Long> mapper);

    public List<DeptBO> listDeptDO2ListUserBO(List<DeptDO> deptDOList);

    public List<SelectTreeVO> listDeptType();

    /**
     * 验证id或下级id是否等于pid
     * @param idList
     * @param pid
     * @return
     */
    public boolean  checkPid(List<Long> idList, Long pid);

    /**
     * 递归寻找机构的上级机构
     * @param pid
     * @param listAll
     * @param deptList
     */
    void getParentDept(Long pid, List<DeptDO> listAll, Set<DeptDO> deptList);

    /**
     * 递归寻找机构的下级机构
     * @param id
     * @param listAll
     * @param deptList
     */
    void getChildDept(Long id, List<DeptDO> listAll, Set<DeptDO> deptList);

    /**
     * 递归填充子机构
     * @param deptDOSList
     * @param rootTreeVO
     */
    void buildDeptTreeTable(Set<? extends DeptDO> deptDOSList, DeptTreeVO rootTreeVO);

}
