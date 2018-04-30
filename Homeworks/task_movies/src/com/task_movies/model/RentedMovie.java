package com.task_movies.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RentedMovie extends Movie{

    private final LocalDate dueDate;

    public RentedMovie(String editor, String title, String genre,
                       double imdbRating, String releaseDate) {
        super(editor, title, genre, imdbRating, releaseDate);
        this.dueDate = LocalDate.now().plusWeeks(1);
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
