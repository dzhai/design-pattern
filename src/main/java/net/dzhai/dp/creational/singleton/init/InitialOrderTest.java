package net.dzhai.dp.creational.singleton.init;
//初始化顺序依次是（静态变量、静态初始化块）>（变量、初始化块）>构造器
public class InitialOrderTest {
	// 静态变量
	public static String staticField = "静态变量";
	// 变量
	public String field = "变量";
	// 静态初始化块
	static {
		System.out.println(staticField);
		System.out.println("静态初始化块");
	}
	// 初始化块
	{
		System.out.println(field);
		System.out.println("初始化块");
	}

	// 构造器
	public InitialOrderTest() {
		System.out.println("构造器");
	}

	public static void main(String[] args) {
		new InitialOrderTest();
	}
}