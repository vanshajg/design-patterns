package creational.factory.button;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("mac button rendered");
    }

    @Override
    public void click() {
        System.out.println("mac button clicked");
    }
}
