//3. �Ӽ�������һ����ݣ���������2���м���, �����ж�����ķ�����ֻ��ʹ��Calendar��api����!
package com.java20160127;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("���������");
		int year=in.nextInt();
		Calendar cal=Calendar.getInstance();
		//cal.set(year,Calendar.DECEMBER,31);//��������������ݵ����ڡ�
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,11);
		cal.set(Calendar.DATE,31);
		if(cal.get(Calendar.DAY_OF_YEAR)==366){
		System.out.println(year+"��������");
		}else{
		System.out.println(year+"��ƽ��");
		}
	}
}
