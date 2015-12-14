package net.dzhai.dp.creational.singleton;

//Lazy initialization holder class
public class Singleton4 {

	private static final class SingletonHelper {
		private static final Singleton4 s4 = new Singleton4();
	}

	public static Singleton4 getInstance() {
		return SingletonHelper.s4;
	}
}
