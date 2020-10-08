package GetteruISetteru;

public class Main {
    public static void main(String[] args) {
        VolumeOfPivo volumeOfPivo = new VolumeOfPivo();
        volumeOfPivo.setPrice(50);
        volumeOfPivo.setVolume(5);
        System.out.println(volumeOfPivo.getPrice());
        System.out.println(volumeOfPivo.getVolume());
    }
}
