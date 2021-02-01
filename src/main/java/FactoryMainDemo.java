package main.java;

import main.java.factory.ShapeFactory;
import main.java.interfaces.Shape;

public class FactoryMainDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeFirst = shapeFactory.getShape("Circle");
        shapeFirst.draw();

        Shape shapeSecond = shapeFactory.getShape("Rectangle");
        shapeSecond.draw();

        Shape shapeThird = shapeFactory.getShape("Square");
        shapeThird.draw();

    }
//In Factory Pattern we create object without exposing the creation logic to
    // the client and refer to newly created object using a  common interface.
}
