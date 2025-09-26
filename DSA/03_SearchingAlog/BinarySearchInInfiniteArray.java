
import java.util.*;
public class BinarySearchInInfiniteArray{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
                  System.out.print("Elements " + i + " : => ");
                  arr[i] = sc.nextInt();
            }

            findElementInInfinteSortedArray(arr, 25);
      }

/********************************************************************* */

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }

      }
/******************************************************************************* */
//  How to Find Range in Infinite Array
      static int[] findRange(int arr[], int target){
            int range[] = new int[2];

            int start = 0;
            int end = 1;

            while(arr[end] < target){
                  start = end;
                  end = 2*end;
            }
            range[0] = start;
            range[1] = end;
            return range;
      }

/************************************** */
      public static int binarySearchInRange(int arr[],int target, int start, int end){
            if(arr.length == 0){
                  return -1;
            }
           
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
            return ans;
      }
/************************************* */
      static void findElementInInfinteSortedArray(int arr[], int target){
             int range[] = findRange(arr, 30);

            int ans = binarySearchInRange(arr, 30, range[0], range[1]);

            if(ans == -1){
                  System.out.println("Element Does not Found ");
            } else {
                  System.out.println("Element Found at Index " + ans);
            }

      }
}