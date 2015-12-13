package net.dzhai.dp.creational.factorymethod;

public class ExportHtmlFactory implements ExportFactory {

	@Override
	public ExportFile factory(String type) {
		if("standard".equals(type)){
			return new ExprotStandardHtmlFile();
		}else if("fiancial".equals(type)){
			return new ExprotFiancialHtmlFile();
		}else {
			throw new RuntimeException("没有找到对象");
		}		
	}

}
