package algorithms.exercises.batch1.exercise03;

public class Palindrome {

    private static boolean isPalindrome(String s) {

        char[] array = new char[s.length()];

        s.getChars(0, s.length(), array, 0);

        for (int i = 0, j = array.length - 1; i < array.length; i++) {

            if (array[i] != array[j]) {
                return false;
            }
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        String string = "eleimettalattemieleeleimettalattemieleeleimettalattemieleeleimettalattemiele";

        if (isPalindrome(string)) {
            System.out.println("OK");
        }
    }
}
