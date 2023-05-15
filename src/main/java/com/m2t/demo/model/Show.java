package com.m2t.demo.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "show")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Show {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "title")
    private String title;

    @Column(name = "release_year")
    private Integer releaseYear;

    @Column(name = "number_of_seasons")
    private Integer numberOfSeasons;

    public Show(String title, Integer releaseYear, Integer numberOfSeasons) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.numberOfSeasons = numberOfSeasons;
    }

    @Override
    public String toString() {
        return "Show {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + releaseYear + '\'' +
                ", numberOfSeasons=" + numberOfSeasons +
                '}';
    }
}