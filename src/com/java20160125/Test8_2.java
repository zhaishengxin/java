package com.java20160125;
/*//8.  编写例子演示super的3个作用  调用构造器
我们知道，一个类中没有定义任何构造器的时候，编译器会默认为这个类生产一个无参构造器。
而每一个构造器都会自动在第一句调用super(),  super()这个写法的作用是，调用父类的无参构造器!*/
class Farther2{
	Farther2(){
		System.out.println("你");
	}
}
class Son2 extends Farther2{
	public Son2(){
		super();//写不写都可以
		System.out.println("好");
	}
}
public class Test8_2 {
	public static void main(String[] args) {
		Son2 s=new Son2();
	}
}
