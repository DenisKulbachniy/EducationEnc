package video3.task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(15000, 200, 2019);
        Plane plan = new Plane(38000, 1000, 2009, 3, 1024);
        Ship ship = new Ship(12000, 80, 2016, 364, "Kharkiv");
        car.show();
        plan.show();
        ship.show();


    }
}
