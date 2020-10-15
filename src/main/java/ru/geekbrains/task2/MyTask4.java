package ru.geekbrains.task2;
import java.util.Arrays;

public class MyTask4 {
    public static void main(String[] args) {
        int[] myArray = {-10, 7, 1227, 87, 998, -877, 3, 0, 5, 99};
        reverseArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }
    public static void reverseArray(int[] myArray){
        for (int i = 0; i < myArray.length/2; i++){
            int x = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = myArray[i];
            myArray[i] = x;
        }
    }
}
