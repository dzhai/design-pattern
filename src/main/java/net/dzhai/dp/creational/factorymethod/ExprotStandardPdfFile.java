package net.dzhai.dp.creational.factorymethod;

public class ExprotStandardPdfFile implements ExportFile {

	@Override
	public boolean exprot(String data) {
		System.out.println("导出标准版PDF文件");
		return true;
	}

}
