package com.task_movies.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {
    private final String editor;
    private final String title;
    private final String genre;
    private double imdbRating;
    private final LocalDate releaseDate;


    public Movie(String editor, String title, String genre,
                 String releaseDate) {
        this.editor = editor;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDateInput(releaseDate);
    }

    public Movie(String editor, String title, String genre,
                 double imdbRating, String releaseDate) {
        this.editor = editor;
        this.title = title;
        this.genre = genre;
        setImdbRating(imdbRating);
        this.releaseDate = releaseDateInput(releaseDate);
    }


    public void setImdbRating(double imdbRating) {
        if (imdbRating >= 0 && imdbRating <= 10)
        this.imdbRating = imdbRating;
    }

    public LocalDate releaseDateInput(String dateInput){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateInput, dateFormat);
    }

    public String getEditor() {
        return editor;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
