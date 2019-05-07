package algorithms.exercises.tw;

import java.util.Objects;

public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();

        String input = "itopinonavevanonipoti osso eleimettalattemieleeleimettalattemieleeleimettalattemieleeleimettalattemiele";

        String longest = lp.getLongestPalindrome(input);

        System.out.println(longest);
        System.out.println(longest.length());

    }

    private String getLongestPalindrome(String input) {

        if (Objects.isNull(input) || input.isEmpty()) {
            throw new RuntimeException();
        }

        if (input.length() == 1) {
            return input;
        }
        String longest = String.valueOf(input.charAt(0));

        for (int i = 0; i < input.length(); i++) {

            String tmp = findPalindrome(input, i, i);

            if (tmp.length() > longest.length()) {
                longest = tmp;
            }

            tmp = findPalindrome(input, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
        return longest;
    }

    private static String findPalindrome(String input, int start, int end) {

        while (start >= 0 && end <= input.length() - 1 && input.charAt(start) == input.charAt(end)) {
            start--;
            end++;
        }
        return input.substring(start + 1, end);

    }
}
