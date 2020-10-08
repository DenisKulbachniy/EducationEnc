package video2.task1;

public class Car {
    private int year;
    private String color;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(){
        year = 2015;
        color = "blue";
    }
    public Car(int year){
        this.year = year;
        this.color = "red";
    }

    public Car (int year, String color){
        this.year = year;
        this.color = color;
    }
}