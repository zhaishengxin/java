package com.java20160125;
//4.  ����һ���ʼǱ��࣬�ٶ���һ��̨ʽ���࣬����������Ĺ������ᵽ�������С��������Ƿֱ�̳е�����.
class Computer{
	String brand;
	String color;
	int scrnsize;//��ʾ���ߴ��С
}
class Laptop extends Computer{
	int djtime;//����ʱ��
}
class Desktop extends Computer{
	int zjsize;//�������С
}
public class Test4 {
	public static void main(String[] args) {
		Computer c=new Computer();
		Desktop d= new Desktop();
		Laptop l=new Laptop();
	}
}
