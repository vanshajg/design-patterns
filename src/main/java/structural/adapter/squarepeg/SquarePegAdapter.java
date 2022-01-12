package structural.adapter.squarepeg;


import lombok.AllArgsConstructor;
import structural.adapter.roundpeg.Peg;

@AllArgsConstructor
public class SquarePegAdapter implements Peg {
    private SquarePeg peg;

    public int getRadius() {
        return (int) Math.ceil((peg.getWidth() * Math.sqrt(2) / 2));
    }
}
