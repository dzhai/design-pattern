package net.dzhai.dp.behavioral.chain_of_responsibility.demo2;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Handler> handlers = new ArrayList<Handler>();

		handlers.add(new ConCreateHandler1());
		handlers.add(new ConCreateHandler2());

		for (Handler handler : handlers) {
			handler.handleRequest();
		}
	}
}
