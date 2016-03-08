package net.dzhai.dp.behavioral.observer.demo2;
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(Subject subject);
}