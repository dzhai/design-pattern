package net.dzhai.dp.behavioral.observer.demo2;
public class ConcreteObserver implements Observer {
    //观察者的状态
    private String observerState;
    
    @Override
    public void update(Subject subject) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = ((ConcreteSubject)subject).getState();
        System.out.println("状态为："+observerState);
    }

}