package com.java20160216;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

//5. �ֱ������ַ��� �� �ֽ��� ����һ��ͼƬ�� ������һ����Ч����
public class Test5 {
	public static void main(String[] args) throws IOException {
		Reader in=new FileReader("E:\\a5.jpg");//ͼƬ����ʧ��
		Writer  out=new FileWriter("E:\\b5.jpg");
		int n;
		while((n=in.read())!=-1){
			out.write(n);
		}
		in.close();
		out.close();
		
		InputStream in1=new FileInputStream("E:\\a5.jpg");//ͼƬ���Ƴɹ�
		OutputStream out1=new FileOutputStream("E:\\c5.jpg");
		int n1;
		while((n1=in1.read())!=-1){
			out1.write(n1);
		}
		in1.close();
		out1.close();
	}
}
