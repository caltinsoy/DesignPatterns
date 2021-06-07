package main.java.AbstractFactoryPattern.model.checkbox;

import main.java.AbstractFactoryPattern.interfaces.CheckBox;

public class WindowsCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckBOX");
    }

}
