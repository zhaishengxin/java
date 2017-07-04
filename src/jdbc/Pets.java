//5. 为世界上所有的宠物定义一个类。 抽象出所有宠物的属性和方法。并实例化3个宠物出来，给属性赋值，并调用方法。

package jdbc;
public class Pets{
		String breed;
		String sex;
		String color;
		int age; 
		void eat(){
			System.out.print("吃肉肉");
		}
		void action(){
			System.out.print("狂奔");
		}
	public static void main(String[] args) {
		Pets p = new Pets();
		p.breed="牧羊犬";
		p.sex="公";
		p.color="红色";
		System.out.print(p.color+p.sex+p.breed);
		p.eat();
		p.action();
		
		

	}

}
