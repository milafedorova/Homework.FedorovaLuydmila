package ru.geekbrains.task4;

public class Wall extends Obstacles implements Wall1{
    private final int theHeightWall;

    public Wall(int theHeightWall) {
        this.theHeightWall = theHeightWall;
    }


    public int getTheHeightWall() {
        return theHeightWall;
    }

    @Override
    public String getType(){
        return "Wall";
    }

}
