import java.util.Scanner;
import java.util.Arrays;

public class FindElementInRotetion {

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


        System.out.println();
        boolean ans = search(arr, k);
        System.out.println(ans);
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

    public static boolean search(int arr[],int target){
            int start = 0;
            int end = arr.length-1;
            boolean ans = false;

            while(start <= end){
                  int mid = start + (end - start) / 2;
                  if(target == arr[mid]){
                        return true;
                  }
                  if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                    start++;
                    end--;
                  }
                  // Left Side is Sorted
                    else if(arr[start] <= arr[mid]){
                        // Can asn be found in left side ?
                        if(target >= arr[start] && target < arr[mid]){
                              end = mid - 1;
                        } else {
                              start = mid + 1;
                        }
                  } // Rigth Site is sorted
                  else {
                        if(target > arr[mid] && target <= arr[end]){
                              start = mid+1;
                        } else {
                              end = mid-1;
                        }
                  }
            }
            return ans;
      } 
}
