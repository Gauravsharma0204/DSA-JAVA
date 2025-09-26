
import java.util.*;
import javax.print.attribute.standard.PrinterMakeAndModel;
public class ValidMountainArray{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
                  System.out.print("Elements " + i + " : => ");
                  arr[i] = sc.nextInt();
            }

            int ans = peakIndexInMountainArray(arr);
            System.out.println(ans);          
      }

/********************************************************************* */

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }

      }
      
      public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid != 0 && mid != n-1 && arr[mid] > arr[mid - 1] && arr[mid]> arr[mid+1]){
                return mid;
            } else if(mid != n - 1 && arr[mid] < arr[mid+1]){
                start =mid+1;
            } else {
                end = mid-1;
            }

        }
        return -1;
      }
}