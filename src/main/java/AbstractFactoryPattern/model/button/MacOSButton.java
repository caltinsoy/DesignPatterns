package main.java.AbstractFactoryPattern.model.button;

import main.java.AbstractFactoryPattern.interfaces.Button;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton");
    }
}
