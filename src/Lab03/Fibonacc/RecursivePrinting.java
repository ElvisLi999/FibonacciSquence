package Lab03.Fibonacc;

public class RecursivePrinting {
    public static void printUp(int n) {
        if (n == 1) {
            System.out.println("*");
        } else if (n > 1) {
            printUp(n-1);
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    } // End of printUp method

    public static void printDown(int n) {
        if (n == 1) {
            System.out.println("*");
        } else if (n > 1) {
            for (int i = n; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println("");
            printDown(n-1);
        }
    } // End of printUp method

    public static void main (String[] args) {
        printUp(5);
        printDown(5);


    }
}
