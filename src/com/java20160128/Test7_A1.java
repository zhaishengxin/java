package com.java20160128;
/*7. ȫ��ÿ���˶�ʵ�����½ӿ�:
interface K {
	// ����һ���ַ�������һ��char����
        // ����c��str�г��ֵĴ���
	public int countChar(String str, char c);
}
ȫ��ÿ���˶�������Ĺ�������������!(��null�����Լ�ʵ����Ķ���)
public class Factory {
	public static K get() {
		return null;  // ���ﷵ���Լ�ʵ��K�ӿڵ����ʵ��
	}
}*/
interface K {
	// ����һ���ַ�������һ��char����
        // ����c��str�г��ֵĴ���
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

