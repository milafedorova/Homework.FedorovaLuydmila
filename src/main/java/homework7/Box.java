package homework7;

import java.util.ArrayList;

public class Box<F extends Fruit> {
    private ArrayList<F> Fruits = new ArrayList();


    public String getTypeOfFruit(){
        return Fruits.getClass().getName();
    }

    public void addFruitInBox(Fruit fruit){
        this.Fruits.add((F) fruit);
    }

    public void pullFruitFromBox(Fruit fruit){
        this.Fruits.remove(fruit);
    }

    public void pushFruitFromOtherBox(Box<?> box, Fruit fruit){
        if (!box.Fruits.isEmpty()){
            if (this.Fruits.isEmpty()){
                this.addFruitInBox(fruit);
                box.pullFruitFromBox(fruit);
            }else if (box.Fruits.get(0).getClass().getName() == (this.Fruits.get(0).getClass().getName())){
                this.addFruitInBox(fruit);
                box.pullFruitFromBox(fruit);
            } else {
                System.out.println("This Box for other fruits");
            }
        } else{
            System.out.println("Box is empty");
        }
    }

    public Double getWeight(){
        Double sum = 0.0;
        if (!Fruits.isEmpty()){
            for (int i = 0; i < this.Fruits.size(); i++) {
                sum = sum + Fruits.get(i).getWeightOneFruit();
            }
        }
        return sum;
    }

    public void pushAllFruitFromBox(Box<?> box){
        if (!box.Fruits.isEmpty()){
            if (this.Fruits.isEmpty()) {
                while (!box.Fruits.isEmpty()) {
                    this.pushFruitFromOtherBox(box, (F) box.Fruits.get(0));
                }
            } else if (box.Fruits.get(0).getClass().getName() == (this.Fruits.get(0).getClass().getName())) {
                while (!box.Fruits.isEmpty()) {
                    this.pushFruitFromOtherBox(box, (F) box.Fruits.get(0));
                }
            } else {
                System.out.println("Box for other fruit");
            }
        } else {
            System.out.println("Box is empty");
        }

    }

    public boolean compare(Box<?> box){
        int a = box.Fruits.size();
        int b = this.Fruits.size();
        return a == b;
    }

    public static void main(String[] args) {
        Apple apple1 = new Apple(1.0);
        Apple apple2 = new Apple(1.0);
        Apple apple3 = new Apple(1.0);

        Orange orange1 = new Orange(1.5);
        Orange orange2 = new Orange(1.5);
        Orange orange3 = new Orange(1.5);

        Box<Orange> orangeBox = new Box();
        orangeBox.addFruitInBox(orange1);
        orangeBox.addFruitInBox(orange2);
        orangeBox.addFruitInBox(orange3);

        Box<Apple> appleBox = new Box();
        appleBox.addFruitInBox(apple1);
        appleBox.addFruitInBox(apple2);
        appleBox.addFruitInBox(apple3);

        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox2 = new Box();

        orangeBox2.pushAllFruitFromBox(orangeBox);
        orangeBox2.pushAllFruitFromBox(orangeBox);

        appleBox2.pushAllFruitFromBox(appleBox);
        orangeBox2.pushAllFruitFromBox(appleBox2);

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox2.getWeight());
    }
}
