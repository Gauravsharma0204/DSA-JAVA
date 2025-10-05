/*
    🔹 Recursion:
    - A method that calls itself.
    - Useful for problems like factorial, Fibonacci, sorting, tree traversal, etc.
*/

class RecursionExample {

    // Recursive method to calculate factorial
    int factorial(int n) {
        // Base condition (stopping point)
        if (n == 0 || n == 1) {
            return 1;  // Factorial of 0 or 1 is 1
        } else {
            // Recursive call (method calls itself with smaller problem)
            return n * factorial(n - 1);
        }
    }
}

public class Factorial {
    public static void main(String[] args) {
        RecursionExample obj = new RecursionExample();

        // Find factorial of 5
        int result = obj.factorial(5);

        System.out.println("Factorial of 5 = " + result);
    }
}

/*
    🔹 Execution Flow for factorial(5):
       factorial(5) = 5 * factorial(4)
       factorial(4) = 4 * factorial(3)
       factorial(3) = 3 * factorial(2)
       factorial(2) = 2 * factorial(1)
       factorial(1) = 1  (base case reached)

    So:
       5 * 4 * 3 * 2 * 1 = 120
*/


/*
    Important Notes
    ✅ Recursion is simpler & cleaner for problems like factorial, Fibonacci, tree/graph traversal.
    ⚠️ But recursion can cause stack overflow if base condition is missing.
    🚀 Iterative methods (loops) are sometimes faster than recursion because recursion has overhead of function calls.
*/
