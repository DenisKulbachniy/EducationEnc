package video6.task2;

public class Main {
    public static void main(String[] args) {
        Distance.Converter converter = new Distance.Converter();
        Distance distance = new Distance();
        System.out.println(converter.fromKMtoM(50));
        System.out.println(converter.fromMtoKM(35));
    }
}
