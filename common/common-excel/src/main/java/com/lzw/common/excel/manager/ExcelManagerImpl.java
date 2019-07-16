package com.lzw.common.excel.manager;

import com.hyzs.common.excel.bo.BaseExcelBO;
import com.hyzs.common.excel.bo.ResultExcelBO;
import com.hyzs.gz.common.core.bo.ExcelPathBO;
import com.hyzs.gz.common.core.exception.CommonErrorCode;
import com.hyzs.gz.common.core.exception.CommonException;
import com.hyzs.gz.common.core.manager.ExcelManager;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author liuzw
 * @email liuzw1@hua-cloud.com.cn
 * @date 2018/6/5 20:01
 */
@Component
@Slf4j
public class ExcelManagerImpl implements ExcelManager {

    @Override
    public void downloadExcel(List<?> dataList, ExcelPathBO excelPathBO, HttpServletResponse response) {
        downloadExcel(dataList,excelPathBO,1,response);
    }

    @Override
    public void downloadExcel(List<?> dataList, ExcelPathBO excelPathBO, int lineIndex, HttpServletResponse response) {
        String fileName = excelPathBO.getFileName();
        String filePath = excelPathBO.getFilePath();
        ResultExcelBO resultExcelBO = new ResultExcelBO(fileName, filePath, null);

        //组装excel数据
        if(!CollectionUtils.isEmpty(dataList)) {
            List<List<Object>> contentList =  new ArrayList<>();

            for (Object object : dataList) {
                BaseExcelBO baseExcel = (BaseExcelBO) object;
                List<Object> businessLineList = baseExcel.toList();
                contentList.add(businessLineList);
            }
            resultExcelBO.setContentList(contentList);
        }

        //生成excel
        downloadExcel(resultExcelBO,lineIndex,response);
    }

    /**
     * 生成excel
     * @param resultExcel 上面selectAllToExcel方法得到的结果
     * @param lineIndex 哪一行开始写入内容
     * @return
     * @throws Exception
     */
    public void downloadExcel(ResultExcelBO resultExcel, int lineIndex, HttpServletResponse response) {
        String tempPath = null;
        ResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("classpath:"+resultExcel.getFilePath());
        Resource tempResource = loader.getResource("classpath:excel/");
        try{
            File file = new File(URLDecoder.decode(tempResource.getURL().getFile(),"UTF-8"));
            tempPath = file.getPath()+"/"+resultExcel.getFileName();
            File outFile = new File(tempPath);
//            FileCopyUtils.copy(new File(basePath), outFile);
            FileUtils.copyInputStreamToFile(resource.getInputStream(),outFile);
            //生成Excel
            writeExcel(tempPath, lineIndex, resultExcel.getContentList());
            log.warn("导出excel{}",resultExcel.getFileName());
        }catch (Exception e){
            e.printStackTrace();
            throw CommonException.exception(CommonErrorCode.PARAM_ERROR_CODE,"导出excel失败！");
        }


        //下载
        download(tempPath,response);

    }

    private void download(String path, HttpServletResponse response) {
        try {
            // path是指欲下载的文件的路径。
            File file = new File(path);
            // 取得文件名。
            String filename;
            filename = file.getName();
            // 以流的形式下载文件。
            InputStream fis = new BufferedInputStream(new FileInputStream(path));
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            fis.close();
            // 清空response
            response.reset();
            // 设置response的Header
            response.addHeader("Content-Disposition", "attachment;filename="
                    + new String(filename.getBytes("utf-8"),"iso-8859-1"));
            response.addHeader("Content-Length", "" + file.length());
            OutputStream toClient = new BufferedOutputStream(
                    response.getOutputStream());
            response.setContentType("application/vnd.ms-excel;charset=iso-8859-1");
            toClient.write(buffer);
            toClient.flush();
            toClient.close();
            file.delete(); // 下载完成后删除源文件
        } catch (IOException ex) {
            ex.printStackTrace();
            throw CommonException.exception(CommonErrorCode.DATA_NOT_FOUND_ERROR_CODE,"导出失败！");
        }
    }

    /**
     * 导出Excel(主要针对那种Excel已经存在，并且标题已经存在（或不需要标题），只是往excel中填充内容)
     * @param filePath 导出完整路径的文件名 例如 "D:/workbook.xls"
     * @param index 哪一行开始写入内容
     * @param contentList 内容
     */
    public void writeExcel(String filePath, int index, List<List<Object>> contentList) throws Exception{

        if(StringUtils.isEmpty(filePath)){
            throw new UnsupportedOperationException();
        }

        if(index<0){
            throw new UnsupportedOperationException();
        }

        FileInputStream fs = new FileInputStream(filePath);
        POIFSFileSystem ps = new POIFSFileSystem(fs);  // 使用POI提供的方法得到excel的信息
        Workbook wb = new HSSFWorkbook(ps);
        Sheet sheet = wb.getSheetAt(0);
        writeContent(filePath, wb, sheet, index, contentList);

    }

    /**
     * Excel中写入内容
     * @param filePath 文件路径
     * @param wb Workbook
     * @param sheet Sheet
     * @param index 写入内容的起始行
     * @param list 内容list
     */
    private void writeContent(String filePath, Workbook wb, Sheet sheet, int index, List<List<Object>> list){


//        CellStyle style = wb.createCellStyle();
//        style.setBorderLeft(BorderStyle.THIN);
//        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
//        style.setBorderRight(BorderStyle.THIN);
//        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
        //创建Excel内容
        if(!CollectionUtils.isEmpty(list)){
            int size = list.size();
            for(int i= 0; i< size; i++) {
                Row contentRow = sheet.createRow(i + index);
                List<Object> curLineList = list.get(i);
                if(!CollectionUtils.isEmpty(curLineList)){
                    int lineSize = curLineList.size();
                    for(int j=0; j<lineSize; j++){
                        if(null != curLineList.get(j)) {
                            contentRow.createCell(j).setCellValue(curLineList.get(j).toString());
                        }else{
                            contentRow.createCell(j).setCellValue("");
                        }
                    }
                }
            }
        }
        // Write the output to a file
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream(filePath);
            fileOut.flush();
            wb.write(fileOut);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(null != fileOut) {
                    fileOut.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 返回格式为yyyyMMddHHmmss的当前时间戳
     * @return
     */
    private String getCurrentStamp(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = sdf.format(date);
        return str;
    }
}
