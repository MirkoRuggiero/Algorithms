package algorithms.exercises.amz.exercise03;

import java.util.function.Function;

public class Palindrome {

    public static Function<String, Boolean> isPalindrome = s -> {

        char[] array = new char[s.length()];

        s.getChars(0, s.length(), array, 0);

        for (int i = 0, j = array.length - 1; i < array.length; i++) {

            if (array[i] != array[j]) {
                return false;
            }
            j--;
        }

        return true;
    };

    public static void main(String[] args) {

        String string = "eleimettalattemieleeleimettalattemieleeleimettalattemieleeleimettalattemiele";

        if (isPalindrome.apply(string)) {
            System.out.println("OK");
        }
    }
}
