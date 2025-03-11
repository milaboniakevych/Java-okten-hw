package core.hw4.hw4_2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("app");
        words.add("build");
        words.add("public");
        words.add("statement");
        words.add("testing");
        words.add("purchase");
        words.add("space");
        words.add("PC");
        words.add("astronaut");
        words.add("planet");
        words.add("family");
        words.add("familiar");
        words.add("scenic");
        words.add("scientific");
        words.add("cruelty");
        words.sort(Comparator.naturalOrder());
        System.out.println(words);

    }
}
