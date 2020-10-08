package Task2;

public class Book {
    private Author author;
    private Content content;
    private Title title;

    public Book(Author author, Content content, Title title) {
        this.author = author;
        this.content = content;
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void showBookInfo() {
        author.show();
        content.show();
        title.show();
    }
}


