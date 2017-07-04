package com.java20160223;

import java.util.HashMap;
import java.util.Map;

/*2. 定义一个学生类，有学号、姓名、年龄三个属性。
一个学生对应一个住址，要求以学生对象作为键值，学生住址作为值，添加5个学生
到HashMap中。保证学号、姓名、年龄都相同的学生只加一个。
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
		Student s1=new Student(1,"张一",24);
		Student s2=new Student(2,"张二",25);
		Student s3=new Student(3,"张三",26);
		Student s4=new Student(4,"张四",27);
		Student s5=new Student(4,"张四",27);
		Map map=new HashMap();
		map.put(s1, "北大街");
		map.put(s2, "南大街");
		map.put(s3, "东大街");
		map.put(s4, "西大街");
		map.put(s5, "北大街");
		System.out.println(map);
		System.out.println(map.size());
	}
}
