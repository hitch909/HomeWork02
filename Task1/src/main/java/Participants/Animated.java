package Participants;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Animated extends Participants  {
    private String name;
    private int age;

    public Animated(Integer n, String name, int age) {
        super(n);
        this.name = name;
        this.age = age;
    }
}
