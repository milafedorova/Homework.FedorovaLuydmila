package ru.geekbrains.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MyTask3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sec = Integer.parseInt(reader.readLine());
        System.out.println(formatTime(sec));
    }
    public static String formatTime(int sec){
        String itog;
        int hour = sec/3600;
        int min = (sec%3600)/60;
        int sec1 = sec%60;
        itog = String.format("%02d:%02d:%02d", hour, min, sec1);
        return itog;
    }
}

