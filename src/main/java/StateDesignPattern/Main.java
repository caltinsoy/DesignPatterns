package main.java.StateDesignPattern;

import main.java.StateDesignPattern.models.Context;
import main.java.StateDesignPattern.models.StartState;
import main.java.StateDesignPattern.models.StopState;

public class Main {

    /*
    State is a behavioural design pattern that lets an object alter its
    behaviour when its internal state changes.It appears as if the object changed
    its class.
    *
    In State pattern a class behaviour changes based on its state.
    In State pattern , we create objects which represent various states and a context
    object whose behaviour varies as its state objects changes.
     */
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }

    /*This structure may look smilar to the Strategy pattern, but there's one key
    difference. In the State pattern, the particular states may be aware of each
    other and initiate transations from one state to another , whereas strategies almost never know
    about each other.
    * */

    /*
     *  Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
     * */

    /*
    *  Single Responsibility Principle. Organize the code related to particular states into separate classes.
 Open/Closed Principle. Introduce new states without changing existing state classes or the context.
 Simplify the code of the context by eliminating bulky state machine conditionals.
    * */

}
