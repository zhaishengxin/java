package com.java20160128;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//1. �Ӽ��������Լ��������ַ������Ѹ��ַ�������Ϊjava.util.Date
public class Test1 {
	public static void main(String[] args) throws ParseException{
		Scanner in=new Scanner(System.in);
		System.out.println("�������Լ������գ���ʽΪ1980-01-01");
		String birthday=in.next();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(birthday);
		System.out.println(date);
	}
}
