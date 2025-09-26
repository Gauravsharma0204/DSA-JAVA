
import java.util.*;
public class RotatedFindElem{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
                  System.out.print("Elements " + i + " : => ");
                  arr[i] = sc.nextInt();
            }

            int ans = search(arr, 25);
            System.out.println(ans);
      }

/********************************************************************* */

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }

      }
/******************************************************************************* */
      public static int search(int arr[],int target){
            int start = 0;
            int end = arr.length-1;
            int ans = -1;

            while(start <= end){
                  int mid = start + (end - start) / 2;
                  if(target == arr[mid]){
                        return mid;
                  }
                  // Left Side is Sorted
                  if(arr[start] <= arr[mid]){
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