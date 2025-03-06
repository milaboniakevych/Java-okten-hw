package core.hw2.hw2_4.models;

import core.hw2.hw2_4.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor

public class Person {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private final List<Skill> skills = new ArrayList<>();
    private Car car;

    public Person(int id, String name, String surname, String email, int age, Gender gender, Car car, List<Skill> skills) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = car;
        this.skills.addAll(skills);
    }
}


