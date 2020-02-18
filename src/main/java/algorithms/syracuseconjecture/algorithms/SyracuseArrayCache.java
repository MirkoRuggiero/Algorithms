package algorithms.syracuseconjecture.algorithms;

//2_147_483_647
//63_728_127
public class SyracuseArrayCache {

    private static long limit = 63_728_127;
    private static int[] cache = new int[(int) (limit + 1)];

    public static void main(String args[]) {

        long start = System.currentTimeMillis();

        int numOfStep = 0;
        long maxNumOfStep = 0;
        int maxNumber = 0;

        for (int i = 0; i <= limit; i++) {

            int counter = 0;
            long number = i;
            counter = syracuseConjecture(counter, number);
            numOfStep = counter + 1;
            cache[i] = numOfStep;
            if (numOfStep > maxNumOfStep) {
                maxNumOfStep = numOfStep;
                maxNumber = i;
            }
        }
        long stop = System.currentTimeMillis();

        System.out.println("Cache with array");
        System.out.println("Max number is " + maxNumber + " with " + (maxNumOfStep - 1) + " steps");
        System.out.println("Duration: " + (stop - start) / 1000 + "s");
        System.out.println("\n");
    }

    private static int syracuseConjecture(int counter, long number) {
        while (number > 1) {
            if (number % 2 == 0)
                number = number / 2;
            else
                number = number * 3 + 1;

            if (number <= limit && cache[(int) number] > 0) {
                counter += cache[(int) number];
                break;
            }
            counter++;
        }
        return counter;
    }
}
