package com.java20160128;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//1. 从键盘输入自己的生日字符串，把该字符串解析为java.util.Date
public class Test1 {
	public static void main(String[] args) throws ParseException{
		Scanner in=new Scanner(System.in);
		System.out.println("请输入自己的生日，格式为1980-01-01");
		String birthday=in.next();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(birthday);
		System.out.println(date);
	}
}
