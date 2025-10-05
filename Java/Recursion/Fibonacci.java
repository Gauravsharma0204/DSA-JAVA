class FibonacciExample {

    // Recursive method to calculate nth Fibonacci number
    int fibonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive relation: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        FibonacciExample obj = new FibonacciExample();

        // Print first 7 Fibonacci numbers
        for (int i = 1; i <= 20; i++) {
            System.out.print(obj.fibonacci(i) + " ");
        }
    }
}

/*
    🔹 Fibonacci Series using Recursion:
       F(0) = 0, F(1) = 1
       F(n) = F(n-1) + F(n-2)

    Output for first 7 numbers:
    0 1 1 2 3 5 8
*/
