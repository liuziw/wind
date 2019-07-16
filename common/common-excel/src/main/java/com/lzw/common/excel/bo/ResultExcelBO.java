package com.lzw.common.excel.bo;

import lombok.Data;

import java.util.List;

/**
 * 导出excel的结果
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/6/5 19:58
 */
@Data
public class ResultExcelBO {
    private String fileName;
    private String filePath;
    private List<List<Object>> contentList;

    public ResultExcelBO(){}

    public ResultExcelBO(String fileName, String filePath, List<List<Object>> contentList) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.contentList = contentList;
    }
}
