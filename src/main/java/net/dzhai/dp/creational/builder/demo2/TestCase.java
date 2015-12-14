package net.dzhai.dp.creational.builder.demo2;

public class TestCase {

	public static void main(String[] args) {
		
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("zhangsan@sdfa.com", "dzhai@qq.com");

		
		builder = new GoodByeBuilder();
		director = new Director(builder);
		director.construct("zhangsan@sdfa.com", "dzhai@qq.com");

	}

}
