package net.dzhai.dp.structural.bridge.demo1;

public class UrgencyMessage extends AbstractMessage {

	public UrgencyMessage(MessageImplementor impl) {
		super(impl);
	}

	@Override
	public void sendMessage(String message, String toUser) {
		message = "加急：" + message;
		super.sendMessage(message, toUser);
	}

	public Object watch(String messageId) {
		// 根据消息id获取消息的状态，组织成监控的数据对象，然后返回
		return null;
	}
}