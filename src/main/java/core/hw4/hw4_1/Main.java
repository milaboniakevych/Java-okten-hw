package core.hw4.hw4_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        Collections.addAll(users, new User("Alexandr", 20), new User("Johny", 30), new User("Jack", 40), new User("Bob", 55));

        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);

        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println(users);

        users.sort(Comparator.comparingInt(user -> user.getName().length()));
        System.out.println(users);

        users.sort(Comparator.<User>comparingInt(user -> user.getName().length()).reversed());
        System.out.println(users);

    }
}
