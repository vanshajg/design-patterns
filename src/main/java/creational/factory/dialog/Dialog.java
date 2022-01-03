package creational.factory.dialog;

import creational.factory.button.Button;

public abstract class Dialog {
    public void render() {
        Button button = createButton();
        button.click();
        button.render();
    }
    // factory method pushed to concrete classes
    public abstract Button createButton();
}
