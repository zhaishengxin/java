package com.java20160217;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//1. 倒序输出一个文本文件中的内容.
public class Test1倒序输出一个文本文件中的内容 {
	public static void main(String[] args) throws Exception {
		InputStream in=new FileInputStream("E:\\1.txt");
		OutputStream out=new FileOutputStream("E:\\2.txt");
		int n;
		int count=in.available();
		for (int i = 1; i <count+1; i++) {
			in.skip(in.available()-i);
			System.out.println((char)(in.read()));
			n=(char)(in.read());
			out.write(n);
		}
	
		in.close();
		out.close();
	}
}
