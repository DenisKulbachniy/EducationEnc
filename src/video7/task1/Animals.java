package video7.task1;

public enum  Animals {
    Animal1(2), Animal2(4), Animal3(6);
    private int year;
    Animals(int year){
        this.year = year;
    }
    public String toString(){
        return this.name() + " : " + year;
    }

}
