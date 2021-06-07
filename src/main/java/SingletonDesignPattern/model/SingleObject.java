package main.java.SingletonDesignPattern.model;

public class SingleObject {
    private static SingleObject singleObject = new SingleObject();

    //we have to mark as a private our constructor
    //and so nobody cant initialize with the new keyword this class

    private SingleObject() {
    }

    public static SingleObject getInstanceOfSingleObject() {
        return singleObject;
    }

    public void showClassMessage() {
        System.out.println("This is SingleObject class");
    }
}
