package ru.geekbrains.task4;

public class Treadmill extends Obstacles{
    private final int theLongRoad;

    public Treadmill(int theLongRoad) {
        this.theLongRoad = theLongRoad;
    }

    @Override
    public int getTheLongRoad() {
        return theLongRoad;
    }

    @Override
    public String getType() {
        return "treadmill";
    }

    @Override
    public int getTheHeightWall() {
        return 0;
    }

}
