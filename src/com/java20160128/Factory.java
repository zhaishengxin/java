package com.java20160128;

public class Factory {
	public static K get() {
		return new A1();  // 这里返回自己实现K接口的类的实例
	}
}
