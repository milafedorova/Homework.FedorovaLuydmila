package ru.geekbrains.task4;

public class Pool extends Obstacles implements Pool1{
    private final int theLengthPool;

    public Pool(int theLengthPool) {
        this.theLengthPool = theLengthPool;
    }

    public int getTheLengthPool() {
        return this.theLengthPool;
    }

    @Override
    public String getType(){
        return "Pool";
    }

}
