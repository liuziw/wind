package com.lzw.test.breakPointTrans.upload.two;


public class FileSendTest{//发送方

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SendFileThread sf=new SendFileThread();
        sf.start();
    }

}
