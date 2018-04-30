package com.task_movies.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VideoStoreMovie extends Movie{

    private double rentPrice;
    private int availableQuantity;
    private final int totalQuantity;
    private double incomeByMovie;

    public VideoStoreMovie(String editor, String title, String genre,
                           double imdbRating, String releaseDate,
                           int totalQuantity, double rentPrice) {
        super(editor, title, genre, imdbRating, releaseDate);
        this.availableQuantity = totalQuantity;
        this.totalQuantity = totalQuantity;
        this.rentPrice = rentPrice;
        this.incomeByMovie = incomeByMovie;
    }

    public void incrIncomeByMovie(){
        incomeByMovie += rentPrice;
    }

    public double getIncomeByMovie() {
        return incomeByMovie;
    }

    public void decrAvailableQuantity () {
        if (availableQuantity > 0) {
            availableQuantity--;
        }
    }

    public void incrAvailableQuantity() {
        if (availableQuantity < totalQuantity) {
            availableQuantity++;
        }
    }

    public double getRentPrice() {
        return this.rentPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }
}
