import java.util.*;

public class InterpolationSearch{
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
        int printInterpolation = interpolationSearch(arr, 20); // search for 20
        if(printInterpolation == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index " + printInterpolation);
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

       static int interpolationSearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while (start <= end && target>=arr[start] && target <=arr[end]){
            if(arr[start] == arr[end]){
                if(arr[start] == target){
                    index = start;
                }
                break;
            }
            int pos = start + (target - arr[start])*(end - start)/(arr[end]-arr[start]);
            if(arr[pos] == target){
                index = pos;
                break;
            } else if(target<arr[pos]){
                end = pos-1;
            } else {
                start = pos+1;
            }
        }
        return index;
    }
     
}
