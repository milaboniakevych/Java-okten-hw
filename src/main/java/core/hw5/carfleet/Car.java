package core.hw5.carfleet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Car {

    private String name;
    private int enginePower;
    private Driver driver;
    private int price;
    private int year;
}
