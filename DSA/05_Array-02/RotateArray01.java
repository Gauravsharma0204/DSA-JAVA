import java.util.Scanner;
import java.util.Arrays;

public class RotateArray01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Element : => ");
            arr[i] = sc.nextInt();
        } 

        System.out.print("Enter the Rotate Size : ");
        int k = sc.nextInt();

        // Make copies so original array is preserved
        int leftArr[] = Arrays.copyOf(arr, arr.length);
        int rightArr[] = Arrays.copyOf(arr, arr.length);

        leftRotate(leftArr, k);
        System.out.print("Left Rotation : ");
        printArr(leftArr);

        System.out.println();

        rightRotate(rightArr, k);
        System.out.print("Right Rotation: ");
        printArr(rightArr);
    }

    // **********************************************************

    static void printArr(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    // Reverse utility
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Left rotation
    static void leftRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    // Right rotation
    static void rightRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }
}
