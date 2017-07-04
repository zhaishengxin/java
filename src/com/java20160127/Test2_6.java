package com.java20160127;
//并写出例子分别演示方法重载和方法重写!
class A{
	void f1(){
		System.out.println("aa");
	}
}
class B extends A{
	void f1(){											//方法重写
		System.out.println("bb");
	}
}

public  class Test2_6 {
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.f1();
		b.f1();
	}
}
