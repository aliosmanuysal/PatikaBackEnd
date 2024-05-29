package dev.aliosman.librarymanagementsystem.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="autors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id", columnDefinition = "serial")
    private long id;

    @Column(name = "autor_name", nullable = false)
    private String name;

    @Column(name = "autor_birth_date", nullable = false)
    private LocalDate birthDate;

    @Column(name = "autor_country", nullable = false)
    private String country;

    @OneToMany(mappedBy = "author")
    private List<Book> bookList;


    public Author() {
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
