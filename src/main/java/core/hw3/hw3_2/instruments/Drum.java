package core.hw3.hw3_2.instruments;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Drum implements Instrument {
    @Override
    public void play() {
        System.out.println("Грає барабан " + this.getSize() + " розміру.");
    }

    private String size;
}
