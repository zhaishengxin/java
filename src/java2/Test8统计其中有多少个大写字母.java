package java2;

import java.util.Scanner;

//8. 从键盘输入一个字符串，统计其中有多少个大写字母，小写字母，数字，以及其他
//   字符，要求使用Character封装类来做。

public class Test8统计其中有多少个大写字母 {
	static void Character(String str){
		int count1=0,count2=0,count3=0,count4=0;
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c>='A'&&c<='Z'){
				count1++;
			}else if(c>='a'&&c<='z'){
				count2++;
			}else if(c>='0'&&c<='1'){
				count3++;
			}else{
				count4++;
			}
		}
		System.out.println("大写字母"+count1+"个");
		System.out.println("小写字母"+count2+"个");
		System.out.println("数字"+count3+"个");
		System.out.println("其他字符"+count4+"个");
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一串字符");
		String str=in.next();
		Character( str);
		//TODO jjjj
	}
}
