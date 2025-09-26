import java.util.*;

public class BinarySearch01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + i + " : => ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        // Test descending
        int result = binarySearchDecs(arr, target);
        if (result == -1) {
            System.out.println("The Element is Not Found (Descending)");
        } else {
            System.out.println("The Element is Found at Index (Descending): " + result);
        }

        // Test order-agnostic
        int res = binarySearchOrderAgnostic(arr, target);
        if (res == -1) {
            System.out.println("The Element is Not Found (Order-Agnostic)");
        } else {
            System.out.println("The Element is Found at Index (Order-Agnostic): " + res);
        }
    }

    // Ascending binary search
    public static int binarySearchIncres(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Descending binary search
    public static int binarySearchDecs(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Order-agnostic binary search
    public static int binarySearchOrderAgnostic(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] <= arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
