public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int num;
        for (int i = 0; i < array.length; i++) {
            for (num = 0; num % 2 < array.length; num++) {
                if (num < i){
                    System.out.println(num);
                }


            }
        }
    }
}

