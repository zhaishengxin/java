//5. Ϊ���������еĳ��ﶨ��һ���ࡣ ��������г�������Ժͷ�������ʵ����3����������������Ը�ֵ�������÷�����

package jdbc;
public class Pets{
		String breed;
		String sex;
		String color;
		int age; 
		void eat(){
			System.out.print("������");
		}
		void action(){
			System.out.print("��");
		}
	public static void main(String[] args) {
		Pets p = new Pets();
		p.breed="����Ȯ";
		p.sex="��";
		p.color="��ɫ";
		System.out.print(p.color+p.sex+p.breed);
		p.eat();
		p.action();
		
		

	}

}
