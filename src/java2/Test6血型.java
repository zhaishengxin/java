package java2;
//6. ������ҵ1��Person���е�Ѫ�����ԣ���֤Ѫ��ֻ����A B AB O���е�һ�֡�
class Person1_1{
	String name;
	String gender;
	int age;
	private String bloodType;
	public void f1(String nm,String gnd,int a,String bt){
		name=nm;
		gender=gnd;
		age=a;
		if(bt=="O"||bt=="A"||bt=="AB"||bt=="B"){
			bloodType=bt;
		}else{
			throw new RuntimeException("�Ƿ�Ѫ��"+bt);
		}
	}
	void print(){
		System.out.println(" ���֣�"+name);
		System.out.println(" �Ա�"+gender);
		System.out.println(" ���䣺"+age);
		System.out.println(" Ѫ�ͣ�"+bloodType);
	}
}
public class Test6Ѫ�� {
	public static void main(String[] args) {
		Person1_1 p=new Person1_1();
		p.f1("С��","��",26,"C");
		p.print();
	}
}
