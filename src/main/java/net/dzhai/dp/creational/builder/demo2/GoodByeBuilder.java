package net.dzhai.dp.creational.builder.demo2;

import java.util.Date;

public class GoodByeBuilder implements Builder {

	private GoodByeMessage message=new GoodByeMessage();
	
	
	@Override
	public void builderto(String toaddress) {
		message.setTo(toaddress);
		
	}

	@Override
	public void builderfrom(String fromaddress) {
		message.setFrom(fromaddress);		
	}

	@Override
	public void buildersubject() {
		message.setSubject("GoodBye");
		
	}

	@Override
	public void builderbody() {
		message.setBody("GoodBye");
		
	}
	@Override
	public void buildersenddate() {
		message.setSendDate(new Date());
		
	}

	@Override
	public void sendmessage() {
		message.send();		
	}

}
