package com.java20160217;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

//2. ��һ���ı��ļ��е������У������˳�������
public class Test2��һ���ı��ļ��е������� {
	public static void main(String[] args) throws Exception {
		Reader in=new FileReader("e:\\1.txt");
		BufferedReader br=new BufferedReader(in);
		String str="";
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
	}
}
