import java.util.*;

public class ExponentialSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter Array " + i + " => ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        printArr(arr);
        int printExponential = exponentialSearch(arr, 20); // search for 20
        if(printExponential == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index " + printExponential);
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

     public static int exponentialSearch(int arr[], int target){
        if(arr[0] == target){
            return 0;
        }
        int i=1;
        int n = arr.length;

//        enclose the target
        while (i<n && arr[i]<=target){
            i = 2*i;
        }
        int end = Math.min(i,n-1);
        int index = binarySearchInRange(arr,target, i/2,end);

        return index;

    }
    static int binarySearchInRange(int arr[], int target, int start, int end){
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if(arr[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }

}
