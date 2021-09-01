package main.java.StrategyDesignPattern;

import main.java.StrategyDesignPattern.models.Context;
import main.java.StrategyDesignPattern.models.OperaitionMultiply;
import main.java.StrategyDesignPattern.models.OperationAdd;
import main.java.StrategyDesignPattern.models.OperationSubtract;

public class Main {

    /*Strategy is a behavioural design pattern that lets you define a family of algorithms
    ,put each of them into a separate class, and make their objects
    interchangeable
    * */

    /*The Strategy pattern suggests that you take a class that does someting
    specific in a lot of different ways and extract all of these algorithms
    into separate classes called strategies

    The original class , called context , must have a field for storing a reference
    to one of the strategies. The context delegates the work to a linked strategy
    object instead of executing it on its own.

    The context is no responsible for selecting an appropriate algorithms for the
    job.Instead, the client passes the desired strategy to
    the context . In fact, the context doesn't know much about strategies. It works with all strategies through the same
    generic interface, which only exposes a single method for triggering the algorithm encapsulated
    within the selected strategy.

    A class behaviour or its algorithm can be changed at run time.

    * */
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(10, 5));

        context = new Context(new OperaitionMultiply());
        System.out.println(context.executeStrategy(10, 5));
    }

    /*
    * Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.

 The Strategy pattern lets you indirectly alter the object’s behavior at runtime by associating it with different sub-objects which can perform specific sub-tasks in different ways.

 Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.

 The Strategy pattern lets you extract the varying behavior into a separate class hierarchy and combine the original classes into one, thereby reducing duplicate code.

 Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.

 The Strategy pattern lets you isolate the code, internal data, and dependencies of various algorithms from the rest of the code. Various clients get a simple interface to execute the algorithms and switch them at runtime.

 Use the pattern when your class has a massive conditional operator that switches between different variants of the same algorithm.
    * */

    /*
     * -You can swap algorithms used inside an object at runtime.
     * -You can isolate the implementation details of an algorithm from the code
     * that uses it.
     * -You can replace inheritance with composition.
     * -Open/Closed Principle . You can introduce new strategies without having
     * to change the context.
     * */
}
