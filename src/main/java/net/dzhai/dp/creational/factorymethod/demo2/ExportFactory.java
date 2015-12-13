package net.dzhai.dp.creational.factorymethod.demo2;

public abstract class ExportFactory {

	protected abstract ExportFile factory(String type);

	public boolean exprot(String data, String type) {
		ExportFile ex = this.factory(type);
		ex.exprot(data);
		return true;
	}
}
