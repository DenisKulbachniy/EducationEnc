package Task2;

public class Title {
    private String title;

    public Title(String title) {
        this.title = title;
    }

    public Title() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void show(){
        System.out.println(this.title);
    }
}
