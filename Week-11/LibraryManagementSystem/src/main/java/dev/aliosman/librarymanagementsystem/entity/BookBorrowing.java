package dev.aliosman.librarymanagementsystem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrowing")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "book_borrowing_name", nullable = false)
    private String name;

    @Column(name="book_borrowing_date",nullable = false)
    private LocalDate borrowingDate;

    @Column(name="book_return_date",nullable = false)
    private LocalDate returnDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_borrowing_book_id", referencedColumnName = "book_id")
    private Book book;

    public BookBorrowing() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
