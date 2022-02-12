package creational.abstractFactory.checkbox;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        log.info("render mac checkbox");
    }
}
