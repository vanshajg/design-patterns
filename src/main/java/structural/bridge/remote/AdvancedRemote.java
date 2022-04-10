package structural.bridge.remote;

import structural.bridge.device.Device;

public class AdvancedRemote extends Remote {

    public AdvancedRemote(Device device) {
        super(device);
    }
    void mute() {
        device.setVol(0);
    }
}
