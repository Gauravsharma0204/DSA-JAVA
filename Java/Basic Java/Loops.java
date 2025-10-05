public class Loops {
    public static void main(String[] args) {

        // 1. FOR LOOP
        // Used when we know how many times we want to repeat
        System.out.println("=== FOR LOOP ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("FOR LOOP: i = " + i);
        }
        System.out.println();

        // 2. WHILE LOOP
        // Used when number of repetitions is not fixed in advance
        System.out.println("=== WHILE LOOP ===");
        int j = 1;
        while (j <= 5) {
            System.out.println("WHILE LOOP: j = " + j);
            j++;
        }
        System.out.println();

        // 3. DO-WHILE LOOP
        // Similar to while, but executes at least once even if condition is false
        System.out.println("=== DO-WHILE LOOP ===");
        int k = 1;
        do {
            System.out.println("DO-WHILE LOOP: k = " + k);
            k++;
        } while (k <= 5);
        System.out.println();

        // 4. ENHANCED FOR LOOP (FOR-EACH LOOP)
        // Specially used for arrays and collections
        System.out.println("=== ENHANCED FOR LOOP ===");
        String[] fruits = {"Apple", "Banana", "Mango"};
        for (String fruit : fruits) {
            System.out.println("FOR-EACH LOOP: " + fruit);
        }
        System.out.println();

        // 5. BREAK Statement
        // Used to exit/terminate loop immediately
        System.out.println("=== BREAK Example ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("BREAK at i = " + i);
                break; // loop ends here
            }
            System.out.println("Loop running i = " + i);
        }
        System.out.println();

        // 6. CONTINUE Statement
        // Used to skip current iteration and go to next
        System.out.println("=== CONTINUE Example ===");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("CONTINUE at i = " + i);
                continue; // skips this iteration
            }
            System.out.println("Loop running i = " + i);
        }
    }
}
