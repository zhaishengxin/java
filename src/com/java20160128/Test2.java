package com.java20160128;
/*2. 写出例子，演示以下规则
3.	向上转型发生时，调用的属性只和引用类型有关!(静态绑定)
4.	向上转型发生时，调用的静态方法只和引用有关!(静态绑定)
*/
class A{
	int a=1;
	static void f1(){
		System.out.println("aaaaa");
	}
}
class B extends A{
	int a=2;
	static void f1(){
		System.out.println("bbbbb");
	}
}
class C extends B{
	int a=3;
	static void f1(){
		System.out.println("cccccc");
	}
}
public class Test2 {
	public static void main(String[] args) {
		A b=new B();
		B c_1=new C();
		A c_2=new C();
		System.out.println(b.a);
		System.out.println(c_1.a);
		System.out.println(c_2.a);
		b.f1();
		c_1.f1();
		c_2.f1();
	}
}
