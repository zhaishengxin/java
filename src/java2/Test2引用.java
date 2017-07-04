package java2;
/*2. 定义3个Person类的引用，让这3个引用指向同一个Person对象
演示：修改了其中某一个引用指向的对象的属性，其他两个引用
指向的这同一个对象的属性也会变化。*/

class Person2{
	String name;
	void print(){
		System.out.print(" 名字："+name);
	}
}
public class Test2引用 {
	public static void main(String[] args) {
		Person2 p1=new Person2();
		p1.name="小马";
		p1.print();
		Person2 p2=p1;
		p2.name="小胡";
		p2.print();
		Person2 p3=p2;
		p3.name="小高";//只要改变p3属性值，p2,p1的属性值都会随之改变。
		p1.print();
		p2.print();
		p3.print();
	}
}
