package structural.bridge;

import lombok.extern.slf4j.Slf4j;
import structural.bridge.device.Tv;
import structural.bridge.remote.Remote;

@Slf4j
public class Application {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Remote remote = new Remote(tv);
        remote.VolDown();
    }
}

