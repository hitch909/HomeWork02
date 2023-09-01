package org.example;

/*
 1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса но есть общий класс родитель.
  Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
 должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
 печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
 (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
 этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
 списку он препятствий не идет.
*/

import Participants.Cat;
import Participants.Human;
import Participants.Participants;
import Participants.Robot;

import Obstacle.Obstacle;
import Obstacle.Pit;
import Obstacle.Treadmill;
import Obstacle.Wall;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello , this is our race");
        System.out.println("-----------------------------------------------------------------------------");

        Participants participants1= new Human(555,"Усэйн Болт", 37);
        Participants participants2 = new Cat(243,"Гепард", 8);
        Participants participants3 = new Robot(999, " Bugatti", " Veyron");
        ArrayList<Participants>participantsArrayList = new ArrayList<>();
        participantsArrayList.add(participants1);
        participantsArrayList.add(participants2);
        participantsArrayList.add(participants3);

            for (Participants i: participantsArrayList) {
                System.out.println(i);
            }
        System.out.println("___________________________________________________");

        Obstacle obstacles = new Obstacle();
        Treadmill treadmill = new Treadmill(3000);
        Pit pit = new Pit(2.5);
        Wall wall = new Wall(1.8);

        ArrayList<Obstacle> obstacleArrayList = new ArrayList<>();
       obstacles .addObstacles(obstacleArrayList, treadmill);
       obstacles.addObstacles(obstacleArrayList, pit);
       obstacles.addObstacles(obstacleArrayList, wall);

        System.out.println(participants1.toString());
        participants1.run();
        participants1.jump();
        participants1.showLimitations();
        System.out.println("_______________________________________________");
        System.out.println(participants2.toString());
        participants2.jump();
        participants2.run();
        participants2.showLimitations();
        System.out.println("___________________________________________________");
        System.out.println(participants3.toString());
        participants3.jump();
        participants3.run();
        participants3.showLimitations();
        System.out.println("______________________________________________________");
        obstacles.showObstacles(obstacleArrayList);

        System.out.println("______________________________");
        participants1.raceParti(3000, 2.5, 1.8, participants1);
        participants2.raceParti(3000, 2.5, 1.8, participants2);
        participants3.raceParti(3000, 2.5, 1.8, participants3);
        }
}