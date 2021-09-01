package main.java.StrategyDesignPattern.models;

public class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

    /*The Context maintains a reference to one of the concrete strategies
    and communicates with this object only via the strategy interface.
    * */
}
