package algorithms.exercises.amz.exercise04;

public class Exponential {

    public static void main(String[] args) {

        int base = 2;
        int exp = 3;


        System.out.println(iterativePower(base, exp));

        System.out.println(recursivePower(base, exp));


    }
//TODO
    private static double iterativePower(int base, int exp) {
        System.out.println("base: " + base + " exp: " + exp);
        if (exp == 0) return 1;

        if (exp < 0) {
            //negative
            if (base == 0) {
                throw new RuntimeException("NOPE");
            }
            return 1 / iterativePower(base, -exp);

        } else {
            //positive
            double powerOfHalf = iterativePower(base, exp / 2);
            if (exp % 2 == 0) {
                //even
                return powerOfHalf * powerOfHalf;
            } else {
                //odd
                return base * powerOfHalf * powerOfHalf;
            }
        }
    }


    private static double recursivePower(int base, int exp) {

        if (exp == 0) return 1;

        if (exp < 0) {
            //negative
            if (base == 0) {
                throw new RuntimeException("NOPE");
            }
            return 1 / recursivePower(base, -exp);

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
