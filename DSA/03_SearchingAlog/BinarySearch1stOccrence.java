
import java.util.*;
public class BinarySearch1stOccrence{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
                  System.out.print("Elements " + i + " : => ");
                  arr[i] = sc.nextInt();
            }

            /******************************************************************* */
            // binarySearchIncres(arr, 10, true); // Find the First Occurence
            // binarySearchIncres(arr, 10, false); // Find the Last Occurence
            binarySearchDecs(arr, 20, true); 
            /******************************************************************** */


            

      }

/********************************************************************* */

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }

      }
/******************************************************************************* */
      public static void binarySearchIncres(int arr[],int target, boolean isFirst){
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

            if(ans == -1){
                  System.out.println("Elements is Not Found");
            } else {
                  System.out.println("Elements is Found : " + ans);  
            }

      }
// ******************************************************************************

      public static void binarySearchDecs(int arr[],int target, boolean isFirst){
            int start = 0;
            int end = arr.length-1;
            int ans = -1;
            while (start <= end) { 
                  int mid = start + (end - start) / 2; // correct mid calculation
                        if(arr[mid] == target){
                              ans = mid;
                              if(isFirst){
                                    start = mid + 1;
                              } else {
                                    end = mid - 1;
                              }
                        } else if(arr[mid] < target){
                              end = mid-1;
                        } else {
                              start = mid+1;
                        }
            }

            if(ans == -1){
                  System.out.println("Elements is Not Found");
            } else {
                  System.out.println("Elements is Found : " + ans);  
            }

      }

}