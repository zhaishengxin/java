package java2;
//��д���ӣ���ʾ��̬�����౻����ʱ�Զ�ִ�У��������������ڼ�ֻ����һ��
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
public class Test4_3��̬�� {
	public static void main(String[] args) {
		new Cat3();
		new Cat3();
	}
}