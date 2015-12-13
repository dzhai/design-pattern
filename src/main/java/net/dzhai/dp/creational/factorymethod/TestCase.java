package net.dzhai.dp.creational.factorymethod;

import org.junit.Test;

public class TestCase {

	@Test
	public void testfiancial() {
		String data = "";
		ExportFactory exprotFactory = new ExportHtmlFactory();
		ExportFile ef = exprotFactory.factory("fiancial");
		ef.exprot(data);
	}

	@Test
	public void teststandard() {
		String data = "";
		ExportFactory exprotFactory = new ExportHtmlFactory();
		ExportFile ef = exprotFactory.factory("standard");
		ef.exprot(data);
	}
}
