package com.lzw.common.core.bo;

import lombok.Data;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/6/5 19:45
 */
@Data
public class ExcelPathBO {

    /**
     * excel名称
     */
    private String fileName;

    /**
     * excel模板路径
     */
    private String filePath;
}
