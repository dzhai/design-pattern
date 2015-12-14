package net.dzhai.dp.creational.builder;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.builderpart1();
		builder.builderpart2();
	}
}
