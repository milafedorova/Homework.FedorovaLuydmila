package ru.geekbrains.task2;
import java.util.Arrays;


public class MyTask2 {
    public static void main(String[] args) {
        int[] myArray = {-10, 7, 2, 1227, 87, 998, -877, 3, 0, 5, 99};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
}