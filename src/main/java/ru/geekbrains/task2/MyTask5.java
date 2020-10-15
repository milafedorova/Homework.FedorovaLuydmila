package ru.geekbrains.task2;
import java.util.Arrays;

public class MyTask5 {
    public static void randomizeArray(int[] myArray){
        for (int i = 0; i < myArray.length;i++){
            int a = 0;
            int b = myArray.length;
            int c = a + (int)(Math.random()*b);
            int x = myArray[c];
            myArray[c] = myArray[i];
            myArray[i] = x;
        }
    }
    public static void main(String[] args) {
        int[] myArray = {-10, 7, 2, 1227, 87, 998, -877, 3, 0, 5, 99};
        randomizeArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
