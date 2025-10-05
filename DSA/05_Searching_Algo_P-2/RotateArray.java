/*

public class RotateArray {
    public static void leftRotate(int arr[], int k) {
        int n = arr.length;
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n]; // shift by k
        }

        // Copy back
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2; // rotate by 2
        leftRotate(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
*/
/******************************************************************** */


import java.util.*;

public class RotateArray {
    // Helper method to reverse part of array
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void leftRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n; // handle k > n

        reverse(arr, 0, k - 1);     // Step 1
        reverse(arr, k, n - 1);     // Step 2
        reverse(arr, 0, n - 1);     // Step 3
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
        leftRotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}
