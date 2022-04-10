package structural.adapter.squarepeg;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import structural.adapter.roundpeg.RoundPeg;

@AllArgsConstructor
@Slf4j
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    @Override
    public int getRadius() {
    log.info("get radius of square peg");
        return (int) Math.ceil((peg.getWidth() * Math.sqrt(2) / 2));
    }
}
