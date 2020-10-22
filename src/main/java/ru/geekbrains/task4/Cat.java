package ru.geekbrains.task4;

public class Cat extends Participants implements Run, Jump {
    private String name;
    private int age;
    private static final int THE_LENTH_OF_RUN = 10;
    private static final int THE_HEIGHT_OF_JUMP = 10;


    public Cat(String name, int age){
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

    public void setName(String name) {
        this.name = name;
    }

    public boolean jump(int theHeightWall) {
        if (theHeightWall <= THE_HEIGHT_OF_JUMP) {
            System.out.println(this.name + " успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println(this.name + " не смог перепрыгнуть стену");
            return false;
        }
    }

    public boolean run(int theLongRoad) {
        if (theLongRoad <= THE_LENTH_OF_RUN) {
            System.out.println(this.name + " успешно пробежал дорожку");
            return true;
        } else {
            System.out.println(this.name + " не смог пробежать дорожку");
            return false;
        }
    }

}
