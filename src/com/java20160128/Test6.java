package com.java20160128;
//6. ����������.  ���յ���ι����д��

class Person1 {
	void f(Instrument a) {
		System.out.println("������");
		a.play();
	}
}
interface Instrument {
	public void play();
}
class Pino  implements Instrument{
	public void play() {
		System.out.println("����");
	}
}
class Xiao implements Instrument {
	public void play() {
		System.out.println("��~");
	}
}
public class Test6 {
	public static void main(String[] args) {
		Person1 p = new Person1();
		Pino pn = new Pino();
		Xiao x = new Xiao();
		p.f(pn);
		p.f(x);
	}
}
