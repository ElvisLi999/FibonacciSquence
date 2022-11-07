package Lab03.Fibonacc;

public class FibPart1 {

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
        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(5));
        System.out.println(fib(10));
    }
}
