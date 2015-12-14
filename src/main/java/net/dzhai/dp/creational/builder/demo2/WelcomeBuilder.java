package net.dzhai.dp.creational.builder.demo2;

import java.util.Date;

public class WelcomeBuilder implements Builder {

	private WelcomeMessage message=new WelcomeMessage();
	
	
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
		message.setSubject("welcome to our website");
		
	}

	@Override
	public void builderbody() {
		message.setBody("hello world");
		
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
