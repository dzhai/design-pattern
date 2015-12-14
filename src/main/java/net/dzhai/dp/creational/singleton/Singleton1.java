package net.dzhai.dp.creational.singleton;

/**
 * 饿汉式单例类 在类初始化的时候创建对象
 * 
 */

public class Singleton1 {

	private static Singleton1 s1 = new Singleton1();
	public Singleton1(){

	}
	public static Singleton1 getInstance() {
		return s1;
	}

}
