package core.hw2.hw2_2.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@ToString(callSuper = true)

public class Laptop extends PC{

    private double weight;

    public Laptop(String processor, int ram, double weight) {
        super(processor, ram);
        this.weight = weight;
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is off");
    }

}
