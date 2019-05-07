package algorithms.exercises.amz.exercise01;

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
    /**
     * Functional approach to test if a year is a Leap Year
     */
    private static final Function<Integer, Boolean> isLeap = y -> (y % 400 == 0) || (y % 100 != 0 && y % 4 == 0);

    /**
     * Iterative approach
     *
     * @param year
     * @return
     */
    private static boolean isLeap(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        if (year % 400 != 0) return false;
        return true;
    }

    public static void main(String[] args) {

        int year = 1581;

        while (year < 100000) {
            GregorianCalendar gc = new GregorianCalendar();
            if (gc.isLeapYear(year) != isLeap(year) || gc.isLeapYear(year) != isLeap.apply(year))
                throw new RuntimeException();
            year++;
        }
    }
}

