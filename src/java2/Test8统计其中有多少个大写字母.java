package java2;

import java.util.Scanner;

//8. �Ӽ�������һ���ַ�����ͳ�������ж��ٸ���д��ĸ��Сд��ĸ�����֣��Լ�����
//   �ַ���Ҫ��ʹ��Character��װ��������

public class Test8ͳ�������ж��ٸ���д��ĸ {
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
		System.out.println("��д��ĸ"+count1+"��");
		System.out.println("Сд��ĸ"+count2+"��");
		System.out.println("����"+count3+"��");
		System.out.println("�����ַ�"+count4+"��");
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("������һ���ַ�");
		String str=in.next();
		Character( str);
		//TODO jjjj
	}
}
