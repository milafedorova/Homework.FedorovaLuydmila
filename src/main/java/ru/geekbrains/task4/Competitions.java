package ru.geekbrains.task4;

import java.util.Arrays;

public class Competitions {
    public static void main(String[] args) {
        Participants[] participants = {
                new Cat("Васька", 3),
                new Human("Игорь", 25),
                new Robot("R2D2", 3)
        };
        Obstacles [] obstacles = {
                new Treadmill(20),
                new Wall(60)
        };

        for (int i =0; i < participants.length; i++){
            boolean val = true;
            for (int j = 0; j < obstacles.length; j++){
                if (val){
                    if (obstacles[j].getType() == "Wall"){
                        val = participants[i].jump(obstacles[j].getTheHeightWall());
                    } else {
                        val = participants[i].run(obstacles[j].getTheLongRoad());
                    }
                }
            }
        }
    }

}
