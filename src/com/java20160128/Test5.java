package com.java20160128;
/*5. �д�������:

�ʣ���X����Ҫʵ�ּ����������ֱ���ʲô?*/
interface A11 {
	void f1();
	void f2();
}
interface B1 {
	void f2();
	void f3();
}
class X implements A11,B1 {
	public void f3() {
	}
	public void f1() {
	}
	public void f2() {
	}
	
}
public class Test5 {
	public static void main(String[] args) {
		X x=new X();
	}
}
