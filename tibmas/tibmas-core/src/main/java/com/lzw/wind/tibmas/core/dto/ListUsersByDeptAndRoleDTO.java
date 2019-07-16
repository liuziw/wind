package com.lzw.wind.tibmas.core.dto;


import lombok.Data;

@Data
public class ListUsersByDeptAndRoleDTO {

    private String deptCode;

    private String roleCode;

    /**
     * 1：只在本部门中找
     * 2:向下找
     * 3：向上找
     */
    private Integer queryType;
}
