package Participants;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Robot extends Participants  {
    private String brand;
    private String model;

    public Robot(Integer n, String brand, String model) {
        super(n);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void run() {
        System.out.println("бегает очень быстро");
    }

    @Override
    public void jump() {
        System.out.println("прыгает не высоко");
    }


    @Override
    public double limitationsLengthRun() {
        return 5000;
    }

    @Override
    public double limitationsJumpHeight() {
        return 1.3;
    }

    @Override
    public double limitationsJumpLength() {
        return 2.5;
    }

    @Override
    public void showLimitations() {
        System.out.println("длинна бега: "+ limitationsLengthRun()+ " высота прыжка: "+ limitationsJumpHeight()
                +" длинна прыжка: "+ limitationsJumpLength());
    }
}
