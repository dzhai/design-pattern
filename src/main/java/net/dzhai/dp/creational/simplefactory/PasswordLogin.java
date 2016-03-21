package net.dzhai.dp.creational.simplefactory;

public class PasswordLogin implements ILogin {

	public boolean verify(String name, String password) {
		System.out.println("密码认证");
		return false;
	}

}
