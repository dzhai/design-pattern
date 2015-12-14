package net.dzhai.dp.creational.singleton;

/**
 * 双重加锁
 */
public class Singleton3 {

	private static volatile Singleton3 s3 = null;

	public Singleton3 getInstance() {
		if (s3 == null) {
			synchronized (Singleton3.class) {
				if (s3 == null) {
					s3 = new Singleton3();
				}
			}
		}
		return s3;
	}

}
