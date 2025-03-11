package core.hw4.hw4_4.club;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ZooClub {
    private Map<Person, List<Pet>> club;

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPetToMember(Person person, Pet pet) {
        if (club.containsKey(person)) {
            club.get(person).add(pet);
        } else {
            System.out.println("Person " + person.getName() + " does not have a pet");
        }
    }
    public void removePetFromMember(Person person, Pet pet) {
        if (club.containsKey(person)) {
            List<Pet> pets = club.get(person);
            if (pets.remove(pet)) {
                System.out.println("The pet is removed from the club.");
            } else {
                System.out.println("There is no such pet.");
            }
        } else{
            System.out.println("Person " + person.getName() + " does not exist");
        }
    }

    public void removeMemberOutOfClub(Person person) {
        if (club.containsKey(person)) {
            club.remove(person);
            System.out.println(person.getName() + " has been removed from the club");
        }else{
            System.out.println(person.getName() + " has never been a club member");
        }
    }
    public void removePetFromAll(Pet pet) {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            List<Pet> pets = entry.getValue();
            if (pets.remove(pet)){
                System.out.println("The pet is successfully removed from the club.");
            } else {
                System.out.println("There is no such pet.");
            }
        }
    }

    public void displayClub() {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            System.out.println("Participant: " + entry.getKey());
            System.out.println("Pets: " + entry.getValue());
        }
    }

}
