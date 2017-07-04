package com.java20160217;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

//3. �Զ���һ���࣬�ֱ���ObjectOutputStream��ObjectInputStream�Ѹ���Ķ�����д���ļ����ٴ��ļ��ж�ȡ������
class Person implements Serializable {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
public class Test3ObjectOutputStream {
	public static void main(String[] args) throws Exception {
		Person p=new Person("Mr.zhai", 26);
		OutputStream out=new FileOutputStream("e:\\1.txt");
		ObjectOutputStream  oos=new ObjectOutputStream(out);
		oos.writeObject(p);
		oos.close();
		InputStream in=new FileInputStream("e:\\1.txt");
		ObjectInputStream ois=new ObjectInputStream(in);
		System.out.println((Person)(ois.readObject()));
		ois.close();
	}
}
