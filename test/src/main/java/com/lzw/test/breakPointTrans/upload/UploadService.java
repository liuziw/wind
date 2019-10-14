package com.lzw.test.breakPointTrans.upload;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;

import static com.lzw.test.breakPointTrans.upload.one.ImgDdUploadUtil.closeRandomAccessFile;

/**
 * @author liuziw
 * @date 2019/9/2 17:13
 */
@Service
public class UploadService {

    public Long upload(MultipartFile multipartFile,String lastModifyTime){
        try{
        String fileName = multipartFile.getOriginalFilename();
        Long fileSize = multipartFile.getSize();
        Long totalSize = 0L;
        if (fileSize != null && !fileSize.equals("")) {
            totalSize = Long.valueOf(fileSize);
        }
        RandomAccessFile randomAccessfile = null;
        long currentFileLength = 0;// 记录当前文件大小，用于判断文件是否上传完成
        String currentFilePath = "E:\\front\\fileUpload\\tinyImgUpload-master\\20181109";// 记录当前文件的绝对路径


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
        InputStream in = multipartFile.getInputStream();
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

}
