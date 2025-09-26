import java.util.*;

public class FloorCeil {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int num = sc.nextInt();

        int arr[] = new int[num];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + i + " : => ");
            arr[i] = sc.nextInt();
        }

        // Sort array for binary search
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int target = 15;

        int ansFloor = floor(arr, target); // Largest number <= target
        System.out.println("Floor of " + target + " is : " + ansFloor);

        int ansCeil = ceil(arr, target);  // Smallest number >= target
        System.out.println("Ceil of " + target + " is : " + ansCeil);
    }

    /******************************************************************************* */
    public static int floor(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1; // Default: not found
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid]; // Exact match
            } else if (arr[mid] < target) {
                ans = arr[mid];  // possible floor
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    /******************************************************************************* */
    public static int ceil(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        int ans = -1; // Default: not found
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid]; // Exact match
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = arr[mid];  // possible ceil
            }
        }
        return ans;
    }
}
