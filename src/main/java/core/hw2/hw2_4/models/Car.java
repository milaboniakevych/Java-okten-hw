package core.hw2.hw2_4.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {
    private String model;
    private int year;
    private int power;
}

