package net.dzhai.dp.creational.factorymethod;

public class ExportPdfFactory implements ExportFactory {

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
