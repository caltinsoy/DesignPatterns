package main.java.model;

import main.java.interfaces.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape class has draw() method");
    }
}
