package com.platzi.javatests.movies.model;

public class Movie {
    private final Integer id;
    private final String name;
    private final int minutes;
    private final Genre genre;

    public Movie(String name, int minutes, Genre genre) {
        this(null, name, minutes, genre);
    }

    public Movie(Integer id, String name, int minutes, Genre genre) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.genre = genre;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public Genre getGenre() {
        return genre;
    }
}
