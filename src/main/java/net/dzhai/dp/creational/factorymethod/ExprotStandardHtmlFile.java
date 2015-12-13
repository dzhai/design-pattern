package net.dzhai.dp.creational.factorymethod;

public class ExprotStandardHtmlFile implements ExportFile {

	@Override
	public boolean exprot(String data) {
		System.out.println("导出标准版HTML文件");
		return true;
	}

}
