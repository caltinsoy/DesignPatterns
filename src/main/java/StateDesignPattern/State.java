package main.java.StateDesignPattern;

import main.java.StateDesignPattern.models.Context;

public interface State {
    void doAction(Context context);
}
