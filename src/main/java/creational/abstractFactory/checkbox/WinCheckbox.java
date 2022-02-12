package creational.abstractFactory.checkbox;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WinCheckbox implements Checkbox {
    @Override
    public void render() {
      log.info("render windows checkbox");
    }
}
