package java2;
import java.util.Scanner;

//5. �Ӽ��̽���һ���ַ����������ַ����ֱ�ת��Ϊint long flaot doube����
//   �ļ򵥱����� ���Ե�������ַ����а���������ʱ������ʲô���������
public class Test5ת��Ϊint {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str=in.next();
		System.out.println(Integer.parseInt(str));
		System.out.println(Long.parseLong(str));
		System.out.println(Float.parseFloat(str));
		System.out.println(Double.parseDouble(str));
	}
}
