package structural.bridge.device;

public interface Device {
    public void isEnabled();

    public int getVol();

    public void setVol(int vol);

    public void getChannel();

    public void setChannel(int channel);
}
