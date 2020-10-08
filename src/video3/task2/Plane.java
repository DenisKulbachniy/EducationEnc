package video3.task2;

public class Plane extends Vehicle {
    private int height;
    private int quantityOfPeople;

    public Plane(int price, int speed, int year, int height, int quantityOfPeople) {
        super(price, speed, year);
        this.height = height;
        this.quantityOfPeople = quantityOfPeople;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getQuantityOfPeople() {
        return quantityOfPeople;
    }

    public void setQuantityOfPeople(int quantityOfPeople) {
        this.quantityOfPeople = quantityOfPeople;
    }

    public void show() {
        System.out.println(getHeight() + " , " + getQuantityOfPeople() + " , " + getPrice() + " , " + getSpeed() + " , " + getYear());
    }
}
