package net.dzhai.dp.behavioral.command.demo1;

public class Client {

	public static void main(String[] args) {

		Receiver receiver = new Receiver();

		Command command = new ConCreateCommand(receiver);

		Invoker invoker = new Invoker(command);

		invoker.action();

	}

}
