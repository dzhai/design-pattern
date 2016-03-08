package net.dzhai.dp.behavioral.state.deom1;

public class Context {

	private State state;

	public void setState(State state) {
		this.state = state;
	}

	/**
	 * 用户感兴趣的接口方法
	 */
	public void request(String msg) {
		// 转调state来处理
		state.handle(msg);
	}

	public State getState() {
		return state;
	}

}
