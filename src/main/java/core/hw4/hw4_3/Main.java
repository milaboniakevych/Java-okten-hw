package core.hw4.hw4_3;


import core.hw4.hw4_3.enums.Gender;
import core.hw4.hw4_3.models.Car;
import core.hw4.hw4_3.models.Person;
import core.hw4.hw4_3.models.Skill;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Set<Person> hashSetPersons = new HashSet<>();
        hashSetPersons.addAll(Arrays.asList(
                new Person(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE,
                        Arrays.asList(new Skill("python", 5), new Skill("js", 10), new Skill("c++", 10)),
                        new Car("Mercedes", 2020, 220)),

                new Person(2, "marry", "borisova", "mm@gmail.com", 30, Gender.FEMALE,
                        Arrays.asList(new Skill("python", 5), new Skill("ts", 5), new Skill("c", 9)),
                        new Car("BMW", 2019, 230)),

                new Person(3, "tiffany", "sun", "q@gmail.com", 30, Gender.FEMALE,
                        Arrays.asList(new Skill("python", 10)),
                        new Car("BMW", 2019, 230)),

                new Person(4, "alex", "cloud", "w@gmail.com", 30, Gender.MALE,
                        Arrays.asList(new Skill("js", 3), new Skill("c++", 7)),
                        new Car("Mercedes", 2019, 230)),

                new Person(5, "jeremy", "white", "e@gmail.com", 29, Gender.MALE,
                        Arrays.asList(new Skill("java", 10), new Skill("js", 15), new Skill("c++", 11)),
                        new Car("BMW", 2017, 230)),

                new Person(6, "rick", "cartoon", "r@gmail.com", 37, Gender.MALE,
                        Arrays.asList(new Skill("python", 9), new Skill("c++", 1)),
                        new Car("Mercedes", 2019, 230)),

                new Person(7, "morty", "cartoon", "t@gmail.com", 28, Gender.MALE,
                        Arrays.asList(new Skill("java", 6)),
                        new Car("BMW", 2012, 230)),

                new Person(8, "bob", "pinapple", "y@gmail.com", 39, Gender.MALE,
                        Arrays.asList(new Skill("python", 3), new Skill("js", 4)),
                        new Car("Mercedes", 2020, 230)),

                new Person(9, "patrick", "star", "u@gmail.com", 22, Gender.MALE,
                        Arrays.asList(new Skill("python", 5), new Skill("js", 10), new Skill("c++", 10)),
                        new Car("BMW", 2019, 230)),

                new Person(10, "sandy", "squirell", "i@gmail.com", 20, Gender.FEMALE,
                        Arrays.asList(new Skill("python", 5), new Skill("html", 12), new Skill("c++", 10)),
                        new Car("BMW", 2023, 230))
        ));

        System.out.println("General list:");
        hashSetPersons.forEach(System.out::println);


        System.out.println("List with just females:");
        hashSetPersons.removeIf(person -> person.getGender() == Gender.MALE);
        hashSetPersons.forEach(System.out::println);




        Set<Person> treeSetPersons = new TreeSet<>(
                Comparator.comparingInt((Person person) -> person.getSkills().size())
                        .thenComparing(Person::getId)
        );

        treeSetPersons.addAll(Arrays.asList(
                new Person(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE,
                        Arrays.asList(new Skill("python", 5), new Skill("js", 10), new Skill("c++", 10)),
                        new Car("Mercedes", 2020, 220)),

                new Person(2, "marry", "borisova", "mm@gmail.com", 30, Gender.FEMALE,
                        Arrays.asList(new Skill("python", 5), new Skill("ts", 5), new Skill("c", 9)),
                        new Car("BMW", 2019, 230)),

                new Person(3, "tiffany", "sun", "q@gmail.com", 30, Gender.FEMALE,
                        Arrays.asList(new Skill("python", 10)), // 1 скіл
                        new Car("BMW", 2019, 230)),

                new Person(4, "alex", "cloud", "w@gmail.com", 30, Gender.MALE,
                        Arrays.asList(new Skill("js", 3), new Skill("c++", 7)),
                        new Car("Mercedes", 2019, 230)),

                new Person(5, "jeremy", "white", "e@gmail.com", 29, Gender.MALE,
                        Arrays.asList(new Skill("java", 10), new Skill("js", 15), new Skill("c++", 11)),
                        new Car("BMW", 2017, 230)),

                new Person(6, "rick", "cartoon", "r@gmail.com", 37, Gender.MALE,
                        Arrays.asList(new Skill("python", 9), new Skill("c++", 1)),
                        new Car("Mercedes", 2019, 230)),

                new Person(7, "morty", "cartoon", "t@gmail.com", 28, Gender.MALE,
                        Arrays.asList(new Skill("java", 6)),
                        new Car("BMW", 2012, 230)),

                new Person(8, "bob", "pinapple", "y@gmail.com", 39, Gender.MALE,
                        Arrays.asList(new Skill("python", 3), new Skill("js", 4)),
                        new Car("Mercedes", 2020, 230)),

                new Person(9, "patrick", "star", "u@gmail.com", 22, Gender.MALE,
                        Arrays.asList(new Skill("python", 5), new Skill("js", 10), new Skill("c++", 10)),
                        new Car("BMW", 2019, 230)),

                new Person(10, "sandy", "squirell", "i@gmail.com", 20, Gender.FEMALE,
                        Arrays.asList(new Skill("python", 5), new Skill("html", 12), new Skill("c++", 10)),
                        new Car("BMW", 2023, 230))
        ));

        System.out.println("Sorted by the number of skills in ascending order:");
        treeSetPersons.forEach(System.out::println);

            }
        }




