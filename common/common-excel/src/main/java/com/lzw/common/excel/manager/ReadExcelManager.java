package com.lzw.common.excel.manager;

import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2019/4/11 10:06
 *
 * 读取上传的excel
 *
 */
public interface ReadExcelManager {

    /**
     * 获取sheet列表
     * @param filePath excel路径
     * @return
     */
    public ArrayList<String> getSheetList(String filePath);

    /**
     * 读取Excel文件数据
     * @param filePath excel路径
     * @param sheetIndex sheet索引，从0开始
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(String filePath, int sheetIndex);

    /**
     * 读取Excel文件数据
     * @param filePath excel路径
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(String filePath);

    /**
     * 读取Excel文件数据
     * @param file excel文件
     * @param sheetIndex sheet索引，从0开始
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(MultipartFile file, int sheetIndex);

    /**
     * 读取Excel文件数据
     */
    public ArrayList<ArrayList<String>> readExcel(MultipartFile file, int sheetIndex, String row);

    /**
     * 读取Excel文件数据
     * @param file excel文件
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(MultipartFile file);

    /**
     * 读取Excel文件数据
     * @param filePath 文件路径
     * @param sheetIndex sheet索引，从0开始
     * @param rows 从第几行开始读
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(String filePath, int sheetIndex, String rows);

    /**
     * 读取Excel文件数据
     * @param filePath 文件路径
     * @param sheetIndex sheet索引
     * @param columns 从第几列还是读
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(String filePath, int sheetIndex, String[] columns);

    /**
     * 读取Excel文件数据
     * @param filePath 文件路径
     * @param sheetIndex sheet索引
     * @param rows 从第几行开始读
     * @param columns 从第几列开始读
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(String filePath, int sheetIndex, String rows, String columns);

    /**
     * 读取Excel文件内容
     * @param file 文件
     * @param sheetIndex sheet索引
     * @param rows 从第几行开始读
     * @param columns 从第几列开始读
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(MultipartFile file, int sheetIndex, String rows, String columns);

    /**
     * 读取Excel文件数据
     * @param filePath 文件路径
     * @param sheetIndex sheet索引
     * @param rows 从第几行开始读
     * @param columns 要读取的列
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(String filePath, int sheetIndex, String rows, String[] columns);

    /**
     * 读取Excel文件数据
     * @param filePath 文件路径
     * @param sheetIndex sheet索引
     * @param rows 从第几行开始读
     * @param cols 要读取的列
     * @return
     */
    public ArrayList<ArrayList<String>> readExcel(String filePath, int sheetIndex, String rows, int[] cols);


}
