package main.java.AbstractFactoryPattern.model.button;

import main.java.AbstractFactoryPattern.interfaces.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}
