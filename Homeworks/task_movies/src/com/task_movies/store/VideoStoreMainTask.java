package com.task_movies.store;

import com.task_movies.database.MovieDB;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VideoStoreMainTask {
    private static VideoStore store = new VideoStore();

    public static void main(String[] args) {

        store.addNewClient("Iva");
        store.addNewClient("Maria");
        store.addNewMovie("Spilsbyrg", "Titanik", "boza", 8, "13/02/1998", 10, 6);
        store.addNewMovie("Spilsbyrg", "Notebook", "boza", 8, "18/05/2002", 10, 5);

        Scanner sc = new Scanner(System.in);

        System.out.printf("Please enter 'VS' for add/rent functions," +
                "'SEARCH' for searching functions, %n" +
                "'EXIT' for exit from program %n");

        outerLoop:
        while (true) {
            String generalTask = sc.nextLine();
            switch (generalTask) {
                case "EXIT":
                    System.out.println("Bye!");
                    break outerLoop;
                case "VS":
                    System.out.printf("'ADDC' following a person name - adding new client %n" +
                            "'ADDM' following a movie editor, title, genre, " +
                            "imdbRating, release date*, total quantity and rent price) - adding new movie %n" +
                            "'REMOVEC' following a person name - remove exist client %n" +
                            "'REMOVEM' following a movie name - remove exist movie %n" +
                            "'RENT' following a client name and a movie name - client rent movie %n" +
                            "'END' - exit from VS%n" +
                            "'EXIT' - exit from program %n" +
                            "*NB! release date should be in format dd/MM/yyyy %n" +
                            "Please enter your command/s:");
                    firstLoop:
                    while (true) {
                        String task = sc.next();

                        switch (task) {
                            case "EXIT":
                                System.out.println("Bye!");
                                break outerLoop;
                            case "END":
                                store.printClientDB();
                                store.printMovieDB();
//                                store.printTotalIncome();
                                break firstLoop;
                            case "ADDC":
                                System.out.printf("ADD is %s %n", store.addNewClient(sc.next()) ? "success" : "fail");
                                break;
                            case "ADDM":
                                System.out.printf("ADD is %s %n", store.addNewMovie(sc.next(), sc.next(), sc.next(), sc.nextDouble(),
                                        sc.next(), sc.nextInt(), sc.nextDouble()) ? "success" : "fail");
                                break;
                            case "REMOVEC":
                                System.out.printf("REMOVE is %s %n", store.removeExistClient(sc.next()) ? "success" : "fail");
                                break;
                            case "REMOVEM":
                                System.out.printf("REMOVE is %s %n", store.removeExistMovie(sc.next()) ? "success" : "fail");
                                break;
                            case "RENT":
                                System.out.printf("RENT is %s %n", store.clientRentMovie(sc.next(), VideoStore.getVsMovie().getEditor(),
                                        sc.next(), VideoStore.getVsMovie().getGenre(),
                                        VideoStore.getVsMovie().getImdbRating(),
                                        DateTimeFormatter.ofPattern("dd/MM/yyyy").format(VideoStore.getVsMovie().getReleaseDate())) ? "success" : "fail");
                                break;
                            case "RETURN":
                                System.out.printf("RETURN is %s %n", store.clientReturnMovie(sc.next(), sc.next()) ? "success" : "fail");
                        }
                    }
                    break;
                case "SEARCH":
                    System.out.printf("QUERY FIND TITLE following the movie title %n" +
                            "QUERY FILTER GENRE following the genre %n" +
                            "QUERY FILTER EDITOR following the editor %n" +
                            "QUERY FILTER ABOVERATING following the rating%n" +
                            "QUERY FILTER AFTERDATE following the date*%n" +
                            "QUERY TOTALINCOME MOVIE following the movie title %n" +
                            "QUERY TOTALINCOME GENRE following the genre%n" +
                            "'END' - exit%n" +
                            "'EXIT' - exit from program %n" +
                            "*NB! the date should be in format dd/MM/yyyy %n" +
                            "Please enter your command/s: %n");
                    secondLoop:
                    while (true) {
                        String task = sc.nextLine();
                        String[] tasks = task.split(" ");
                        if (tasks[0].equals("EXIT")) {
                            System.out.println("Bye!");
                            break outerLoop;
                        }
                        if (!tasks[0].equals("END") && tasks.length != 4) {
                            System.out.println("Your command is invalid!");
                            break;
                        }

                        switch (tasks[0]) {
                            case "END":
                                break secondLoop;
                            case "QUERY":
                                if (tasks[1].equalsIgnoreCase("FIND") && tasks[2].equalsIgnoreCase("TITLE" )){
                                    System.out.printf("%s%n", store.dbHaveMovie(tasks[3]) ? VideoStore.getVsMovie().getAvailableQuantity() : "Not result found");
                                }
                                if (tasks[1].equalsIgnoreCase("FILTER") && tasks[2].equalsIgnoreCase("GENRE" )){
                                    MovieDB.findByGenre(tasks[3]);
                                }
                                if (tasks[1].equalsIgnoreCase("FILTER") && tasks[2].equalsIgnoreCase("EDITOR" )){
                                    MovieDB.findByEditor(tasks[3]);
                                }
                                if (tasks[1].equalsIgnoreCase("FILTER") && tasks[2].equalsIgnoreCase("ABOVERATING" )){
                                    MovieDB.findAboveRating(Integer.parseInt(tasks[3]));
                                }
                                if (tasks[1].equalsIgnoreCase("FILTER") && tasks[2].equalsIgnoreCase("AFTERDATE" )){
                                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                    MovieDB.findAfterDate(LocalDate.parse((tasks[3]), dateFormat));
                                }
                                if (tasks[1].equalsIgnoreCase("TOTALINCOME") && tasks[2].equalsIgnoreCase("MOVIE" )){
                                    store.printIncomeByMovie(tasks[3]);
                                }
                                if (tasks[1].equalsIgnoreCase("TOTALINCOME") && tasks[2].equalsIgnoreCase("GENRE" )){
                                    store.printIncomeByGenre(tasks[3]);
                                }
                        }
                    }
            }
        }
    }
}
