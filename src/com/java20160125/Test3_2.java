package com.java20160125;
/*3.  ��֤���ۣ�
�����ͺͷ�װ���java.lang.String��Ϊ�����Ĳ��������Բ���Ӱ��ʵ�ʲ���������������Ϊ������������Ӱ��    ʵ�ʲ���!*/
public class Test3_2 {
	static void f1(Integer i){
		i=10;
	}
	public static void main(String[] args) {
		Integer i=new Integer(5);
		f1(5);
		System.out.println(i);
	}
}
