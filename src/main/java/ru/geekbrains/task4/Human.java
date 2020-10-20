package ru.geekbrains.task4;

public class Human extends Participants {
    private final String name;
    private int age;
    private static final int THE_LENTH_OF_RUN = 50;
    private static final int THE_HEIGHT_OF_JUMP = 50;

    @Override
    public boolean run(int theLongRoad){
        if (theLongRoad <= THE_LENTH_OF_RUN) {
            System.out.println(this.name + " успешно пробежал дорожку");
            return true;
        } else {
            System.out.println(this.name + " не смог пробежать дорожку");
            return false;
        }
    }
    @Override
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
