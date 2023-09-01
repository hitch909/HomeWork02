package Participants;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Human extends Animated  {
    public Human(Integer n, String name, int age) {
        super(n, name, age);
    }

    @Override
    public void run() {
        System.out.println("бегает быстро");
    }

    @Override
    public void jump() {
        System.out.println("прыгает высоко");
    }

    @Override
    public String toString() {
        return "Human{" +
                "number=" + number + " " + getName();
    }

    @Override
    public double limitationsLengthRun() {
        return 5000;
    }

    @Override
    public double limitationsJumpHeight() {
        return 1.8;
    }

    @Override
    public double limitationsJumpLength() {
        return 3.4;
    }
    public void showLimitations(){
        System.out.println("длинна бега: "+ limitationsLengthRun()+ " высота прыжка: "+ limitationsJumpHeight()
                +" длинна прыжка: "+ limitationsJumpLength());
    }
}
