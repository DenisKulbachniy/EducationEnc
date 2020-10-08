package video3.task2;

public class Ship extends Vehicle {
    private int quantityOfPeople;
    private String portOfRegistration;

    public Ship(int price, int speed, int year, int quantityOfPeople, String portOfRegistration) {
        super(price, speed, year);
        this.quantityOfPeople = quantityOfPeople;
        this.portOfRegistration = portOfRegistration;
    }

    public int getQuantityOfPeople() {
        return quantityOfPeople;
    }

    public void setQuantityOfPeople(int quantityOfPeople) {
        this.quantityOfPeople = quantityOfPeople;
    }

    public String getPortOfRegistration() {
        return portOfRegistration;
    }

    public void setPortOfRegistration(String portOfRegistration) {
        this.portOfRegistration = portOfRegistration;
    }
    public void show(){
        System.out.println(getPortOfRegistration() + " , " + getQuantityOfPeople() + " , " + getPrice() +  " , " + getSpeed() + " , " + getYear());
    }
}