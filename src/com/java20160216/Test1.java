package com.java20160216;
//1. ����E:\\1.txt, ����ΪD:\\2.txt��C:\\3.txt
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

class Test1 {
	public static void main(String[] args) throws IOException {
		Reader in=new FileReader("E:\\1.txt");
		Writer  out=new FileWriter("C:\\3.txt");
		Writer  out1=new FileWriter("D:\\2.txt");
		int n;
		while((n=in.read())!=-1){
			out.write((char)n);
			out1.write((char)n);
		}
		in.close();
		out.close();
		out1.close();
	}
}
