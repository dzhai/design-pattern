package net.dzhai.dp.behavioral.chain_of_responsibility.demo1;

public class Client {

	
	public static void main(String[] args) {
		//组装责任链
        Handler handler1 = new ConCreateHandler();
        Handler handler2 = new ConCreateHandler();
        handler1.setSuccessor(handler2);
        //提交请求
        handler1.handleRequest();
	}
}
