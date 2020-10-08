package video4.task2;

public class Player implements Playable, Recordable {
    public void play(){
        System.out.println("Запустить");
    }
    public void record(){
        System.out.println("Запись");
    }
    public void pause(){
        System.out.println("Приостановить");
    }
    public void stop(){
        System.out.println("Остановить");
    }

}
