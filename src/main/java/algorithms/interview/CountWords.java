package algorithms.interview;

import java.util.Objects;

public class CountWords {
    public static void main(String[] args) {

        int res1 = countWords("table chair pen    bird    chicken");
        int res2 = countWords("table chair pen    bird    chicken ");
        int res3 = countWords(" table chair pen    bird    chicken");
        int res4 = countWords(" table chair pen    bird    chicken ");
        int res5 = countWords("table chair pen    bird    chicken ");
        int res6 = countWords("     table chair pen    bird    chicken     ");
        int res7 = countWords("     table chair pen    bird    chicken");
        int res8 = countWords("table chair pen    bird    chicken    ");


        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
        System.out.println(res7);
        System.out.println(res8);

    }

    private static int countWords(String input) {
        if (Objects.isNull(input) || input.isEmpty()) {
            return 0;
        }

        boolean state = false;
        int wc = 0;


        for (int i = 0; i < input.length(); i++) {
            // If next character is a separator, set the
            // state to false
            if (input.charAt(i) == ' ')
                state = false;


                // If next character is not a word separator
                // and state is false, then set the state as IN
                // and increment word count
            else if (state == false) {
                state = true;
                wc++;
                System.out.println(input.charAt(i));
            }
        }
        return wc;
    }
}
