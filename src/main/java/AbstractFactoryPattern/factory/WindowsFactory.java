package main.java.AbstractFactoryPattern.factory;

import main.java.AbstractFactoryPattern.factory.interfaces.GUIFactory;
import main.java.AbstractFactoryPattern.interfaces.Button;
import main.java.AbstractFactoryPattern.interfaces.CheckBox;
import main.java.AbstractFactoryPattern.model.button.WindowsButton;
import main.java.AbstractFactoryPattern.model.checkbox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
