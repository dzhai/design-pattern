package net.dzhai.dp.creational.builder.demo2;

public class Director {

	private Builder builder;
	
	public Director(Builder builder){
		this.builder=builder;
	}
	
	
	public void construct(String toAddress, String fromAddres){
		builder.builderto(toAddress);
		builder.builderfrom(fromAddres);
		builder.buildersubject();
		builder.builderbody();
		builder.buildersenddate();
		builder.sendmessage();
	}
}
