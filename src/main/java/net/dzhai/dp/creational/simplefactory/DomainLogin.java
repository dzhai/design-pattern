package net.dzhai.dp.creational.simplefactory;

public class DomainLogin implements ILogin{

	public boolean verify(String name, String password) {
		System.out.println("域认证");
		return false;
	}

}
