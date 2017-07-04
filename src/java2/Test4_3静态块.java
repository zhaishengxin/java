package java2;
//编写例子，演示静态块在类被加载时自动执行，且在整个程序期间只运行一次
class Cat3{
	 static {
		System.out.println("a");
	}
	{
		System.out.println("b");
	}
	Cat3(){
		System.out.println("c");
	}
	 
}
public class Test4_3静态块 {
	public static void main(String[] args) {
		new Cat3();
		new Cat3();
	}
}