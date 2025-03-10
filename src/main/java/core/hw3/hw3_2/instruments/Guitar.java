package core.hw3.hw3_2.instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Грає гітара з " + this.getNumOfStrings() + " струнами.");
    }

    private int numOfStrings;
}
