package com.java20160223;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

/*3. ����һ��ѧ���࣬�����������ĳɼ�����ѧ�ɼ���Ӣ��ɼ��ĸ����ԡ�
���5��ѧ������TreeSet�У�Ҫ����ѧ����ƽ���ɼ��Ľ������У����
ƽ���ɼ���ȣ��ٸ����������������У������еĽ������E:\a.txt�С�*/
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
			throw new RuntimeException("�ⲻ��ѧ����");
		}
		Student1 s = (Student1)obj;
		int r = new Double(chineseScore+mathScore+englishScore).compareTo(s.chineseScore+s.mathScore+s.englishScore);
		if(r == 0) {
			return -name.compareTo(s.name);
		}
		return r;
	}
}
public class Test3��ŵ�c�� {
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
		System.out.println("�����Ѵ���e:\\a.txt");
//		InputStream in=new FileInputStream("e:\\a.txt");
//		ObjectInputStream ois=new ObjectInputStream(in);
//		Set s=(Set)ois.readObject();
//		System.out.println(s);
//		ois.close();
	}
}
