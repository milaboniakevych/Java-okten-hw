package core.hw3.hw3_2.instruments;

import core.hw3.hw3_2.Instrument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Trumpet implements Instrument {
    @Override
    public void play() {
        System.out.println("Грає труба з діаметром " + this.getDiameter() + " см.");
    }

    private int diameter;
}
