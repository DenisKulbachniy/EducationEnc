package Staroe;

import java.util.Scanner;

public class RoadToIT {
    public static void main(String[] args) {
        int nashePivo;
        System.out.println("Введите номер пива, которое вы хотите сегодня выпить");
        Scanner pivas = new Scanner(System.in);
        nashePivo = pivas.nextInt();
        switch (nashePivo) {
            case 1:
                System.out.println("Львовское");
                break;
            case 2:
                System.out.println("Московское");
                break;
            case 3:
                System.out.println("Пражское");
                break;
            case 4:
                System.out.println("Вайсбург");
                break;
            case 5:
                System.out.println("Темын детский сидр");
                break;
            default:
                System.out.println("Канину по мужски");
                break;
        }
    }
}
