package creational.abstractFactory.button;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacButton implements Button {
    @Override
    public void render() {
        log.info("render mac button");
    }
}
