package core.hw4.hw4_4;

import core.hw4.hw4_4.club.Person;
import core.hw4.hw4_4.club.Pet;
import core.hw4.hw4_4.club.ZooClub;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


                Person person1 = new Person("Alice", 25);
                Person person2 = new Person("Bob", 30);


                Pet pet1 = new Pet(12, "Buddy");
                Pet pet2 = new Pet(22, "Mittens");
                Pet pet3 = new Pet(87, "Goldie");


                Map<Person, List<Pet>> clubMap = new HashMap<>();

                ZooClub zooClub = new ZooClub(clubMap);

                zooClub.addMember(person1);
                zooClub.addMember(person2);

                zooClub.addPetToMember(person1, pet1);
                zooClub.addPetToMember(person1, pet2);
                zooClub.addPetToMember(person2, pet3);

                zooClub.displayClub();

                zooClub.removePetFromMember(person1, pet2);
                zooClub.removeMemberOutOfClub(person2);

                zooClub.removePetFromAll(pet1);

                zooClub.displayClub();
            }
        }


