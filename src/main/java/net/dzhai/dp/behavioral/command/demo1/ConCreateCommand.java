package net.dzhai.dp.behavioral.command.demo1;

public class ConCreateCommand implements Command {

	private Receiver receiver;

	public ConCreateCommand(Receiver receiver) {
		this.receiver=receiver;
	}
	
	@Override
	public void execute() {
		receiver.action();
		
	}

}
