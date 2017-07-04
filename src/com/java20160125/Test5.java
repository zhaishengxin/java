package com.java20160125;
/*5.  编写例子，演示子类隐藏父类属性和重写父类方法的效果。 并演示出子类访问任何属性和方法时都默认先在
本类中寻找，找不到才到父类中寻找。*/
class Computer5{
	String brand;
	String color="黑色";
	int scrnsize;//显示器尺寸大小
	void playGame(){
		System.out.println("打游戏");
	}
}
class Laptop5 extends Computer5{
	String color="炫酷黑色";
	int djtime;//待机时长
	void playGame(){
		System.out.println("到处打游戏");
	}
}
class Desktop5 extends Computer5{
	int zjsize;//主机箱大小
}
public class Test5 {
	public static void main(String[] args) {
		Computer5 c=new Computer5();
		System.out.println(c.color);
		c.playGame();
		Laptop5 l=new Laptop5();
		System.out.println(l.color);
		l.playGame();
		Desktop5 d=new Desktop5();
		System.out.println(d.color);
		d.playGame();
	}
}
