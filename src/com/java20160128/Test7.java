package com.java20160128;

public class Test7{
	public static void main(String[] args) {
		K k=Factory.get();
		System.out.println(k.countChar("aaaaaaccc", 'a'));
		//System.out.println("a��aaaaaaccc"+"������"+k.countChar("aaaaaaccc", 'a')+"��");
	}
}