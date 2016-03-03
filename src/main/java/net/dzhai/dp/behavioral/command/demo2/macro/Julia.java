package net.dzhai.dp.behavioral.command.demo2.macro;

import net.dzhai.dp.behavioral.command.demo2.AudioPlayer;
import net.dzhai.dp.behavioral.command.demo2.Command;
import net.dzhai.dp.behavioral.command.demo2.PlayCommand;
import net.dzhai.dp.behavioral.command.demo2.RewindCommand;
import net.dzhai.dp.behavioral.command.demo2.StopCommand;

public class Julia {

	public static void main(String[] args) {
		// 创建接收者对象
		AudioPlayer audioPlayer = new AudioPlayer();
		// 创建命令对象
		Command playCommand = new PlayCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);

		MacroCommand marco = new MacroAudioCommand();

		marco.add(playCommand);
		marco.add(rewindCommand);
		marco.add(stopCommand);
		marco.execute();
	}
}