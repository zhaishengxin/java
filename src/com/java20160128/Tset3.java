package com.java20160128;

/*3. ��дһ��Person�࣬���Է������⣬��д����java.lang.Object��equals����
��֤equals�����бȽϵ������ݡ� �����ڱȽ�����֮ǰ��Ҫ���жϲ����ǲ���
Person���ʵ����������ǣ�ֱ�ӷ���false������ǣ�������Ƚ�����!*/
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
