package net.dzhai.dp.behavioral.chain_of_responsibility.demo1;

public abstract class Handler {

	protected Handler successor;

	public abstract void handleRequest();

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

}
