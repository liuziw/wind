package com.lzw.test.breakPointTrans.download.test;


import java.io.*;

public class ReadTest {
	public static void main(String[] args) {
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(new File("C:\\Users\\wds\\Desktop\\testsuccess.tmp")));
			int count = input.readInt();
			long [] startPos = new long[count];
			long [] endPos = new long[count];
			for(int i = 0; i < count; i++){
				startPos[i] = input.readLong();
				endPos[i] = input.readLong();
			}
			
			for(long i : startPos){
				System.out.println(i);
			}
			
			for(long j : endPos){
				System.out.println(j);
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
