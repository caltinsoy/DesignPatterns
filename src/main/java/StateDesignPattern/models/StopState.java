package main.java.StateDesignPattern.models;

import main.java.StateDesignPattern.State;

public class StopState implements State {


    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
