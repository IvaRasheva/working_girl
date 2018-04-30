package task.sortDates;

import java.time.LocalDate;
import java.util.Comparator;

public class DateByMonthOrderer implements Comparator<LocalDate> {

    @Override
    public int compare(LocalDate o1, LocalDate o2) {
        int result = 0;

        if (o1.getMonthValue() > o2.getMonthValue()){
            return result = 1;
        }
        if (o1.getMonthValue() < o2.getMonthValue()){
            return result = -1;
        }
        if (o1.getMonthValue() == o2.getMonthValue()) {
            if (o1.getDayOfMonth() > o2.getDayOfMonth())
                return result = - 1;
            else if (o1.getDayOfMonth() < o2.getDayOfMonth())
                return result = 1;
            else if (o1.getDayOfMonth() == o2.getDayOfMonth())
                return result = 0;
        }
        return result;
    }
}
