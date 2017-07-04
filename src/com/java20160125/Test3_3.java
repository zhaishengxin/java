package com.java20160125;
/*3.  验证结论：
简单类型和封装类和java.lang.String作为方法的参数，绝对不会影响实际参数。复合类型作为方法参数，会影响    实际参数!*/
public class Test3_3 {
	static void f1(int a){
		a=10;
	}
	public static void main(String[] args) {
		int a=6;
		f1(a);
		System.out.println(a);
	}
}
