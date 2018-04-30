package Task0_SaveObjectsToFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Task0_SaveObjectsToFiles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Movie movie = new Movie("The Butterfly Effect",
                "Eric Bress", new String[]{"Ashton Kutcher", "Amy Smart"},
                LocalDate.of(2004, 1, 23));

        Path inputDir = Paths.get("input");
        Files.createDirectories(inputDir);
        File movieFile = new File(inputDir + File.separator + "movies");
        movieFile.createNewFile();

        FileOutputStream fosM = new FileOutputStream(String.valueOf(movieFile));
        ObjectOutputStream oosM = new ObjectOutputStream(fosM);
        oosM.writeObject(movie);

        FileInputStream fisM = new FileInputStream(movieFile);
        ObjectInputStream oisM = new ObjectInputStream(fisM);
        Movie movieCopy = (Movie) oisM.readObject();
        System.out.printf("The title is: %s \n" +
                "The director is: %s \n" +
                "The actors are: %s \n" +
                "The realise date is: %s \n", movieCopy.getTitle(), movieCopy.getDirector(),
                movieCopy.printActors(movieCopy.getActors()), movieCopy.getReleaseDate());

    }
}