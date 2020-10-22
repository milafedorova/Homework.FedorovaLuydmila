package ru.geekbrains.task4;

public class Human extends Participants implements Jump, Run, Swim{
    private final String name;
    private int age;
    private static final int THE_LENTH_OF_RUN = 50;
    private static final int THE_HEIGHT_OF_JUMP = 50;
    private static final int THE_LENGTH_OF_POOL = 50;


    public boolean run(int theLongRoad){
        if (theLongRoad <= THE_LENTH_OF_RUN) {
            System.out.println(this.name + " успешно пробежал дорожку");
            return true;
        } else {
            System.out.println(this.name + " не смог пробежать дорожку");
            return false;
        }
    }
    public boolean swim(int theLengthPool){
        if (theLengthPool <= THE_LENGTH_OF_POOL) {
            System.out.println(this.name + " успешно переплыл бассейн");
            return true;
        } else {
            System.out.println(this.name + " не смог переплыл бассейн");
            return false;
        }
    }

    public  boolean jump (int theHeightWall){
        if (theHeightWall <= THE_HEIGHT_OF_JUMP) {
            System.out.println(this.name + " успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println(this.name + " не смог перепрыгнуть стену");
            return false;
        }
    }

    public Human(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
