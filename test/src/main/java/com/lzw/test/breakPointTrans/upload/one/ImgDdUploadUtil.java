package com.lzw.test.breakPointTrans.upload.one;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;

/**
 * @Author
 * @ClassName ImgDdUploadUtil
 * @Description TODO
 * @Date 2018/11/9 15:46
 * @Version 1.0
 */
public class ImgDdUploadUtil {
    /**
     * 获取已上传的文件大小
     *
     * @param request
     * @param
     */
    public static Long getChunkedFileSize(HttpServletRequest request) {
        //存储文件的路径，根据自己实际确定
        String currentFilePath = "E:\\front\\fileUpload\\tinyImgUpload-master\\20181109\\";
//        PrintWriter print = null;
        try {
            request.setCharacterEncoding("utf-8");
//            print = response.getWriter();
            String fileName = new String(request.getParameter("fileName").getBytes("ISO-8859-1"), "UTF-8");
            String lastModifyTime = request.getParameter("lastModifyTime");
            File file = new File(currentFilePath + fileName + "." + lastModifyTime);
            if (file.exists()) {
                return file.length();
            } else {
                return -1L;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 断点文件上传 1.先判断断点文件是否存在 2.存在直接流上传 3.不存在直接新创建一个文件 4.上传完成以后设置文件名称
     */
    public static Long appendUpload2Server(HttpServletRequest request) {
        try {
            request.setCharacterEncoding("utf-8");
            String fileSize = request.getParameter("fileSize");
//            long totalSize = StringUtil.toLong(fileSize);
            Long totalSize = 0L;
            if (fileSize != null && !fileSize.equals("")) {
                totalSize = Long.valueOf(fileSize);
            }
            RandomAccessFile randomAccessfile = null;
            long currentFileLength = 0;// 记录当前文件大小，用于判断文件是否上传完成
            String currentFilePath = "E:\\front\\fileUpload\\tinyImgUpload-master\\20181109";// 记录当前文件的绝对路径

            String fileName = new String(request.getParameter("fileName").getBytes("UTF-8"), "UTF-8");
            String lastModifyTime = request.getParameter("lastModifyTime");

            String filela = fileName.substring(fileName.lastIndexOf("."), fileName.length());//文件后缀
            String filef = fileName.substring(0, fileName.lastIndexOf("."));//文件前缀

//            File file = new File(currentFilePath+fileName+"."+lastModifyTime);

            File file = new File(currentFilePath+"/" + filef +"_"+ lastModifyTime + filela);
            // 存在文件
            if (file.exists()) {
                randomAccessfile = new RandomAccessFile(file, "rw");
            } else {
                // 不存在文件，根据文件标识创建文件
                randomAccessfile = new RandomAccessFile(currentFilePath+"/" + filef +"_"+ lastModifyTime + filela, "rw");
            }
            // 开始文件传输
            InputStream in = request.getInputStream();
            randomAccessfile.seek(randomAccessfile.length());
            byte b[] = new byte[1024];
            int n;
            while ((n = in.read(b)) != -1) {
                Thread.sleep(1000);
                randomAccessfile.write(b, 0, n);
            }

            currentFileLength = randomAccessfile.length();

            // 关闭文件
            closeRandomAccessFile(randomAccessfile);
            randomAccessfile = null;
            // 整个文件上传完成,修改文件后缀
//            if (currentFileLength == totalSize) {
//                File oldFile = new File(currentFilePath + fileName + "." + lastModifyTime);
//                File newFile = new File(currentFilePath + fileName);
//                if (!oldFile.exists()) {
//                    return -1L;//重命名文件不存在
//                }
//                if (newFile.exists()) {// 如果存在形如test.txt的文件，则新的文件存储为test+当前时间戳.txt, 没处理不带扩展名的文件
//                    String newName = fileName.substring(0, fileName.lastIndexOf("."))
//                            + System.currentTimeMillis() + "."
//                            + fileName.substring(fileName.lastIndexOf(".") + 1);
//                    newFile = new File(currentFilePath + newName);
//                }
//                if (!oldFile.renameTo(newFile)) {
//                    oldFile.delete();
//                }
//
//            }
            return currentFileLength;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭随机访问文件
     *
     * @param
     */
    public static void closeRandomAccessFile(RandomAccessFile rfile) {
        if (null != rfile) {
            try {
                rfile.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

