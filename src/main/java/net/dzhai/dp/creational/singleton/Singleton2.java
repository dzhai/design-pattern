package net.dzhai.dp.creational.singleton;

//懒汉式单例类
public class Singleton2 {

	private static Singleton2 s2 = null;

	public synchronized Singleton2 getInstance() {
		if (s2 == null) {
			s2 = new Singleton2();
		}
		return s2;
	}

}
