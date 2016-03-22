package net.dzhai.dp.structural.bridge.demo2;

public class MySqlDriver implements Driver{

	static{
		DriverManager.registerDriver(new MySqlDriver());
	}
	
	@Override
	public String getName() {
		return "mysql";
	}

}
