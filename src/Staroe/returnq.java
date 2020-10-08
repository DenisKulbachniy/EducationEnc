package Staroe;

import java.util.Scanner;

public class returnq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Ведите второе число: ");
        int num2 = in.nextInt();
        System.out.println("Введите знак: ");
        String sym = in.next();
        switch (sym) {
            case "+":
                add(num1, num2);
                break;
            case "-":
                sub(num1, num2);
                break;
            case "*":
                mul(num1, num2);
                break;
            case "/":
                div(num1, num2);
                break;
        }
    }

    static void add(int num1, int num2) {
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
    }

    static void sub(int num1, int num2) {
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
    }

    static void mul(int num1, int num2) {
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
    }

    static void div(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Делить на 0 нельзя");
        }
        else {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        }
    }
}
