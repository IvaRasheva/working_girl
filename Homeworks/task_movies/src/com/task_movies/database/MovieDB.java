package com.task_movies.database;

import com.task_movies.model.VideoStoreMovie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MovieDB {
    private static List<VideoStoreMovie> db = new ArrayList<VideoStoreMovie>();

    public List<VideoStoreMovie> getDb() {
        return db;
    }

    public boolean addMovie(VideoStoreMovie movie){
        int idx = findByTitleIdx(movie.getTitle());
        if (idx == -1){
            db.add(movie);
            return true;
        } else
            return false;
    }

    public boolean removeMovie(String title){
        int idx = findByTitleIdx(title);
        if (idx > -1) {
            db.remove(idx);
            return true;
        } else
            return false;
    }

    public VideoStoreMovie findByTitle(String title){
        int idx = findByTitleIdx(title);
        if (idx > -1) {
            return db.get(idx);
        } else
            return null;
    }

    public VideoStoreMovie findByGenreForPrint(String genre){
        int idx = findByGenreIdx(genre);
        if (idx > -1) {
            return db.get(idx);
        } else
            return null;
    }

    public static VideoStoreMovie[] findByEditor(String editor) {
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for (VideoStoreMovie vsm : db) {
            if (vsm.getEditor().equals(editor)) {
                result.add(vsm);
            }
        }
            if (result.size() != 0) {
                for (int i = 0; i < db.size(); i++) {
                    System.out.printf("%s %n", result.get(i).getTitle());
                }
                return result.toArray(new VideoStoreMovie[0]);
            }
            System.out.printf("No results found%n");
            return null;
    }

    public static VideoStoreMovie[] findByGenre(String genre) {
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for (VideoStoreMovie vsm : db) {
            if (vsm.getGenre().equals(genre)) {
                result.add(vsm);
            }
        }
        if (result.size() != 0) {
            for (int i = 0; i < db.size(); i++) {
                System.out.printf("%s %n", result.get(i).getTitle());
            }
            return result.toArray(new VideoStoreMovie[0]);
        }
        System.out.printf("No results found. %n");
        return null;
    }

    public static VideoStoreMovie[] findAboveRating(int rating){
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for (VideoStoreMovie vsm : db){
            if (vsm.getImdbRating() >= (rating)){
                result.add(vsm);
            }
        }
        if (result.size() != 0) {
            for (int i = 0; i < db.size(); i++) {
                System.out.printf("%s %n", result.get(i).getTitle());
            }
            return result.toArray(new VideoStoreMovie[0]);
        }
        System.out.printf("No results found.%n");
        return null;
    }

    public static VideoStoreMovie[] findAfterDate(LocalDate date){
        List<VideoStoreMovie> result = new ArrayList<VideoStoreMovie>();
        for (VideoStoreMovie vsm : db) {
            if (vsm.getReleaseDate().isAfter(date)) ;
            {
                result.add(vsm);
            }
        }
        if (result.size() != 0) {
            for (int i = 0; i < db.size(); i++) {
                System.out.printf("%s %n", result.get(i).getTitle());
            }
            return result.toArray(new VideoStoreMovie[0]);
        }
        System.out.printf("No results found. %n");
        return null;
    }

    public int findByTitleIdx(String title) {
        for (int i = 0; i < db.size(); i++){
            if (db.get(i).getTitle().equals(title))
                return i;
        }
        return -1;
    }

    public int findByGenreIdx(String genre) {
        for (int i = 0; i < db.size(); i++){
            if (db.get(i).getGenre().equals(genre))
                return i;
        }
        return -1;
    }
}
