package java2;
/*1. ����һ��Person�࣬������name gender age bloodType��Ѫ�� ��
����һ��Person��Ĺ�����������4�������ֱ���������Ը�ֵ��
����һ��print������������ӡPerson����ĸ�������ֵ��*/


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
		System.out.println(" ���֣�"+name);
		System.out.println(" �Ա�"+gender);
		System.out.println(" ���䣺"+age);
		System.out.println(" Ѫ�ͣ�"+bloodType);
	}
}
public class Test1������ {
	public static void main(String[] args) {
		Person p=new Person("С��","��",26,"A");
		p.print();
	}
}
