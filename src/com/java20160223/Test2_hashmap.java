package com.java20160223;

import java.util.HashMap;
import java.util.Map;

/*2. ����һ��ѧ���࣬��ѧ�š������������������ԡ�
һ��ѧ����Ӧһ��סַ��Ҫ����ѧ��������Ϊ��ֵ��ѧ��סַ��Ϊֵ�����5��ѧ��
��HashMap�С���֤ѧ�š����������䶼��ͬ��ѧ��ֻ��һ����
*/
class Student{
	int no;
	String name;
	int age;
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	public Student(int no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		return true;
	}
	
}
public class Test2_hashmap {
	public static void main(String[] args) {
		Student s1=new Student(1,"��һ",24);
		Student s2=new Student(2,"�Ŷ�",25);
		Student s3=new Student(3,"����",26);
		Student s4=new Student(4,"����",27);
		Student s5=new Student(4,"����",27);
		Map map=new HashMap();
		map.put(s1, "�����");
		map.put(s2, "�ϴ��");
		map.put(s3, "�����");
		map.put(s4, "�����");
		map.put(s5, "�����");
		System.out.println(map);
		System.out.println(map.size());
	}
}
