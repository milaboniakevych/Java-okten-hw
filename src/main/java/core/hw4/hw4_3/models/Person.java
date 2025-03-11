package core.hw4.hw4_3.models;

import core.hw4.hw4_3.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skill;
    private Car car;

    public List<Skill> getSkills() {
        return skill;
    }

}
