package java2;
//4. ��д����֤��static���ε������Ǳ�������ж�����ġ�
class Cat{
	static String color;
	int age;
}
public class Test4_1static���ε����� {
	public static void main(String[] args) {
		Cat c1=new Cat();
		c1.color="red";
		c1.age=2;
		Cat c2=new Cat();
		c2.color="blue";
		c2.age=3;
		System.out.println(c1.color+c1.age);
		System.out.println(c2.color+c2.age);
	}
}
