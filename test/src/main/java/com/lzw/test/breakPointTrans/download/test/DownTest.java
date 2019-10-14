package com.lzw.test.breakPointTrans.download.test;


import com.lzw.test.breakPointTrans.download.action.DownFile;
import com.lzw.test.breakPointTrans.download.bean.SiteInfo;

public class DownTest {
	
	public static void main(String args[]){
		SiteInfo siteInfo = new SiteInfo("http://localhost:8080/img/test.docx", "C:/Users/wds/Desktop", "testsuccess.doc", 3);
		
		DownFile downFile = new DownFile(siteInfo);
		
		downFile.startDown();
	}
	
}
