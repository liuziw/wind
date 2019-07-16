package com.lzw.wind.tibmas.core.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * @author YangYueWei
 * @Date 2019-07-15 15:33
 */

@Data
@ApiModel
public class ListAreaUserByDeptIdAndRoleCodeDTO {

    /**
     * 部门ID
     */
    public Long deptId;

    /**
     * 角色编码
     */
    public List<String> roleCodes;
}
