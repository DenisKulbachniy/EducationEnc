package Task2;

public class Main {
    public static void main(String[] args) {
        Book bookMain = new Book(new Author("Peter Jackson"), new Content("Return of the King"), new Title("Lord of the Rings"));

        bookMain.showBookInfo();
    }
}
