/**********************
Bitonic or Mountain Array =>
A Bitonic Array is a special type of array in which:
The elements first strictly increase up to a certain point (called the peak)
And then strictly decrease after that.

👉 In other words, it has two parts:
      Increasing sequence
      Decreasing sequence

Example of a Bitonic Array:
[2, 4, 7, 12, 9, 5, 3]
 */


import java.util.*;
public class FindSmallest{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
                  System.out.print("Elements " + i + " : => ");
                  arr[i] = sc.nextInt();
            }
            smallest(arr);

      }

/********************************************************************* */

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }

      }
      static void smallest(int arr[]){
            int n = arr.length-1;
            if(arr[0] > n){
                  System.out.println(n);
            } else {
                  System.out.println(arr[0]);
            }
      }
}