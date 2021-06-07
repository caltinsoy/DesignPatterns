package main.java.AbstractFactoryPattern.factory;

import main.java.AbstractFactoryPattern.factory.interfaces.GUIFactory;
import main.java.AbstractFactoryPattern.interfaces.Button;
import main.java.AbstractFactoryPattern.interfaces.CheckBox;
import main.java.AbstractFactoryPattern.model.button.MacOSButton;
import main.java.AbstractFactoryPattern.model.checkbox.MacOSCheckBox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
