package com.lzw.wind.tibmas.core.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/8/2 9:31
 */
@Data
public class ListTaskProcessingUsersDTO {
    /**
     * 流程发起人
     */
    private String prcInitiator;


    /**
     *流程定义中的处理人组,对应的是角色或部门,角色：ROLE_,部门：DEPT_,
     */
    private List<String> taskProcessingGroups;


    /**
     * 流程定义名称
     */
    private String prcDefKey;

    /**
     * 流程变量
     */
    private Map<String,Object> prcVars;


    /**
     * 任务定义名称
     */
    private String taskDefKey;


    /**
     * 任务变量
     */
    private Map<String,Object> taskVars;


    /**
     * 其他参数
     */
    private Map<String,Object> details;
}
