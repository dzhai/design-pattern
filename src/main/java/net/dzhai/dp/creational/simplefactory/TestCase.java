package net.dzhai.dp.creational.simplefactory;

import java.text.DateFormat;

import org.junit.Test;

public class TestCase {

	@Test
	public void passwordLogin() {
		String loginType = "password";
		String name = "name";
		String password = "password";
		ILogin login = LoginManager.factory(loginType);
		boolean bool = login.verify(name, password);
		if (bool) {
			/**
			 * ҵ���߼�
			 */
		} else {
			/**
			 * ҵ���߼�
			 */
		}
	}

	@Test
	public void passcodeLogin() {
		String loginType = "passcode";
		String name = "name";
		String password = "password";
		ILogin login = LoginManager.factory(loginType);
		boolean bool = login.verify(name, password);
		if (bool) {
			/**
			 * ҵ���߼�
			 */
		} else {
			/**
			 * ҵ���߼�
			 */
		}
	}
	
	
	public void test(){
		
	}
}
