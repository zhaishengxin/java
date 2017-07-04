package com.java20160125;
//7.  定义一个Dog类，属性方法自拟，保证Dog的equals方法是用来比较内容的，保证Dog的toString方法是用来访问对象内 容的
class Dog{
	String nick;
	int age;
	public boolean equals(Object obj) {
		Dog d=(Dog)obj;
        return (nick.equals(d.nick))&&(age==d.age);
    }
	public String toString(){
		return "Dog[nick="+nick+",age="+age+"]";
	}
}
public class Test7 {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.nick="aa";
		d1.age=10;
		Dog d2=new Dog();
		d2.nick="aa";
		d2.age=10;
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2)); 
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}
}
