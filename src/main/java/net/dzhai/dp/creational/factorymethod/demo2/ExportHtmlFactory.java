package net.dzhai.dp.creational.factorymethod.demo2;

public class ExportHtmlFactory extends ExportFactory {

	@Override
	public ExportFile factory(String type) {
		if ("standard".equals(type)) {
			return new ExprotStandardHtmlFile();
		} else if ("fiancial".equals(type)) {
			return new ExprotFiancialHtmlFile();
		} else {
			throw new RuntimeException("没有找到对象");
		}
	}

}
