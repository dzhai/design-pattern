package net.dzhai.dp.behavioral.observer.demo3;

import java.util.Observable;
import java.util.Observer;

public class Watcher1 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("watcher1状态发生改变：" + ((Watched) o).getData());
	}

}