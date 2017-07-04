package com.java20160125;
//8.  编写例子演示super的3个作用 1通过super可以直接调用父类的属性,方法
class Farther{
	int a=5;
	void f1(){
		System.out.println("aaa");
	}
}
class Son extends Farther{
	int a=10;
	void f1(){
		System.out.println("bbb");
	}
	void f2(){
		System.out.println(super.a);
		f1();
		super.f1();
	}
}
public class Test8 {
	public static void main(String[] args) {
		Son s=new Son();
		s.f2();
	}
}
