package video2.Task2;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(){
        this.year = 2008;
        this.speed = 100.00;
        this.weight = 1000;
        this.color = "blue";
    }
    public Car(int year){
        this.year = year;
        this.speed = 120.00;
        this.weight = 1200;
        this.color = "black";
    }
    public Car(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight = 3000;
        this.color = "white";
    }
    public Car(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "black";
    }
    public Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
