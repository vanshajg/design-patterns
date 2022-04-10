package structural.bridge.device;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Radio implements Device {
    @Override
    public void isEnabled() {

    }

    @Override
    public int getVol() {
        return (int) (Math.random() * 10);
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
