//3. 从键盘输入一个年份，输出该年的2月有几天, 别用判断闰年的方法，只能使用Calendar的api来做!
package com.java20160127;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入年份");
		int year=in.nextInt();
		Calendar cal=Calendar.getInstance();
		//cal.set(year,Calendar.DECEMBER,31);//其他方法设置年份的日期。
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,11);
		cal.set(Calendar.DATE,31);
		if(cal.get(Calendar.DAY_OF_YEAR)==366){
		System.out.println(year+"年是闰年");
		}else{
		System.out.println(year+"年平年");
		}
	}
}
