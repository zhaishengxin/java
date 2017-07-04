package com.java20160128;

/*3. 编写一个Person类，属性方法自拟，重写父类java.lang.Object的equals方法
保证equals方法中比较的是内容。 但是在比较内容之前，要先判断参数是不是
Person类的实例，如果不是，直接返回false，如果是，则进而比较内容!*/
class Person{
	String name;
	int age;
	 public boolean equals(Object obj) {
		 if(obj instanceof Person){
		     Person a=(Person)obj;
	        return ((name.equals(a.name))&& (age==a.age));
	    }else return false;
	 }
	 void f1(){
			System.out.println("eat food");
		}
}
class Student extends Person{
	String school;
	int grade;
	void f1(){
		System.out.println("eat chicken");
	}
}
public class Tset3 {
	public static void main(String[] args) {
		Person p=new Student();
		Person p2=new Student();
		Student s=new Student();
		p.name="aa";p.age=1;
		p2.name="aa";p2.age=1;
		s.school="aa";s.grade=1;
		System.out.println(p.equals(p2));
		System.out.println(p.equals(s));
	}
}
