package com.java20160125;
/*3.  验证结论：
简单类型和封装类和java.lang.String作为方法的参数，绝对不会影响实际参数。复合类型作为方法参数，会影响    实际参数!*/
public class Test3_2 {
	static void f1(Integer i){
		i=10;
	}
	public static void main(String[] args) {
		Integer i=new Integer(5);
		f1(5);
		System.out.println(i);
	}
}
