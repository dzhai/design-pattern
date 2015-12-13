package net.dzhai.dp.creational.factorymethod.demo2;

public class ExportPdfFactory extends ExportFactory {

	@Override
	public ExportFile factory(String type) {
		if ("standard".equals(type)) {
			return new ExprotStandardPdfFile();
		} else if ("financial".equals(type)) {
			return new ExprotFinancialPdfFile();
		} else {
			throw new RuntimeException("沒有找到对象");
		}
	}

}
