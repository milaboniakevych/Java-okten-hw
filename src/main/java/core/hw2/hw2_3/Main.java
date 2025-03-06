package core.hw2.hw2_3;

import core.hw2.hw2_3.models.Comics;
import core.hw2.hw2_3.models.Magazine;

public class Main {
    public static void main(String[] args) {

        Magazine magazine = new Magazine("yellow", "A4", "Soft cover", "Arial", "Vogue", "150");
        System.out.println(magazine);

        Comics comics = new Comics("dark yellow", "A3", "Hard cover", "Sans serif", "Naruto", "Japanese", "70" );
        System.out.println(comics);

    }
}
