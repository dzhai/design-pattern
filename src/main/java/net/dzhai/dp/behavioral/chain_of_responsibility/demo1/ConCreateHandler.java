package net.dzhai.dp.behavioral.chain_of_responsibility.demo1;

public class ConCreateHandler extends Handler {

	@Override
	public void handleRequest() {

		if (getSuccessor() != null) {
			System.out.println("放过请求");
			getSuccessor().handleRequest();
		} else {
			System.out.println("处理请求");
		}

	}

}
