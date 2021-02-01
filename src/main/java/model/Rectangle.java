package main.java.model;

import main.java.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Class has draw() method !");
    }
}
