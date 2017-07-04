package com.java20160125;
//4.  定义一个笔记本类，再定义一个台式机类，把这两个类的共性上提到电脑类中。再让它们分别继承电脑类.
class Computer{
	String brand;
	String color;
	int scrnsize;//显示器尺寸大小
}
class Laptop extends Computer{
	int djtime;//待机时长
}
class Desktop extends Computer{
	int zjsize;//主机箱大小
}
public class Test4 {
	public static void main(String[] args) {
		Computer c=new Computer();
		Desktop d= new Desktop();
		Laptop l=new Laptop();
	}
}
