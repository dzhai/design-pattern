package net.dzhai.dp.creational.factorymethod.demo2;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {
		testfiancial();
		System.out.println("---");
		teststandard();
	}

	public void testfiancial() {
		String data = "";
		ExportFactory exprotFactory = new ExportHtmlFactory();
		exprotFactory.exprot(data, "fiancial");
	}

	public void teststandard() {
		String data = "";
		ExportFactory exprotFactory = new ExportHtmlFactory();
		exprotFactory.exprot(data, "standard");
	}
}
