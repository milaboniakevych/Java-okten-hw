package core.hw2.hw2_2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class PC {

    private String processor;
    private int ram;

    public abstract void turnOn();
    public abstract void turnOff();
}
