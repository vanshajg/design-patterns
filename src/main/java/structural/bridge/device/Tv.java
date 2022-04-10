package structural.bridge.device;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tv implements Device {
    @Override
    public void isEnabled() {
        log.info("called isEnabled");
    }

    @Override
    public int getVol() {
        return (int) (Math.random() * 100);
    }

    @Override
    public void setVol(int vol) {

    }

    @Override
    public void getChannel() {

    }

    @Override
    public void setChannel(int channel) {

    }
}

