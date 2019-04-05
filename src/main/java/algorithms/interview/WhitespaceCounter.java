package algorithms.interview;

public class WhitespaceCounter {
    public static void main(String[] args) {


        String input = "\ntable chair pen    bird    chicken ";

        int res = 0;

        for (int i = 0; i<input.length(); i++) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '\n'){
                res++;
            }
        }

        System.out.println(res);
    }
}
