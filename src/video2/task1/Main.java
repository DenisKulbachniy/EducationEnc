package video2.task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2017);
        Car car3 = new Car(2019, "green");

        System.out.println(car1.getYear() + " " + car1.getColor());
        System.out.println(car2.getYear() + " " + car2.getColor());
        System.out.println(car3.getYear() + " " + car3.getColor());
    }
}
