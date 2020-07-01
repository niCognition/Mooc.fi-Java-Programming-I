public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
