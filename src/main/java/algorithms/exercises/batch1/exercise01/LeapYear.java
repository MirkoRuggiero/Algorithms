package algorithms.exercises.batch1.exercise01;

import java.util.GregorianCalendar;
import java.util.function.Function;

/**
 * Da wikipedia:
 * <p>
 * Nel calendario gregoriano, sono bisestili:
 * <p>
 * gli anni non secolari il cui numero è divisibile per 4;
 * gli anni secolari il cui numero è divisibile per 400.
 */
public class LeapYear {

    private static boolean isLeap(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        return year % 400 == 0;
    }

    public static void main(String[] args) {

        int year = 0;

        while (year < 100000) {
            GregorianCalendar gc = new GregorianCalendar();
            if (gc.isLeapYear(year) && isLeap(year) )
                throw new RuntimeException("Error with year " + year);
            year++;
        }
    }
}

