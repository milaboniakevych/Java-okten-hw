package core.hw3.hw3_1;

import core.hw3.hw3_1.models.Book;
import core.hw3.hw3_1.models.Magazine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Printable> printedPublications = new ArrayList<>();
        printedPublications.add(new Book());
        printedPublications.add(new Magazine());

        for (Printable printedPublication : printedPublications) {
            printedPublication.print();
        }
    }
}
