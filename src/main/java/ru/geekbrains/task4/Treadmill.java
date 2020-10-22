package ru.geekbrains.task4;

public class Treadmill extends Obstacles implements Treadmill1{
    private final int theLongRoad;

    public Treadmill(int theLongRoad) {
        this.theLongRoad = theLongRoad;
    }

    public int getTheLongRoad() {
        return this.theLongRoad;
    }

    @Override
    public String getType() {
        return "treadmill";
    }

}
