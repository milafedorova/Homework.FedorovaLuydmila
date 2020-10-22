package ru.geekbrains.task4;


public class Fish extends Participants implements Swim{
    private final String name;
    private int age;

    private static final int THE_LENGTH_OF_POOL = 300;


    public boolean swim(int theLengthPool){
        if (theLengthPool <= THE_LENGTH_OF_POOL) {
            System.out.println(this.name + " успешно переплыл бассейн");
            return true;
        } else {
            System.out.println(this.name + " не смог переплыл бассейн");
            return false;
        }
    }

    public Fish(String name, int age){
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
