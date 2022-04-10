package structural.bridge.remote;

import lombok.AllArgsConstructor;
import structural.bridge.device.Device;

@AllArgsConstructor
public class Remote {
    protected Device device;

    public void VolDown() {
        device.setVol(device.getVol() - 5);
    }

    public void VolUp() {
        device.setVol(device.getVol() + 5);
    }
}
