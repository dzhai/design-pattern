package net.dzhai.dp.creational.abstractfactory;

public class ComputerEngineer {
	private Cpu cpu;
	private MainBoard mainboadr;

	public void makeComputer(AbstractFactory af) {
		perpareHardwares(af);
	}

	private void perpareHardwares(AbstractFactory af) {
		this.cpu=af.createCpu();
		this.mainboadr=af.createMainBoard();
		
		this.cpu.calculate();
		this.mainboadr.installCPU();

	}
}
