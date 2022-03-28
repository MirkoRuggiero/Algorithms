package algorithms.exercises.batch1.exercise02;

public class ReverseString {

    private static boolean areInverse(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] charArrays = new char[s1.length()];
        char[] invertedArray = new char[s2.length()];
        s1.getChars(0, s1.length(), charArrays, 0);
        s2.getChars(0, s2.length(), invertedArray, 0);

        for (int i = 0, j = invertedArray.length - 1; i < charArrays.length; i++) {

            if (charArrays[i] != invertedArray[j]) {
                return false;
            }
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String string = "string";
        String reversedString = "gnirts";

        if (areInverse(string, reversedString)) {
            System.out.println("OK");
        }
    }
}
