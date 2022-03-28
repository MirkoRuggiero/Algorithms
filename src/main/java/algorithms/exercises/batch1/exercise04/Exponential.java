package algorithms.exercises.batch1.exercise04;

public class Exponential {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                double it = iterativePower(i, j);
                double rec = recursivePower(i, j);
                System.out.println("Iterative: " + i + " " + j + "=" + it);
                System.out.println("Recursive: " + i + " " + j + "=" + rec);
                System.out.println("\n");
            }
        }
    }

    private static double iterativePower(int base, int exp) {

        if (exp == 0) return 1;
        if (base == 1) return 1;

        double result = 1.0;
        if (exp < 0) {
            //negative
            if (base == 0) {
                throw new RuntimeException("NOPE");
            }
            for (int i = 0; i < -exp; i++) {
                result *= base;
            }
            return 1.0d / result;
        } else {
            //positive
            for (int i = 0; i < exp; i++) {
                result *= base;
            }
            return result;
        }
    }


    private static double recursivePower(int base, int exp) {

        if (exp == 0) return 1;
        if (base == 1) return 1;

        if (exp < 0) {
            //negative
            if (base == 0) {
                throw new RuntimeException("NOPE");
            }
            return 1.0d / recursivePower(base, -exp);

        } else {
            //positive
            double powerOfHalf = recursivePower(base, exp / 2);
            if (exp % 2 == 0) {
                //even
                return powerOfHalf * powerOfHalf;
            } else {
                //odd
                return base * powerOfHalf * powerOfHalf;
            }
        }
    }
}
