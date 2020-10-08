package video3.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int proKey = 2222;
        int expertKey = 5555;

        Scanner in = new Scanner(System.in);
        System.out.println("Выберете, что хотите сделать с документом: Открыть , Редактировать, Сохранить: ");
        String choice1 = in.next();
        if (choice1.equals("Открыть")) {
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
        }else if(choice1.equals("Редактировать")) {
            System.out.println("Введите номер ключа: ");
        } else if (choice1.equals("Сохранить")){
            System.out.println("Введите номер ключа: ");
        } else {
            System.out.println("Вы можете пользоваться только бесплатной версией");
        }
        int choice2 = in.nextInt();
        if(choice2 == proKey) {
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.editDocument();
        }else if(choice2 == expertKey){
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            expertDocumentWorker.saveDocument();
        }else {
            System.out.println("Вы можете пользоваться только бесплатной версией");
        }
    }
}
