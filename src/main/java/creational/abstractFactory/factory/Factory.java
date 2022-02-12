package creational.abstractFactory.factory;

import creational.abstractFactory.button.Button;
import creational.abstractFactory.checkbox.Checkbox;

public interface Factory {
    Button createButton();
    Checkbox createCheckbox();
}
