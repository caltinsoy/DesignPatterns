package main.java.FactoryDesignPattern.factory;

import main.java.FactoryDesignPattern.interfaces.Shape;
import main.java.FactoryDesignPattern.model.Circle;
import main.java.FactoryDesignPattern.model.Rectangle;
import main.java.FactoryDesignPattern.model.Square;

public class ShapeFactory {

    public Shape getShape(String shape) {
        if (shape == null)
            return null;
        else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
    //In Factory Pattern we create object without exposing the creation logic to
    // the client and refer to newly created object using a  common interface.
}
