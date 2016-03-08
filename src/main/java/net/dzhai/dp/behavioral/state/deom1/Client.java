package net.dzhai.dp.behavioral.state.deom1;

public class Client {

	
	public static void main(String[] args) {
		 //创建状态
        State state = new ConcreteState();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
	}
}
