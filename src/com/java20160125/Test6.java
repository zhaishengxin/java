package com.java20160125;
/*6.  ��Щ���ӣ���ʾ����ʵ������6�����裬 ͬʱ�����������͸����ж��ж����̬�飬�����������ʱ��ִ��
���Ⱥ�˳������ô����*/
class A {
	static {
		System.out.println("A�ľ�̬��1");
	}
	static {
		System.out.println("A�ľ�̬��2");
	}
	
	{
		System.out.println("A�Ŀ�1");
	}
	{
		System.out.println("A�Ŀ�2");
	}
	A() {
		System.out.println("A�Ĺ�����");
	}
}
class B extends A {
	static {
		System.out.println("B�ľ�̬��1");
	}
	static {
		System.out.println("B�ľ�̬��2");
	}
	
	{
		System.out.println("B�Ŀ�1");
	}
	{
		System.out.println("B�Ŀ�2");
	}
	B() {
		System.out.println("B�Ĺ�����");
	}
}
public class Test6 {
	public static void main(String[] args) {
		B b=new B();
	}
}
