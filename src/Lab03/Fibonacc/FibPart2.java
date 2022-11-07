package Lab03.Fibonacc;

import java.util.Arrays;

public class FibPart2 {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else if (n > 2) {
            return fib(n-1) + fib(n-2);
        }
        return n;
    }

    public static void main(String[] args) {
        // write your code here
        int[] fibonacciArray = new int[10];

        int i = 0;
        while (i < fibonacciArray.length) {
            fibonacciArray[i] = fib(i + 1);
            i++;
        } // End of while loop

        System.out.println(Arrays.toString(fibonacciArray));

    }
}
