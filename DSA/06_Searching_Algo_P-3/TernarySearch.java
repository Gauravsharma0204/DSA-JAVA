import java.util.*;

public class TernarySearch{
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
        int printTernary = ternarySearch(arr, 20); // search for 20
        if(printTernary == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index " + printTernary);
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int ternarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid1 = start + (end - start)/3;
            int mid2 = end - (end - start)/3;

            if(target == arr[mid1]) return mid1;
            if(target == arr[mid2]) return mid2;

            if(target < arr[mid1])
                end = mid1 - 1;
            else if(target > arr[mid2])
                start = mid2 + 1;
            else{
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return -1; // not found
    }
}
