package core.hw3.hw3_2;

import core.hw3.hw3_2.instruments.Drum;
import core.hw3.hw3_2.instruments.Guitar;
import core.hw3.hw3_2.instruments.Instrument;
import core.hw3.hw3_2.instruments.Trumpet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Instrument> instruments = new ArrayList<>();
        Collections.addAll(instruments, new Guitar(6), new Drum("середнього"), new Trumpet(25));

        for (Instrument instrument : instruments) {
            instrument.play();
        }


    }
}
