package com.lzw.test.file;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.UUID;

public class Test {
    private static String localPath = "D:\\data\\iqc\\";

    /**
     * 跑这个main方法
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String path = downLoadFromUrl("http://47.107.159.29/iqc-pc/uploadInfo/download?id=34407", "1.mp3");
        System.out.println(path);
    }

    /**
     * 从网络Url中下载文件
     * @param urlStr
     * @param fileName
     * @throws IOException
     */
    public static String downLoadFromUrl(String urlStr,String fileName) throws Exception {
        //存储的文件名
        String uuidName = fileName;
        URL url = url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        //设置超时间为3秒
        conn.setConnectTimeout(3*1000);
        //防止屏蔽程序抓取而返回403错误
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
        //得到输入流
        InputStream inputStream = conn.getInputStream();
        //获取自己数组
        byte[] getData = new byte[0];
        try {
            getData = readInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件保存位置
        String savePath = localPath;
        File saveDir = new File(savePath);
        if(!saveDir.exists()){
            saveDir.mkdirs();
        }
        File file = new File(saveDir+File.separator+uuidName);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.write(getData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(fos!=null){
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(inputStream!=null){
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return savePath + uuidName;
    }


    public static byte[] readInputStream(InputStream inputStream) throws IOException {
        byte[] buffer = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while((len = inputStream.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        bos.close();
        return bos.toByteArray();
    }
}
