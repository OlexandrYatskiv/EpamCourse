package com.bobocode.model;

import com.bobocode.util.ExerciseNotCompletedException;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Setter(AccessLevel.PRIVATE)
    @ManyToMany(  cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name ="author_book",
            joinColumns = @JoinColumn(name= "author_id"),
            inverseJoinColumns = @JoinColumn(name ="book_id" )
    )
    private Set<Book> books=new HashSet<>();



    public void addBook(Book book) {
        book.getAuthors().add(this);
        books.add(book);

    }

    public void removeBook(Book book) {

        book.getAuthors().remove(this);
        books.remove(book);

    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof Author && Objects.equals(id, ((Author) o).id));
    }
    @Override
    public int hashCode() {
        return 31;
    }


}