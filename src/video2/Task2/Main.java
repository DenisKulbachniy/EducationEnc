package video2.Task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2008);
        Car car3 = new Car(2009, 110.00);
        Car car4 = new Car(2015, 120.00, 1300);
        Car car5 = new Car(2018, 140.00, 2050, "Brown");
        System.out.println("Год: " + car1.getYear() + " Средняя скорость: " + car1.getSpeed() + " Вес: " + car1.getWeight() + " Цвет: " + car1.getColor());
        System.out.println("Год: " + car2.getYear() + " Средняя скорость: " + car2.getSpeed() + " Вес: " + car2.getWeight() + " Цвет: " + car2.getColor());
        System.out.println("Год: " + car3.getYear() + " Средняя скорость: " + car3.getSpeed() + " Вес: " + car3.getWeight() + " Цвет: " + car3.getColor());
        System.out.println("Год: " + car4.getYear() + " Средняя скорость: " + car4.getSpeed() + " Вес: " + car4.getWeight() + " Цвет: " + car4.getColor());
        System.out.println("Год: " + car5.getYear() + " Средняя скорость: " + car5.getSpeed() + " Вес: " + car5.getWeight() + " Цвет: " + car5.getColor());
    }
}
