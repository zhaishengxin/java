package com.java20160128;
/*7. 全班每个人都实现以下接口:
interface K {
	// 接受一个字符串，和一个char变量
        // 返回c在str中出现的次数
	public int countChar(String str, char c);
}
全班每个人都把下面的工厂代码完善了!(把null换成自己实现类的对象)
public class Factory {
	public static K get() {
		return null;  // 这里返回自己实现K接口的类的实例
	}
}*/
interface K {
	// 接受一个字符串，和一个char变量
        // 返回c在str中出现的次数
	public int countChar(String str, char c);
	
}
class A1 implements K{
	public int countChar(String str, char c) {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==c){
				count++;
			}
		}
		return count;
	}
}

