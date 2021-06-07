package main.java.AbstractFactoryPattern.application;

import main.java.AbstractFactoryPattern.factory.interfaces.GUIFactory;
import main.java.AbstractFactoryPattern.interfaces.Button;
import main.java.AbstractFactoryPattern.interfaces.CheckBox;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkBox = guiFactory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
