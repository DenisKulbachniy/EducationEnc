package currency_exchange;

public class Conversion {
    public static final double USD_To_Euro1 = 0.85;
    public static final double USD_to_Hryvnia2 = 27.44;
    public static final double Euro_To_USD3 = 1.18;
    public static final double Euro_To_Hryvnia4 = 32.34;
    public static final double Hryvnia_To_USD5 = 0.036;
    public static final double Hryvnia_To_Euro6 = 0.031;

    static double convertUSDtoEUR(double sum) {
        return sum * USD_To_Euro1;
    }

    static double conv2(double sum) {
        return sum * USD_to_Hryvnia2;
    }

    static double conv3(double sum) {
        return sum * Euro_To_USD3;
    }

    static double conv4(double sum) {
        return sum * Euro_To_Hryvnia4;
    }

    static double conv5(double sum) {
        return sum * Hryvnia_To_USD5;
    }

    static double conv6(double sum) {
        return sum * Hryvnia_To_Euro6;
    }


}




