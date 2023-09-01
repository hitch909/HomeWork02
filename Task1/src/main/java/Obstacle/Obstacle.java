package Obstacle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;

@Getter
@Setter@AllArgsConstructor
@NoArgsConstructor
public class Obstacle {
    ArrayList<Obstacle> obstacleArrayList;

   public void addObstacles(ArrayList<Obstacle> obstacleArrayList, Obstacle obstacle){
   obstacleArrayList.add(obstacle);
   }

    public  void showObstacles(ArrayList<Obstacle> obstacleArrayList){
        System.out.println("список препятствий ");
        for (Obstacle i: obstacleArrayList ) {
            System.out.println(i);
        }
    }
}
