package Staroe;

public class methods {
    public static void main(String[] args) {
        myJob("Working at EPAM ", 2);
        myJob("Working at EPAM ", 1);
        myWork("Working at Softserve ", 2.4);
    }
    static void myJob(String being, int quantity){
        System.out.print(being);
        System.out.println(quantity + " years");
    }
    static void myWork(String where, double quantity){
        System.out.print(where);
        System.out.println(quantity + " years");

    }
}


