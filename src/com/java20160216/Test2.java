package com.java20160216;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//2. 把两个文件中的内容，复制到1个文件中。
public class Test2 {
	public static void main(String[] args) throws IOException {
		Reader in=new FileReader("E:\\a.txt");
		Reader  in1=new FileReader("E:\\b.txt");
		Writer  out=new FileWriter("E:\\c.txt");
		int n;
		while((n=in.read())!=-1){
			out.write((char)n);
		}
		while((n=in1.read())!=-1){
			out.write((char)n);
		}
		in.close();
		in1.close();
		out.close();
	}
}
