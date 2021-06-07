package main.java.AbstractFactoryPattern.factory.interfaces;

import main.java.AbstractFactoryPattern.interfaces.Button;
import main.java.AbstractFactoryPattern.interfaces.CheckBox;

public interface GUIFactory {
    Button createButton();

    CheckBox createCheckBox();
}
