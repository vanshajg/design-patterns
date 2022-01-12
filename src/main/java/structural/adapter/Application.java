package structural.adapter;

import structural.adapter.squarepeg.SquarePeg;
import structural.adapter.squarepeg.SquarePegAdapter;

public class Application {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);
        System.out.println(hole.canFit(adapter));
    }
}
