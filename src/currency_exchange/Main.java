package currency_exchange;

import java.util.Scanner;

import static currency_exchange.Conversion.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите какую валюту вы будете менять: USD, EUR, HRN ");
        String choice1 = in.next();
        System.out.println("Выберете на какую вылюту вы будете менять: USD, EUR, HRN ");
        String choice2 = in.next();
        System.out.println("Введите вашу сумму: ");
        double amountToExchange = in.nextDouble();

        if (choice1.equals("USD") && choice2.equals("EUR")) {
            System.out.println("Конвертация доллара в евро: " + convertUSDtoEUR(amountToExchange) + "евро");
        } else if (choice1.equals("USD") && choice2.equals("HRN")) {
            System.out.println("Конвертация доллара в гривну: " + conv2(amountToExchange) + "гривен");
        } else if (choice1.equals("EUR") && choice2.equals("USD")) {
            System.out.println("Конвертация евро в доллар: " + conv3(amountToExchange) + "$");
        } else if (choice1.equals("EUR") && choice2.equals("HRN")) {
            System.out.println("Конвертация евро в гривну: " + conv4(amountToExchange) + "гривен");
        } else if (choice1.equals("HRN") && choice2.equals("USD")) {
            System.out.println("Конвертация гривны в доллар: " + conv5(amountToExchange) + "$");
        } else if (choice1.equals("HRN") && choice2.equals("EUR")) {
            System.out.println("Конвертация гривны в евро: " + conv6(amountToExchange) + "евро");
        } else {
            System.out.println("Что-то пошло не так))");
        }
    }
}
