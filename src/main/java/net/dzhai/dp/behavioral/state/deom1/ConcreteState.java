package net.dzhai.dp.behavioral.state.deom1;

public class ConcreteState implements State{

	@Override
	public void handle(String msg) {
		System.out.println(msg);
	}

}
