package com.task_movies.store;

import com.task_movies.database.ClientDB;
import com.task_movies.database.MovieDB;
import com.task_movies.model.VideoStoreClient;
import com.task_movies.model.VideoStoreMovie;

public class VideoStore {

    private static ClientDB client = new ClientDB();
    private static MovieDB movie = new MovieDB();
    private static VideoStoreClient vsClient;
    private static VideoStoreMovie vsMovie;
//    private double totalIncomeVS = 0;

    public boolean addNewClient(String clientId){
        vsClient = new VideoStoreClient(clientId);
        return client.addClient(vsClient);
    }

    public boolean addNewMovie(String editor, String title, String genre,
                               double imdbRating, String releaseDate,
                               int totalQuantity, double rentPrice){
        vsMovie = new VideoStoreMovie(editor, title, genre,
                imdbRating, releaseDate, totalQuantity, rentPrice);
        return movie.addMovie(vsMovie);
    }

    public boolean removeExistClient(String id){
        return client.removeClient(id);
    }

    public boolean removeExistMovie(String title){
        return movie.removeMovie(title);
    }

    public boolean clientRentMovie(String clientName, String editor, String title, String genre,
                             double imdbRating, String releaseDate){
        if (dbHaveClient(clientName) && dbHaveMovie(title) && movie.findByTitle(title).getAvailableQuantity() > 0) {
                vsClient.rentAMovie(editor, title, genre,
                        imdbRating, releaseDate);
                movie.findByTitle(title).decrAvailableQuantity();
                movie.findByTitle(title).incrIncomeByMovie();
                return true;
        }
        return false;
    }


    public boolean clientReturnMovie(String clientName, String title) {
        if (dbHaveClient(clientName) && dbHaveMovie(title))
            if (vsClient.hasMovie(title) && canReturnMovie(title)) {
                movie.findByTitle(title).incrAvailableQuantity();
                vsClient.returnMovie(title);
//                totalIncomeVS += vsMovie.getRentPrice();
                if (vsClient.exceededDueDate()) {
                    movie.findByTitle(title).incrAvailableQuantity();
//                    totalIncomeVS += vsMovie.getRentPrice();
                    vsMovie.incrIncomeByMovie();
                    return true;
                }
                return true;
            }
            return false;
    }

    public void printClientDB(){
        System.out.println("List of clients: ");
        for (int i = 0; i < client.getDb().size(); i++){
            System.out.printf("%s %n", client.getDb().get(i).getClientId());
            if (client.getDb().size() == 0){
                System.out.println("No result found");
            }
        }
    }

    public void printMovieDB(){
        System.out.println("List of movies: ");
        for (int i = 0; i < movie.getDb().size();i++){
            System.out.printf("%s %n", movie.getDb().get(i).getTitle());
            if (movie.getDb().size() == 0){
                System.out.println("No result found.%n");
            }
        }
    }

//    public void printTotalIncome(){
//        System.out.printf("Total income is %.2flv.%n", totalIncomeVS);
//    }

    public void printIncomeByMovie(String title){
        if (movie.findByTitle(title).getIncomeByMovie() > 0)
            System.out.printf("Income from %s is %.2flv. %n", movie.findByTitle(title).getTitle(), movie.findByTitle(title).getIncomeByMovie());
        else  System.out.println("No result found.%n");
    }

    public void printIncomeByGenre(String genre){
        double income = 0;
        for (int i = 0; i < movie.getDb().size();i++){
            if (movie.findByGenreIdx(genre) > - 1)
            income += movie.getDb().get(i).getIncomeByMovie();
        }
        if (income > 0)
            System.out.printf("Income from genre %s is %.2flv. %n",movie.findByGenreForPrint(genre).getGenre(), income);
        else System.out.println("No result found.%n");
    }

    private boolean canReturnMovie(String title){
        return (vsClient.hasMovie(title) && vsMovie.getAvailableQuantity() < 10 );
    }

    private boolean dbHaveClient(String clientName){
        return (client.findByNameIdx(clientName) > -1);
    }

    public boolean dbHaveMovie(String title) {
        return (movie.findByTitleIdx(title) > -1);
    }

    public static VideoStoreMovie getVsMovie() {
        return vsMovie;
    }
}