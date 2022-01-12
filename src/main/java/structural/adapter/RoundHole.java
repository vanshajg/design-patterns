package structural.adapter;

import lombok.AllArgsConstructor;
import structural.adapter.roundpeg.Peg;

@AllArgsConstructor
public class RoundHole {
    private int radius;

    boolean canFit(Peg peg) {
        return radius >= peg.getRadius();
    }
}
