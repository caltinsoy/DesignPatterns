package main.java;

import main.java.FactoryDesignPattern.factory.ShapeFactory;
import main.java.FactoryDesignPattern.interfaces.Shape;
import main.java.SingletonDesignPattern.model.SingleObject;

public class FactoryMainDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeFirst = shapeFactory.getShape("Circle");
        shapeFirst.draw();

        Shape shapeSecond = shapeFactory.getShape("Rectangle");
        shapeSecond.draw();

        Shape shapeThird = shapeFactory.getShape("Square");
        shapeThird.draw();

        /* This is Singleton Design Pattern Example
        SingleObject singleObject = SingleObject.getInstanceOfSingleObject();
        singleObject.showClassMessage();*/

    }
}
