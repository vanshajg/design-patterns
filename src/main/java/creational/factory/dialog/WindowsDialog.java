package creational.factory.dialog;

import creational.factory.button.Button;
import creational.factory.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
