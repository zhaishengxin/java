package com.java20160223;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

/*3. 定义一个学生类，有姓名、语文成绩、数学成绩、英语成绩四个属性。
添加5个学生进入TreeSet中，要求按照学生的平均成绩的降序排列，如果
平均成绩相等，再根据姓名的升序排列，将排列的结果存入E:\a.txt中。*/
class Student1  implements Comparable,Serializable {
	String name;
	double chineseScore;
	double mathScore;
	double englishScore;
	public Student1(String name, double chineseScore, double mathScore, double englishScore) {
		super();
		this.name = name;
		this.chineseScore = chineseScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", chineseScore=" + chineseScore + ", mathScore=" + mathScore
				+ ", englishScore=" + englishScore + "]";
	}
	public int compareTo(Object obj) {
		if(!(obj instanceof Student1)) {
			throw new RuntimeException("这不是学生！");
		}
		Student1 s = (Student1)obj;
		int r = new Double(chineseScore+mathScore+englishScore).compareTo(s.chineseScore+s.mathScore+s.englishScore);
		if(r == 0) {
			return -name.compareTo(s.name);
		}
		return r;
	}
}
public class Test3存放到c盘 {
	public static void main(String[] args) throws Exception {
		Student1 s1=new Student1("a",90,91,92);
		Student1 s2=new Student1("b",46,33,32);
		Student1 s3=new Student1("c",46,32,33);
		Student1 s4=new Student1("d",45,32,88);
		Student1 s5=new Student1("e",88,32,56);
		Set<Student1> set = new TreeSet<Student1>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		OutputStream out=new FileOutputStream("e:\\a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(out);
		oos.writeObject(set);
		oos.close();
		System.out.println("数据已存入e:\\a.txt");
//		InputStream in=new FileInputStream("e:\\a.txt");
//		ObjectInputStream ois=new ObjectInputStream(in);
//		Set s=(Set)ois.readObject();
//		System.out.println(s);
//		ois.close();
	}
}
