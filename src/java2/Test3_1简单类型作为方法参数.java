package java2;
/*3. 编写例子，演示简单类型作为方法参数不会影响实参。类类型作
为方法参数会影响实参。并画出内存图。*/
public class Test3_1简单类型作为方法参数 {
	static void f1(int a){
		a=10;
	}
	public static void main(String[] args) {
		int a=6;
		f1(a);
		System.out.println(a);
	}
}
