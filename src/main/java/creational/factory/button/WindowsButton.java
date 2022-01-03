package creational.factory.button;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("windows button rendered");
    }

    @Override
    public void click() {
        System.out.println("windows button clicked");
    }
}
