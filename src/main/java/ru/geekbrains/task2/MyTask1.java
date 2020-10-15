package ru.geekbrains.task2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MyTask1 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rowCount = Integer.parseInt(reader.readLine());
        int count = 0;

        while (count < rowCount){
            String space = "";
            String star = "";
            for (int i = 0; i < rowCount - count; i++ ){
                space += " ";
            }
            for (int i = 0; i < 2 * count + 1; i++){
                star += "*";
            }
            System.out.println(space+star);
            count++;
        }
    }
}
