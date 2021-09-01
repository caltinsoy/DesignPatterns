package main.java.StateDesignPattern.models;

import main.java.StateDesignPattern.State;

public class Context {

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
