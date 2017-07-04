package com.java20160128;
/*5. 有代码如下:

问，在X中需要实现几个方法，分别是什么?*/
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
