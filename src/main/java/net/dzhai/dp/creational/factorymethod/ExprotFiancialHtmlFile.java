package net.dzhai.dp.creational.factorymethod;

public class ExprotFiancialHtmlFile implements ExportFile {

	@Override
	public boolean exprot(String data) {
		System.out.println("倒出财务版HTML文件");
		return true;
	}

}
