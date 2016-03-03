package net.dzhai.dp.behavioral.command.demo2;

public class RewindCommand implements Command {

	private AudioPlayer myAudio;

	public RewindCommand(AudioPlayer audioPlayer) {
		myAudio = audioPlayer;
	}

	/**
	 * 执行方法
	 */
	@Override
	public void execute() {
		myAudio.rewind();
	}

}