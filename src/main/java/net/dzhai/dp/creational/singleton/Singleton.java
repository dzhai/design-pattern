package net.dzhai.dp.creational.singleton;

/**
 * 根据类延迟初始化 推荐
 */
public class Singleton {

	private Singleton() {

	}

	private static final class SingletonHelper {
		private static final Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHelper.instance;
	}
}
