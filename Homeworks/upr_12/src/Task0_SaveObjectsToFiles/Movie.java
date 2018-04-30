package Task0_SaveObjectsToFiles;

import java.io.Serializable;
import java.time.LocalDate;

public class Movie implements Serializable{
    private String title;
    private String director;
    private String[] actors;
    private LocalDate releaseDate;

    Movie(String title, String director, String[] actors, LocalDate releaseDate) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String[] getActors() {
        return actors;
    }

    public String printActors(String[] actors){
        StringBuilder actorsStr = new StringBuilder();
        for (int i = 0; i < actors.length; i++){
            if (i < actors.length - 1)
            actorsStr.append(actors[i]).append(", ");
            else actorsStr.append(actors[i]);
        }
        return actorsStr.toString();
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
