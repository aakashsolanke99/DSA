package org.aakash.Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));

    }

    private static int fibonacci(int n) {
        if(n<=1){
            return n;
        }

        int last = fibonacci(n-1);
        int secondlast= fibonacci(n-2);

        return last+secondlast;
    }

}
