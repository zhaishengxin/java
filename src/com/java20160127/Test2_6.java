package com.java20160127;
//��д�����ӷֱ���ʾ�������غͷ�����д!
class A{
	void f1(){
		System.out.println("aa");
	}
}
class B extends A{
	void f1(){											//������д
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
