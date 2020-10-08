package video5.task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Snake");
        arrayList.add("Bird");
        arrayList.add("Monkey");
        arrayList.add("Lion");
        arrayList.add("Elephant");
        arrayList.add("Horse");
        arrayList.remove(6);
        arrayList.remove(4);
        arrayList.remove(2);
        System.out.println(arrayList.size());
    }
}
