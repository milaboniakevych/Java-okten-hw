package core.hw2.hw2_4;


import core.hw2.hw2_4.enums.Gender;
import core.hw2.hw2_4.models.Car;
import core.hw2.hw2_4.models.Person;
import core.hw2.hw2_4.models.Skill;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Skill> skills = List.of(
                new Skill("Java", 10),
                new Skill("C++", 10),
                new Skill("JavaScript", 10)
        );

        Person person = new Person(
                1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                new Car("toyota", 2021, 250),
                skills
        );

        System.out.println(person);
    }
}
