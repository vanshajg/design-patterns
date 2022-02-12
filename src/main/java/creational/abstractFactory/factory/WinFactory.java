package creational.abstractFactory.factory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.button.WinButton;
import creational.abstractFactory.checkbox.Checkbox;
import creational.abstractFactory.checkbox.MacCheckbox;
import creational.abstractFactory.checkbox.WinCheckbox;

public class WinFactory implements Factory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
