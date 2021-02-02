package main.java.FactoryDesignPattern.model;

import main.java.FactoryDesignPattern.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape class has draw() method");
    }
}
