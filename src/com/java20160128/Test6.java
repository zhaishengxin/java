package com.java20160128;
//6. 人演奏乐器.  对照的人喂动物写。

class Person1 {
	void f(Instrument a) {
		System.out.println("人演奏");
		a.play();
	}
}
interface Instrument {
	public void play();
}
class Pino  implements Instrument{
	public void play() {
		System.out.println("钢琴");
	}
}
class Xiao implements Instrument {
	public void play() {
		System.out.println("箫~");
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
