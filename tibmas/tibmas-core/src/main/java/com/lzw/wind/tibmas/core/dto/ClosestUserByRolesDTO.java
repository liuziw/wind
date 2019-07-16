package com.lzw.wind.tibmas.core.dto;

import lombok.Data;

import java.util.List;

/**
 * @author liys
 * @date 2018/6/149:59
 */
@Data
public class ClosestUserByRolesDTO {

    private String userAccount;

    private List<String> roleCodes;
}
