package net.dzhai.dp.structural.bridge.demo2;

public class DriverManager {

	private static Driver driver;

	public synchronized static void registerDriver(Driver driver) {
		DriverManager.driver = driver;
	}

	public static void getConnection() {
		if (driver != null) {
			System.out.println("获得连接"+driver.getName());
		} else {
			System.out.println("没有注册驱动");
		}
	}
}
