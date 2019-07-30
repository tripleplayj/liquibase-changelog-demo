
package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "MOVIE")
public class Movie {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;

    @Column
    private String genre;

    public Movie() {
    }

    public Movie(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Movie(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
