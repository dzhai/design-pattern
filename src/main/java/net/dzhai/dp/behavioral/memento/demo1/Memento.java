package net.dzhai.dp.behavioral.memento.demo1;

public class Memento {
    
    private String state;
    
    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
}