package java2;
import java.util.Scanner;

//5. 从键盘接收一个字符串，将该字符串分别转换为int long flaot doube类型
//   的简单变量。 测试当输入的字符串中包含非数字时，会有什么情况发生。
public class Test5转换为int {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一串字符串");
		String str=in.next();
		System.out.println(Integer.parseInt(str));
		System.out.println(Long.parseLong(str));
		System.out.println(Float.parseFloat(str));
		System.out.println(Double.parseDouble(str));
	}
}
