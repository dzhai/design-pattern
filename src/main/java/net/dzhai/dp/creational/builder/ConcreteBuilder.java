package net.dzhai.dp.creational.builder;

public class ConcreteBuilder implements Builder {

	private Product p = new Product();

	@Override
	public void builderpart1() {
		p.setPart1("part 1");

	}

	@Override
	public void builderpart2() {
		p.setPart2("part 2");
	}

	@Override
	public Product getProduct() {
		return p;
	}

}
