package com.java20160128;

public class Test7{
	public static void main(String[] args) {
		K k=Factory.get();
		System.out.println(k.countChar("aaaaaaccc", 'a'));
		//System.out.println("a在aaaaaaccc"+"出现了"+k.countChar("aaaaaaccc", 'a')+"次");
	}
}