package main.java.AbstractFactoryPattern;

import main.java.AbstractFactoryPattern.application.Application;
import main.java.AbstractFactoryPattern.factory.MacOSFactory;
import main.java.AbstractFactoryPattern.factory.WindowsFactory;
import main.java.AbstractFactoryPattern.factory.interfaces.GUIFactory;

public class Main {
    /*  Abstract Factory pattern is a creational design pattern which solves the problem of
        creating objects without their concrete class.
    * */

    public static void main(String[] args) {
        Application application = implementApplication();
        application.paint();
    }

    private static Application implementApplication() {
        Application application;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            guiFactory = new MacOSFactory();
            application = new Application(guiFactory);
        } else {
            guiFactory = new WindowsFactory();
            application = new Application(guiFactory);
        }

        return application;
    }


}
