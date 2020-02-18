package algorithms.syracuseconjecture.algorithms;

//2_147_483_647
//63_728_127
public class Syracuse {

    private static long counter;
    private static long limit = 63_728_127;

    public static void main(String args[]) {

        long start = System.currentTimeMillis();

        long maxNumOfStep = 0;
        long maxNumber = 0;
        for (long i = 1; i <= limit; i++) {
            long step = syracuseConjectureRecursive(i);
            if (step > maxNumOfStep) {
                maxNumOfStep = step;
                maxNumber = i;
            }
            counter = 0L;
        }
        long stop = System.currentTimeMillis();

        System.out.println("No cache, recursive method");
        System.out.println("Max number is " + maxNumber + " with " + maxNumOfStep + " steps");
        System.out.println("Duration: " + (stop - start) / 1000 + "s");
        System.out.println("\n");

        start = System.currentTimeMillis();
        maxNumOfStep = 0;
        maxNumber = 0;
        for (long i = 1; i <= limit; i++) {
            long step = syracuseConjectureIterative(i);
            if (step > maxNumOfStep) {
                maxNumOfStep = step;
                maxNumber = i;
            }
            counter = 0L;
        }
        stop = System.currentTimeMillis();

        System.out.println("No cache, iterative method");
        System.out.println("Max number is " + maxNumber + " with " + maxNumOfStep + " steps");
        System.out.println("Duration: " + (stop - start) / 1000 + "s");
        System.out.println("\n");
    }

    private static long syracuseConjectureRecursive(long start) {
        if (start == 1) {
            return counter;
        }
        counter++;
        if (start % 2 == 0) {
            start = start / 2;
            return syracuseConjectureRecursive(start);
        } else {
            start = 3 * start + 1;
            return syracuseConjectureRecursive(start);
        }
    }

    private static long syracuseConjectureIterative(long start) {
        long res = 0;
        if (start == 1) {
            return res;
        }
        while (start > 1) {
            res++;
            if (start % 2 == 0) {
                start = start / 2;
            } else {
                start = start * 3 + 1;
            }
        }
        return res;
    }
}
