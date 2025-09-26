
import java.util.*;
public class BinarySearch02{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
                  System.out.print("Elements " + i + " : => ");
                  arr[i] = sc.nextInt();
            }

            binarySearch(arr, 25);

      }

/********************************************************************* */

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }

      }
/******************************************************************************* */
      public static void binarySearch(int arr[],int target){
            if(arr.length == 0){
                  return;
            }
           
            int start = 0;
            int end = arr.length-1;
            int ans = -1;
            while (start <= end) { 
                  int mid = start + (end - start) / 2; // correct mid calculation
                        if(arr[mid] == target){
                              ans = mid;
                              break;
                        } else if(arr[mid] < target){
                              start = mid+1;
                        } else {
                              end = mid-1;
                        }
            }
            // If Elements exists then ans will be zero;
            int res = 0;
            // Element does not Exists
            if(ans == -1){
                  if(end == -1){
                        res = Math.abs(target - arr[start]);
                  } else if(start == arr.length){
                        res = Math.abs(target - arr[end]);
                  } else {    
                        int ans1 = Math.abs(target - arr[start]);
                        int ans2 = Math.abs(target - arr[end]);
                        res = (ans<ans2)?ans1:ans2;
                  }
            }
            System.out.println("Minimum Absolute Diffrenence is : " + res);
      }
 

}