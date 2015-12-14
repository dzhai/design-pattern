package net.dzhai.dp.creational.builder.demo2;
public interface Builder {

	public void builderto(String toaddress);

	public void builderfrom(String fromAddres);

	public void buildersubject();

	public void builderbody();

	public void buildersenddate();

	public void sendmessage();

}
