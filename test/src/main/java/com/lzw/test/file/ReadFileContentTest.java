package com.lzw.test.file;

import java.io.*;

public class ReadFileContentTest {

    public static String readFileContent(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        StringBuffer sbf = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempStr;
            while ((tempStr = reader.readLine()) != null) {
                sbf.append(tempStr);
            }
            reader.close();
            return sbf.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return sbf.toString();
    }

    public static String txt2String(String filePath){
        File file = new File(filePath);
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }

    public static String txt2StringUTF8(String filePath){
        String s = null;
        StringBuilder result = new StringBuilder();
        try {
            File file = new File(filePath);
            InputStreamReader read = new InputStreamReader(new FileInputStream(file), "GBK");
            //构造一个BufferedReader类来读取文件
            BufferedReader br = new BufferedReader(read);
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(System.lineSeparator()+s);
            }
            if (br != null) {
                br.close();
            }
        } catch (Exception e) {
            try {
                throw new IOException();
            } catch (Exception ex) {
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Administrator\\Desktop\\crm_visit20200107.del";
        String content = txt2StringUTF8(filePath);
        //根据换行符分割
        String [] arr = content.split(System.lineSeparator());
        System.out.println(content);
    }
}
