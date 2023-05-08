package com.bobocode.model;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

/**
 * TODO: you're job is to implement mapping for JPA entity {@link Movie}
 * - explicitly specify the table name
 * - specify id
 * - configure id as auto-increment column, choose an Identity generation strategy
 * - explicitly specify each column name ("id", "name", "director", and "duration" accordingly)
 * - specify not null constraint for fields {@link Movie#name} and {@link Movie#director}
 */
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
    private Long id;
@Column(name = "name")
@NotNull
    private String name;
    @NotNull
    @Column(name = "director")
    private String director;
    @Column(name = "duration")
    private Integer durationSeconds;
}