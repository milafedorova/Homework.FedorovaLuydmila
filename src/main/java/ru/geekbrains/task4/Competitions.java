package ru.geekbrains.task4;

import javax.swing.*;
import java.util.Arrays;

public class Competitions {
    public void Obst(){

    }
    public static void main(String[] args) {
        Participants[] participants = {
                new Cat("Васька", 3),
                new Human("Игорь", 25),
                new Robot("R2D2", 3),
                new Bird("Попка", 4),
                new Fish("Дори", 2)
        };
        Obstacles [] obstacles = {
                new Treadmill(20),
                new Wall(60),
                new Abyss(50),
                new Pool(40)
        };

        for (Participants pr : participants){
            boolean val = true;
            for (Obstacles obs : obstacles){
                if (val) {
                    if (pr instanceof Cat) {
                        if (obs.getType() == "Wall") {
                            Wall1 wall1 = (Wall1) obs;
                            val = ((Cat) pr).jump(wall1.getTheHeightWall());
                        } else if (obs.getType() == "treadmill") {
                            Treadmill1 treadmill1 = (Treadmill1) obs;
                            val = ((Cat) pr).run(treadmill1.getTheLongRoad());
                        } else {
                            System.out.println("Кошка не может приодолеть такое препятствие");
                            val = false;
                        }
                    } else if (pr instanceof Human) {
                        if (obs.getType() == "Wall") {
                            Wall1 wall1 = (Wall1) obs;
                            val = ((Human) pr).jump(wall1.getTheHeightWall());
                        } else if (obs.getType() == "treadmill") {
                            Treadmill1 treadmill1 = (Treadmill1) obs;
                            val = ((Human) pr).run(treadmill1.getTheLongRoad());
                        } else if (obs.getType() == "Pool"){
                            Pool1 pool1 = (Pool) obs;
                            val = ((Human) pr).swim(pool1.getTheLengthPool());
                        } else {
                            System.out.println("Человек не может приодолеть такое препятствие");
                            val = false;
                        }
                    } else if (pr instanceof Robot) {
                        if (obs.getType() == "Wall") {
                            Wall1 wall1 = (Wall1) obs;
                            val = ((Robot) pr).jump(wall1.getTheHeightWall());
                        } else if (obs.getType() == "treadmill") {
                            Treadmill1 treadmill1 = (Treadmill1) obs;
                            val = ((Robot) pr).run(treadmill1.getTheLongRoad());
                        } else {
                            System.out.println("Робот не может приодолеть такое препятствие");
                            val = false;
                        }
                    } else if (pr instanceof Fish) {
                        if (obs.getType() == "Pool"){
                            Pool1 pool1 = (Pool) obs;
                            val = ((Fish) pr).swim(pool1.getTheLengthPool());
                        } else {
                            System.out.println("Рыба не может приодолеть такое препятствие");
                            val = false;
                        }
                    } else if (pr instanceof Bird) {
                        if (obs.getType() == "Wall") {
                            Wall1 wall1 = (Wall1) obs;
                            val = ((Bird) pr).jump(wall1.getTheHeightWall());
                        } else if (obs.getType() == "treadmill") {
                            Treadmill1 treadmill1 = (Treadmill1) obs;
                            val = ((Bird) pr).run(treadmill1.getTheLongRoad());
                        } else if (obs.getType() == "Abyss") {
                            Abyss1 Abyss1 = (Abyss) obs;
                            val = ((Bird) pr).fly(Abyss1.getTheLengthAbyss());
                        } else {
                            System.out.println("Птица не может приодолеть такое препятствие");
                            val = false;
                        }
                    }

                }
            }
        }
    }

}
