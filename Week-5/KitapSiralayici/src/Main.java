import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Kitapları isme göre sıralamak için TreeSet kullanma
        Set<Book> booksByName = new TreeSet<>();
        booksByName.add(new Book("Java Programming", 500, "John Doe", "2020"));
        booksByName.add(new Book("Otostopçunun Galaksi Rehberi", 868, "Douglas Adams", "1979"));
        booksByName.add(new Book("Clean Code", 300, "Robert Martin", "2008"));
        booksByName.add(new Book("Suç ve Ceza", 687, "Fyodor Dostoyevski", "1866"));
        booksByName.add(new Book("Nutuk", 900, "Mustafa Kemal Atatürk", "1927"));

        System.out.println("Books sorted by name:");
        for (Book book : booksByName) {
            System.out.println(book);
        }

        // Kitapları sayfa sayısına göre sıralamak için TreeSet kullanma
        Set<Book> booksByPageCount = new TreeSet<>(Comparator.comparing(Book::getPageCount));
        booksByPageCount.addAll(booksByName);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
    }
}
