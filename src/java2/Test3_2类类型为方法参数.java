package java2;
/*3. ��д���ӣ���ʾ��������Ϊ������������Ӱ��ʵ�Ρ���������
Ϊ����������Ӱ��ʵ�Ρ��������ڴ�ͼ��*/
class Dog{
	String nick;
	int age;
}
public class Test3_2������Ϊ��������{
	static void f1(Dog a){
		a.age=10;
	}
	public static void main(String[] args) {
		Dog a=new Dog();
		a.age=5;
		f1(a);
		System.out.println(a.age);
	}
}
