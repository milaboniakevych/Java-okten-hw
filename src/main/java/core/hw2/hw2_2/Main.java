package core.hw2.hw2_2;

import core.hw2.hw2_2.models.Ultrabook;
import core.hw2.hw2_2.models.Workstation;

public class Main {
    public static void main(String[] args) {

        Ultrabook ultrabook = new Ultrabook("Intel Core i7-1365U", 16, 1.2);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation("AMD Ryzen 9 7945HX", 64, 3.8);
        System.out.println(workstation);

    }
}
