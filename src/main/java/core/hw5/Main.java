package core.hw5;

import core.hw5.cars.Car;
import core.hw5.cars.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

//        створити ArrayList зі словами на 15-20 елементів.
        List<String> words = new ArrayList<>();
        Collections.addAll(words, "banana", "apple","fruit", "cherry", "elephant",
                "fantasy", "g", "illusion", "jungle",
                "kiwi", "li", "mountain", "notebook", "ocean",
                "paradise", "quantum", "rainbow", "sunshine", "twilight", "harmony");

//                - відсортувати його за алфавітом
        words.sort(String::compareToIgnoreCase);
        System.out.println(words);

//                *-- відфільтрувати слова довжиною менше 4 символів
        words.removeIf(s -> s.length() < 4);
        System.out.println(words);



//        - Створити масив з 20 числами.
        List<Integer> numbers = Arrays.asList(12, 45, 30, 27, 60, 9, 21, 3, 50, 100,
                15, 33, 81, 90, 7, 18, 24, 36, 55, 42);

//                - за допомогою способу sorted відсортувати масив.
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

//                -- за допомогою filter отримати числа кратні 3
        List<Integer> multiplesOf3 = numbers.stream()
                .filter(n -> n % 3 == 0)
                .collect(Collectors.toList());
        System.out.println(multiplesOf3);

//                -- за допомогою filter отримати числа кратні 10
        List<Integer> multiplesOf10 = numbers.stream()
                .filter(n -> n % 10 == 0)
                .collect(Collectors.toList());
        System.out.println(multiplesOf10);

//                -- перебрати (проітерувати) масив за допомогою foreach()
        numbers.forEach(n -> System.out.print(n + " "));
        System.out.println();

//                -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
        List<Integer> tripledNumbers = numbers.stream()
                .map(n -> n * 3)
                .collect(Collectors.toList());
        System.out.println(tripledNumbers);


//        Створити клас автомобіля з полями:
//        Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//                Власник автомобіля теж має бути обєкт, у якого є поля
//        Імя, вік, стаж водіння.
//                Створити не менше 7 та не більше 20 машинок.
//                Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//        Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//        Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//                Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//        Все через stream API

        List<Car> cars = List.of(
                new Car("Skoda", 220, new Driver("Kate", 30, 2.5), 23000, 2023),
                new Car("Volvo", 235, new Driver("Bob", 34, 6.0), 27500, 2020),
                new Car("Porsche", 260, new Driver("Ann", 47, 11.0), 45000, 2021),
                new Car("Mercedes", 255, new Driver("Jeremy", 27, 8.0), 36400, 2019),
                new Car("Volkswagen", 225, new Driver("Miley", 25, 3.5), 18000, 2018),
                new Car("BMW", 250, new Driver("Nika", 22, 3.0), 40000, 2022),
                new Car("Volvo", 235, new Driver("Steve", 29, 7.0), 29500, 2021)
        );

        increaseEnginePower(cars);
        updateDriverExperience(cars);
        calculateTotalPrice(cars);
    }

    private static void increaseEnginePower(List<Car> cars) {
        List<Double> increasedEnginePower = cars.stream()
                .map(c -> c.getEnginePower() * 1.1)
                .collect(Collectors.toList());

        System.out.println("Increased engine power: " + increasedEnginePower);
    }

    private static void updateDriverExperience(List<Car> cars) {
        cars.stream()
                .filter(c -> c.getDriver().getExperience() < 5)
                .filter(c -> c.getDriver().getAge() > 25)
                .forEach(c -> {
                    Driver driver = c.getDriver();
                    driver.setExperience(driver.getExperience() + 1);
                    System.out.println("Experience after taking the course: " + driver);
                });
    }

    private static void calculateTotalPrice(List<Car> cars) {
        int totalPrice = cars.stream()
                .mapToInt(Car::getPrice)
                .sum();

        System.out.println("Total price: " + totalPrice);
    }
}
