package com.lzw.common.core.manager;

import com.lzw.common.core.bo.ExcelPathBO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Excel相关
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/6/5 19:31
 */
public interface ExcelManager {

    /**
     * 导出excel
     * @param dataList 要导出的数据
     * @param excelPathBO excel模板的路径
     * @param lineIndex 哪一行开始写入内容
     * @param response
     */
    void downloadExcel(List<?> dataList, ExcelPathBO excelPathBO, int lineIndex, HttpServletResponse response);

    /**
     * 导出excel
     * @param excelPathBO excel模板的路径
     * @param dataList 要导出的数据
     * @param response
     */
    void downloadExcel(List<?> dataList, ExcelPathBO excelPathBO, HttpServletResponse response);

    /**
     * 自定义表头的导出
     * @param headers 表头
     * @param dataList 数据
     * @param response
     */
    void downloadExcel(List<String> headers, List<List<Object>> dataList, HttpServletResponse response);
}
