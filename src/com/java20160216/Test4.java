package com.java20160216;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//4. ֻ��ȡ�ļ��е����һ���ֽ�.
public class Test4 {
	public static void main(String[] args) throws IOException {
		InputStream in=new FileInputStream("E:\\a4.txt");
		in.skip(in.available()-1);
		System.out.println((char)(in.read()));
		
		in.close();
	}
}
