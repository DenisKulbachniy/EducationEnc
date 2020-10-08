package oopTask2;

public class BookMain {
    public static void main(String[] args) {
        Author author = new Author();
        Content content = new Content();
        Title title = new Title();

        author.setPeterJackson("Peter Jackson");
        content.setReturnOfTheKing("Return of The King");
        title.setLordOfTheRings("Lord Of The Rings");
        author.show();
        content.show();
        title.show();

    }

}
