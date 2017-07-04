package java2;
/*3. 编写例子，演示简单类型作为方法参数不会影响实参。类类型作
为方法参数会影响实参。并画出内存图。*/
class Dog{
	String nick;
	int age;
}
public class Test3_2类类型为方法参数{
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
