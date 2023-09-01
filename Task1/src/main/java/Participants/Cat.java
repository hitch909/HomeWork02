package Participants;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cat extends Animated  {
    public Cat(Integer n, String name, int age) {
        super(n, name, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "number=" + number +" " +getName();
    }

    @Override
    public void run() {
        System.out.println("бегает очень быстро");
    }

    @Override
    public void jump() {
        System.out.println("прыгает очень высоко");
    }

    @Override
    public double limitationsLengthRun() {
        return 6000;
    }

    @Override
    public double limitationsJumpHeight() {
        return 4.5;
    }

    @Override
    public double limitationsJumpLength() {
        return 4.3;
    }

    @Override
    public void showLimitations() {
        System.out.println("длинна бега: "+ limitationsLengthRun()+ " высота прыжка: "+ limitationsJumpHeight()
                +" длинна прыжка: "+ limitationsJumpLength());
    }
}
