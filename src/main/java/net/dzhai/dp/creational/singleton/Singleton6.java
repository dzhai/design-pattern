package net.dzhai.dp.creational.singleton;;

//枚举
public enum Singleton6 {

	INSTANCE;
	protected String someMethod() {
		return "123";
	};

	public static void main(String[] args) {
		System.out.println(Singleton6.INSTANCE.someMethod());
	}
}
