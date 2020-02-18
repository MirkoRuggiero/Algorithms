package algorithms.syracuseconjecture.algorithms;

import java.util.HashMap;
import java.util.Map;

//2_147_483_647
//63_728_127
public class SyracuseDictionaryCache {

    private static long limit = 63_728_127;
    private static Map<Long, Long> map = new HashMap<>();

    public static void main(String args[]) {

        long start = System.currentTimeMillis();

        long numOfStep = 0;
        long maxNumOfStep = 0;
        int maxNumber = 0;

        for (int i = 0; i <= limit; i++) {

            long counter = 0;
            long number = i;
            counter = syracuseConjecture(counter, number);
            numOfStep = counter + 1L;
            map.put((long) i, numOfStep);

            if (numOfStep > maxNumOfStep) {
                maxNumOfStep = numOfStep;
                maxNumber = i;
            }

        }
        long stop = System.currentTimeMillis();

        System.out.println("Cache with hash map");
        System.out.println("Max number is " + maxNumber + " with " + (maxNumOfStep - 1) + " steps");
        System.out.println("Duration: " + (stop - start) / 1000 + "s");
        System.out.println("\n");
    }

    private static long syracuseConjecture(long counter, long number) {
        while (number > 1) {
            if (number % 2 == 0)
                number = number / 2;
            else
                number = number * 3 + 1;

            if (number <= limit && map.containsKey(number)) {
                counter = counter + map.get(number);
                break;
            }
            counter++;
        }
        return counter;
    }
}
