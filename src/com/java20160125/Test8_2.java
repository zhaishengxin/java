package com.java20160125;
/*//8.  ��д������ʾsuper��3������  ���ù�����
����֪����һ������û�ж����κι�������ʱ�򣬱�������Ĭ��Ϊ���������һ���޲ι�������
��ÿһ�������������Զ��ڵ�һ�����super(),  super()���д���������ǣ����ø�����޲ι�����!*/
class Farther2{
	Farther2(){
		System.out.println("��");
	}
}
class Son2 extends Farther2{
	public Son2(){
		super();//д��д������
		System.out.println("��");
	}
}
public class Test8_2 {
	public static void main(String[] args) {
		Son2 s=new Son2();
	}
}
