package Recursion;

public class RecursionBasics {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printinc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
        }
        printinc(n - 1);
        System.out.println(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;

    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = sum(n - 1);
        int fn = n + fnm1;
        return fn;

    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fn1 = fib(n - 1);
        int fn2 = fib(n - 2);
        int fib = fn1 + fn2;
        return fib;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        // int n = 5;
        int arr[] = { 1, 2, 3, 4 };
        // printDec(n);
        // printinc(n);
        /*
         * System.out.println(fact(n)); // O(n)
         * System.out.println(sum(n));
         * System.out.println(fib(n));
         */
        System.out.println(isSorted(arr, 0));

    }
}
