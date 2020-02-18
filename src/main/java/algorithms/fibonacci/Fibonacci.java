package algorithms.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        fibonacciIterative(10);
        for (int i = 1; i <= 10; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }

    private static int fibonacciRecursive(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

    }

    private static void fibonacciIterative(int n) {

        if (n == 0) {
            return;
        }
        if (n == 1) {
            System.out.println(1);
        }

        long[] res = new long[n];
        res[0] = 1;
        res[1] = 1;

        for (int i = 2; i < res.length; i++) {
            res[i] = res[i - 1] + res[i - 2];
        }

        printArray(res);
    }


    private static void printArray(long[] res) {
        for (Long num : res) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
