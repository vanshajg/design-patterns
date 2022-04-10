package structural.adapter;

import lombok.AllArgsConstructor;
import structural.adapter.roundpeg.RoundPeg;

@AllArgsConstructor
public class RoundHole {
    private int radius;

    boolean canFit(RoundPeg peg) {
        return radius >= peg.getRadius();
    }
}
