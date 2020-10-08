package Task2;

public class Author {
    private String author;

    public Author(String name) {
        this.author = name;
    }

    public Author() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void show(){
        System.out.println(this.author);
    }

}
