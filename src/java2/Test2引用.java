package java2;
/*2. ����3��Person������ã�����3������ָ��ͬһ��Person����
��ʾ���޸�������ĳһ������ָ��Ķ�������ԣ�������������
ָ�����ͬһ�����������Ҳ��仯��*/

class Person2{
	String name;
	void print(){
		System.out.print(" ���֣�"+name);
	}
}
public class Test2���� {
	public static void main(String[] args) {
		Person2 p1=new Person2();
		p1.name="С��";
		p1.print();
		Person2 p2=p1;
		p2.name="С��";
		p2.print();
		Person2 p3=p2;
		p3.name="С��";//ֻҪ�ı�p3����ֵ��p2,p1������ֵ������֮�ı䡣
		p1.print();
		p2.print();
		p3.print();
	}
}
