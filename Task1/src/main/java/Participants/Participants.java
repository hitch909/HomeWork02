package Participants;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Participants implements Skills, Limitations {
    public Integer number;

    public Participants(Integer n) {
        this.number = n;
    }

    @Override
    public double limitationsLengthRun() {
        return 0;
    }

    @Override
    public double limitationsJumpHeight() {
        return 0;
    }

    @Override
    public double limitationsJumpLength() {
        return 0;
    }

    public void showLimitations() {
    }

    @Override
    public void run() {
    }

    @Override
    public void jump() {
    }

    public void raceParti(double treadmill, double pit, double wall, Participants participants) {
        if (treadmill <= participants.limitationsLengthRun()) System.out.println("участник " +participants+ " прошел первую дистанцию");
        else System.out.println("участник "+participants+" выбывает");
        if (pit <= participants.limitationsJumpLength()) System.out.println("участник "+participants+" прошел вторую дистанцию");
        else System.out.println("участник " +participants+" выбывает");
        if (wall <= participants.limitationsJumpHeight()) System.out.println("участник "+participants+" прошел всю дистанцию");
        else System.out.println("участник "+participants+"  выбывает");
    }
}
