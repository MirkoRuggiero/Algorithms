package algorithms.interview;

import algorithms.exercises.exercise03.Palindrome;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {//TODO

    public static void main(String[] args) {

        String input = "itopinonavevanonipoti osso eleimettalattemieleeleimettalattemieleeleimettalattemieleeleimettalattemiele";
        StringBuffer sb = new StringBuffer();
        int maxSize = 0;
        Map<String, Integer> mappa = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ')
                continue;
            sb.append(input.charAt(i));
            if (Palindrome.isPalindrome.apply(sb.toString())) {
                System.out.println(sb.toString());
                if (sb.length() > maxSize) {
                    maxSize = sb.length();
                    mappa.put(sb.toString(), maxSize);
                    sb.delete(0, sb.length());
                }
                /*mappa.put(sb.toString(), maxSize);*/
            }
        }
        String winner = null;
        for (Map.Entry<String, Integer> entry : mappa.entrySet()) {
            if (entry.getValue().equals(maxSize)) {
                winner = entry.getKey();
            }
        }
        System.out.println(winner);
        System.out.println(maxSize);
    }
}
