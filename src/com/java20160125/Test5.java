package com.java20160125;
/*5.  ��д���ӣ���ʾ�������ظ������Ժ���д���෽����Ч���� ����ʾ����������κ����Ժͷ���ʱ��Ĭ������
������Ѱ�ң��Ҳ����ŵ�������Ѱ�ҡ�*/
class Computer5{
	String brand;
	String color="��ɫ";
	int scrnsize;//��ʾ���ߴ��С
	void playGame(){
		System.out.println("����Ϸ");
	}
}
class Laptop5 extends Computer5{
	String color="�ſ��ɫ";
	int djtime;//����ʱ��
	void playGame(){
		System.out.println("��������Ϸ");
	}
}
class Desktop5 extends Computer5{
	int zjsize;//�������С
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
