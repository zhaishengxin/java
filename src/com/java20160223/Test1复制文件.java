package com.java20160223;
//1. 复制E:\1.txt到E:\2.txt
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class Test1复制文件 {
	public static void main(String[] args) throws Exception {
		Reader in=new FileReader("e:\\1.txt");
		Writer out=new FileWriter("e:\\2.txt");
		int n=0;
		char[] c=new char[10];
		while((n=in.read(c))!=-1){
			out.write(c, 0, n);
		}
		in.close();
		out.close();
	}
	Map map = new HashMap();
}
