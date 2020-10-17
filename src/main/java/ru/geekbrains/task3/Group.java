package ru.geekbrains.task3;

import javafx.scene.SubScene;

public class Group {
    private String nameGroup;
    private Employee[] employees = new Employee[10];
    int pos = -1;

    public static void main(String[] args){
        Group Moya = new Group();
        Moya.addEmpToGroup();
        Moya.addEmpToGroup();
        Moya.addEmpToGroup();

        Moya.dellIndexEmpToGroup(1);
        Moya.listInfo();
        Moya.fullDellGroup();
        Moya.listInfo();
    }

    public void addEmpToGroup(){
        if (pos>= employees.length){
            System.out.println("Group is full");
            return;
        }
        Employee Lyuda = new Employee();
        Lyuda.addEmployee();
        employees[++pos] = Lyuda;
    }
    public void fullDellGroup(){
        pos=-1;
        System.out.println("Все позиции удалены");
    }

    public void dellIndexEmpToGroup(int index){
        if (index>=pos){
            System.out.println("Ячейка и так пустая");
            return;
        }
        employees[index] = employees[pos];
        pos = pos -1;

    }

    public void listInfo(){
        if (pos == -1) {
            System.out.println("Список пустой");
            return;
        }
        for(int i=0;i <= pos;i++){
            employees[i].info();
        }
    }

}
