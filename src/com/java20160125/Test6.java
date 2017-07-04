package com.java20160125;
/*6.  编些例子，演示子类实例化额6个步骤， 同时测试如果子类和父类中都有多个静态块，多个构造代码块时，执行
的先后顺序是怎么样的*/
class A {
	static {
		System.out.println("A的静态块1");
	}
	static {
		System.out.println("A的静态块2");
	}
	
	{
		System.out.println("A的块1");
	}
	{
		System.out.println("A的块2");
	}
	A() {
		System.out.println("A的构造器");
	}
}
class B extends A {
	static {
		System.out.println("B的静态块1");
	}
	static {
		System.out.println("B的静态块2");
	}
	
	{
		System.out.println("B的块1");
	}
	{
		System.out.println("B的块2");
	}
	B() {
		System.out.println("B的构造器");
	}
}
public class Test6 {
	public static void main(String[] args) {
		B b=new B();
	}
}
