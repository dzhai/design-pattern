package net.dzhai.dp.behavioral.command.demo2.macro;

import net.dzhai.dp.behavioral.command.demo2.Command;

public interface MacroCommand extends Command {

	void add(Command command);

	void remove(Command command);
}
