package oopTask2;

public class Title {
    private String LordOfTheRings;
    public String getLordOfTheRings(){
        return LordOfTheRings;
    }

    public void setLordOfTheRings(String LordOfTheRings) {
        this.LordOfTheRings = LordOfTheRings;
    }
    void show(){
        System.out.println(this.LordOfTheRings);
    }
}
