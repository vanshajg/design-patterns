package creational.factory.dialog;

import creational.factory.button.Button;
import creational.factory.button.MacButton;

public class MacDialog extends Dialog{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
