package com.java20160216;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//3. ����BufferedWriter��BufferedReader�����������������ı��ļ�. 
public class Test3 {
	public static void main(String[] args) throws IOException {
		Reader in=new FileReader("E:\\a3.txt");
		BufferedReader br=new BufferedReader(in);
		Writer out =new FileWriter("E:\\b3.txt");
		BufferedWriter bw=new BufferedWriter(out);
		String line="";
		while((line=br.readLine())!=null){
			bw.write(line);
		}
		br.close();
		bw.close();
	}
}
