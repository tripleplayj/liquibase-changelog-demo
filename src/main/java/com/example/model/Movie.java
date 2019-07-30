
package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "MOVIE")
public class Movie {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String genre;


    @Column
    private String title;

    @Column
    private String releaseDate;

    public Movie() {
    }

    public Movie(Integer id, String genre) {
        this.id = id;
        this.genre = genre;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
