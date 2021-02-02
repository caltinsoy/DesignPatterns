package main.java.FactoryDesignPattern.model;

import main.java.FactoryDesignPattern.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Class has draw() method !");
    }
}
