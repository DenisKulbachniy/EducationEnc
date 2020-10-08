package video6.task2;

public class Distance {
    double distance;
    public String print() {
        return "Sobluday distanciu";

    }
    public static class Converter{
        public double fromMtoKM(double m){
            return m/1000;
        }
        public double fromKMtoM(double km){
            return km*1000;
        }
    }
}
