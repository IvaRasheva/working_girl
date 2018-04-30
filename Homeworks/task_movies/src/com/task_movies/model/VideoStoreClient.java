package com.task_movies.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VideoStoreClient {
    private final String clientId;
    private final List<RentedMovie> rentedMovies;

    public VideoStoreClient(String clientId) {
        this.clientId = clientId;
        rentedMovies = new ArrayList<RentedMovie>();
    }

    public void rentAMovie(String editor, String title, String genre,
                           double imdbRating, String releaseDate){
        rentedMovies.add(new RentedMovie(editor, title, genre,
        imdbRating, releaseDate));
    }

    public void returnMovie(String title) {
        rentedMovies.remove(seacrhRentedMovieIdx(title));
    }

    public boolean exceededDueDate() {
        LocalDate dataNow = LocalDate.now();

        for (int i = 0; i < rentedMovies.size();i++) {
            if (rentedMovies.get(i).getDueDate().isAfter(dataNow))
                return true;
        }
         return false;
    }

    public boolean hasMovie(String title) {
        for (RentedMovie rm : rentedMovies){
            if (rm.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    private int seacrhRentedMovieIdx(String title) {
        for (int i = 0; i < rentedMovies.size(); i++){
            if (rentedMovies.get(i).getTitle().equals(title))
                return i;
        }
        return -1;
    }

    public String getClientId() {
        return clientId;
    }
}
