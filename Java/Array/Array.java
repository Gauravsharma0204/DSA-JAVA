// Java Program: Complete Array Examples with Comments

import java.util.Arrays; // Import Arrays class for sorting and copying

public class Array {

    public static void main(String[] args) {

        // ==========================
        // 1️⃣ One-Dimensional Integer Array (1D)
        // ==========================
        int[] marks1 = new int[5];                 // Method 1: declare size (default 0)
        int[] marks2 = {90, 85, 70, 95};          // Method 2: initialize directly
        int marks3[] = new int[]{50, 60, 70};     // Method 3: using 'new' keyword

        System.out.println("1D Integer Array:");
        for (int i = 0; i < marks2.length; i++) {
            System.out.println("marks2[" + i + "] = " + marks2[i]);
        }

        // Modify element
        marks2[2] = 75; // change 3rd element
        System.out.println("Modified third element: " + marks2[2]);

        // Sum, Max, Min
        int sum = 0, max = marks2[0], min = marks2[0];
        for (int m : marks2) {
            sum += m;
            if (m > max) max = m;
            if (m < min) min = m;
        }
        System.out.println("Sum: " + sum + ", Max: " + max + ", Min: " + min);

        // Sorting
        Arrays.sort(marks2);
        System.out.println("Sorted Array: " + Arrays.toString(marks2));

        // ==========================
        // 2️⃣ String Array
        // ==========================
        String[] names1 = new String[3];                   // Method 1
        String[] names2 = {"Gaurav", "Rohit", "Anita"};   // Method 2
        String names3[] = new String[]{"Sneha", "Anjali"}; // Method 3

        System.out.println("\nString Array:");
        for (String name : names2) {
            System.out.println(name);
        }

        // ==========================
        // 3️⃣ Character Array
        // ==========================
        char[] vowels1 = new char[5];                     // Method 1
        char[] vowels2 = {'a', 'e', 'i', 'o', 'u'};      // Method 2
        char vowels3[] = new char[]{'x','y','z'};        // Method 3

        System.out.print("\nCharacter Array: ");
        for (char c : vowels2) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ==========================
        // 4️⃣ Boolean Array
        // ==========================
        boolean[] answers1 = new boolean[3];             // Method 1
        boolean[] answers2 = {true, false, true};       // Method 2
        boolean answers3[] = new boolean[]{false,true};  // Method 3

        System.out.println("\nBoolean Array:");
        for (boolean b : answers2) {
            System.out.println(b);
        }

        // ==========================
        // 5️⃣ Two-Dimensional Array (2D)
        // ==========================
        int[][] matrix1 = new int[2][3];                 // Method 1: size declared
        int[][] matrix2 = {                               // Method 2: initialized directly
            {1, 2, 3},
            {4, 5, 6}
        };
        int matrix3[][] = new int[][]{                    // Method 3: using 'new'
            {7, 8, 9},
            {10, 11, 12}
        };

        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // Access element
        System.out.println("Element at matrix2[1][2]: " + matrix2[1][2]); // 6

        // ==========================
        // 6️⃣ Three-Dimensional Array (3D)
        // ==========================
        int[][][] threeD = new int[2][2][2]; // 3D array of zeros
        threeD[0][0][0] = 1;                 // Assign value
        threeD[0][1][1] = 2;

        System.out.println("\n3D Array Elements:");
        for (int i = 0; i < threeD.length; i++) {
            for (int j = 0; j < threeD[i].length; j++) {
                for (int k = 0; k < threeD[i][j].length; k++) {
                    System.out.println("threeD[" + i + "][" + j + "][" + k + "] = " + threeD[i][j][k]);
                }
            }
        }

        // ==========================
        // 7️⃣ Summary of Array Methods
        // ==========================
        System.out.println("\n✅ Arrays covered: 1D, 2D, 3D, String, Char, Boolean");
        System.out.println("Declaration methods:");
        System.out.println("1. type[] arr = new type[size];");
        System.out.println("2. type[] arr = {values};");
        System.out.println("3. type arr[] = new type[]{values};");
    }
}
