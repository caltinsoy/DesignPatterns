package main.java.model;

import main.java.interfaces.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle Class has draw() method");
    }
}

