package com.java20160125;
//8.  ��д������ʾsuper��3������ 1ͨ��super����ֱ�ӵ��ø��������,����
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
