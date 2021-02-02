package main.java.FactoryDesignPattern.model;

import main.java.FactoryDesignPattern.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle Class has draw() method");
    }
}

