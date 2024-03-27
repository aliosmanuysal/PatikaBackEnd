public class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String authorName;
    private String publicationDate;

    public Book(String title, int pageCount, String authorName, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }



    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", authorName='" + authorName + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
