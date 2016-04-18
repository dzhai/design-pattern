package net.dzhai.dp.creational.simplefactory;

public class LoginManager {

	public static ILogin factory(String type) {

		if ("password".equals(type)) {
			return new PasswordLogin();
		} else if ("passcode".equals(type)) {
			return new DomainLogin();
		} else {
			throw new RuntimeException("没有找到登录类型");
		}

	}
}
