package net.dzhai.dp.creational.prototype.demo1;

public class Client {

	private Prototype prototype;

	/**
	 * 构造方法，传入需要使用的原型接口对象
	 */
	public Client(Prototype prototype) {
		this.prototype = prototype;
	}

	public void operation(Prototype example) {
		// 需要创建原型接口的对象
		Prototype copyPrototype = (Prototype) prototype.clone();

	}
}
