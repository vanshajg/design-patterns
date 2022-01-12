package structural.adapter.roundpeg;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class RoundPeg implements Peg {
    @Getter
    private int radius;
}
