package ru.geekbrains.task4;

public class Wall extends Obstacles{
    private final int theHeightWall;

    public Wall(int theHeightWall) {
        this.theHeightWall = theHeightWall;
    }

    @Override
    public int getTheHeightWall() {
        return theHeightWall;
    }

    @Override
    public String getType(){
        return "Wall";
    }

    @Override
    public int getTheLongRoad() {
        return 0;
    }

}
