package java2;
/*1. 定义一个Person类，属性有name gender age bloodType（血型 ）
定义一个Person类的构造器，接收4个参数分别给三个属性赋值。
定义一个print方法，用来打印Person对象的各个属性值。*/


class Person{
	String name;
	String gender;
	int age;
	String bloodType;
	Person(String nm,String gnd,int a,String bt){
		name=nm;
		gender=gnd;
		age=a;
		bloodType=bt;
	}
	void print(){
		System.out.println(" 名字："+name);
		System.out.println(" 性别："+gender);
		System.out.println(" 年龄："+age);
		System.out.println(" 血型："+bloodType);
	}
}
public class Test1构造器 {
	public static void main(String[] args) {
		Person p=new Person("小马","男",26,"A");
		p.print();
	}
}
