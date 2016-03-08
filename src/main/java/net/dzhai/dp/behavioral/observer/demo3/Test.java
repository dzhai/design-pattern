package net.dzhai.dp.behavioral.observer.demo3;

import java.util.Observer;

public class Test {

    public static void main(String[] args) {
        
        //创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        Observer watcher1 = new Watcher1();
        Observer watcher2 = new Watcher2();
        watched.addObserver(watcher1);
        watched.addObserver(watcher2);
        
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");

    }

}