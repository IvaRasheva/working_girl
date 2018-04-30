package task.sortDates;

import java.time.LocalDate;
import java.util.Arrays;

public class DateByMonthOrderMain {
    public static void main(String[] args) {
        LocalDate[] sortedDates = new LocalDate[]{
                LocalDate.now(),
                LocalDate.of(2000, 12, 22),
                LocalDate.of(2009, 12, 1),
                LocalDate.of(2002, 12, 15),
                LocalDate.of(2007, 7, 2),
                LocalDate.of(2009, 8, 2),
                LocalDate.of(2017, 12, 2),
                LocalDate.of(2018, 9, 7),
                LocalDate.of(2001, 7, 9),
                LocalDate.of(1993, 10, 22)};

        DateByMonthOrderer comparator = new DateByMonthOrderer();
        Arrays.sort(sortedDates, comparator);

            for (LocalDate ld : sortedDates){
                System.out.println(ld);
            }

    }
}
