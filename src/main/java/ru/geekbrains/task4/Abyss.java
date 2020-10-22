package ru.geekbrains.task4;

public class Abyss extends Obstacles implements Abyss1 {
    private final int theLengthAbyss;

    public Abyss(int theLengthAbyss) {
        this.theLengthAbyss = theLengthAbyss;
    }

    public int getTheLengthAbyss() {
        return this.theLengthAbyss;
    }

    @Override
    public String getType(){
        return "Abyss";
    }

}
