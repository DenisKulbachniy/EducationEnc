package Staroe;

import java.util.Scanner;

public class NewJava {
    public static void main(String[] args) {
        String Login = "Denis";
        String Password = "Merefa";
        Scanner it = new Scanner(System.in);
        System.out.println("Введите ваш логин");
        String myLogin = it.next();
        if (Login.equals(myLogin)) {
            System.out.println("Введите пароль");
            String myPassword = it.next();
            if (Password.equals(myPassword)) {
                System.out.println("Поздравляем, вы вошли в систему");
            } else {
                    System.out.println("Вы ввели неверный пароль");
            }
        }else {
                System.out.println("Нет пользователя с таким логином");
            }

        }
    }

