package net.dzhai.dp.structural.decorator.demo1;

public class Client{
	public static void main(String[] args) {
		
		Component com=new ConcreteDecoratorA(new ConcreteComponent());
		com.sampleOperation();
	}
}