package net.dzhai.dp.creational.singleton;

/**
 * 双重加锁
 */
public class Singleton2 {

	//volatile
	private static volatile Singleton2 instance = null;

	public Singleton2 getInstance() {
		if (instance == null) {
			synchronized (Singleton2.class) {
				if (instance == null) {
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}

}
