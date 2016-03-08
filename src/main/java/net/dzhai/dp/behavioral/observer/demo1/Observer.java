package net.dzhai.dp.behavioral.observer.demo1;
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}