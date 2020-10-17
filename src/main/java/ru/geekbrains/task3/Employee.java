package ru.geekbrains.task3;
import java.util.Scanner;


public class Employee {
    private String name;
    private String email;
    private int age;
    private String position;

    public static void main(String[] args){
        Employee Luda = new Employee();

        Luda.addEmployee();
        Luda.info();
    }

    public void info(){
        System.out.println("Имя пользователя: "+ name);
        System.out.println("@mail: "+ email);
        System.out.println("Возраст: "+ age);
        System.out.println("Должность: "+ position);
    }

    public void addEmployee() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите имя:");
        name = reader.nextLine();
        System.out.println("Введите @mail:");
        email = reader.nextLine();
        System.out.println("Введите возраст:");
        age = Integer.parseInt(reader.nextLine());
        System.out.println("Введите должность:");
        position = reader.nextLine();
    }
}
