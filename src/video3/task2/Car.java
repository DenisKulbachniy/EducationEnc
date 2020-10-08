package video3.task2;

public class Car extends Vehicle {
    public Car(int price, int speed, int year) {
        super(price, speed, year);
    }
    public void show(){
        System.out.println(getPrice() + " , " + getSpeed() + " , " + getYear());
    }
}


