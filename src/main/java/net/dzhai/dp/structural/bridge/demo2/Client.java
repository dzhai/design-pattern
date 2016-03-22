package net.dzhai.dp.structural.bridge.demo2;

public class Client {

	
	public static void main(String[] args) throws Exception {
		Class.forName("net.dzhai.dp.structural.bridge.demo2.MySqlDriver");
		DriverManager.getConnection();
	}
}
