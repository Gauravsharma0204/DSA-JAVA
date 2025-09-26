
import java.util.*;
public class CountOccurece{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
                  System.out.print("Elements " + i + " : => ");
                  arr[i] = sc.nextInt();
            }
            

            int first = binarySearchIncres(arr, 5, true);
            int last = binarySearchIncres(arr, 5, false);

            if(first == -1){
                  System.out.println("Occurence of Target is : " + 0);
            } else {
                  System.out.println("Occurence of Target is : " + (last - first + 1));
            }


      }

/********************************************************************* */

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }

      }
/******************************************************************************* */
      public static int binarySearchIncres(int arr[],int target, boolean isFirst){
            int start = 0;
            int end = arr.length-1;
            int ans = -1;
            while (start <= end) { 
                  int mid = start + (end - start) / 2; // correct mid calculation
                        if(arr[mid] == target){
                              ans = mid;
                              if(isFirst){
                                    end = mid - 1;
                              } else {
                                    start = mid + 1;
                              }
                        } else if(arr[mid] < target){
                              start = mid+1;
                        } else {
                              end = mid-1;
                        }
            }

            return ans;
            // if(ans == -1){
            //       System.out.println("Elements is Not Found");
            // } else {
            //       System.out.println("Elements is Found : " + ans);  
            // }

      }
}