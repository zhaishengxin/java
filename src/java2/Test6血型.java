package java2;
//6. 保护作业1的Person类中的血型属性，保证血型只能是A B AB O型中的一种。
class Person1_1{
	String name;
	String gender;
	int age;
	private String bloodType;
	public void f1(String nm,String gnd,int a,String bt){
		name=nm;
		gender=gnd;
		age=a;
		if(bt=="O"||bt=="A"||bt=="AB"||bt=="B"){
			bloodType=bt;
		}else{
			throw new RuntimeException("非法血型"+bt);
		}
	}
	void print(){
		System.out.println(" 名字："+name);
		System.out.println(" 性别："+gender);
		System.out.println(" 年龄："+age);
		System.out.println(" 血型："+bloodType);
	}
}
public class Test6血型 {
	public static void main(String[] args) {
		Person1_1 p=new Person1_1();
		p.f1("小马","男",26,"C");
		p.print();
	}
}
