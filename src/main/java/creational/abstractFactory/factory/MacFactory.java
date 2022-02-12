package creational.abstractFactory.factory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.button.MacButton;
import creational.abstractFactory.checkbox.Checkbox;
import creational.abstractFactory.checkbox.MacCheckbox;

public class MacFactory implements Factory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
