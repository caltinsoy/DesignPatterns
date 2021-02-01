package main.java.factory;

import main.java.interfaces.Shape;
import main.java.model.Circle;
import main.java.model.Rectangle;
import main.java.model.Square;

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
}
