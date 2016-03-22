package net.dzhai.dp.structural.bridge.demo1;

public abstract class AbstractMessage {

	private MessageImplementor impl;

	public AbstractMessage(MessageImplementor impl) {
		this.impl = impl;
	}
	
	public void sendMessage(String message , String toUser){
        this.impl.send(message, toUser);
    }
}
