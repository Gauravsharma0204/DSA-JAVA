import java.util.*;
public class LinearSearch01{
      public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
            System.out.print("Elements " + i + " : => ");
            arr[i] = sc.nextInt();
            }

            System.out.println();
            // printArr(arr);
            LinearSearch(arr, 20);
            printArr(arr);
          
      }

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
      }

      public static void LinearSearch(int arr[], int target) {
          int ans = -1;
          for (int i = 0; i < arr.length; i++) {
              if(arr[i] == target){
                  // System.out.println("Your Element is Founded : ");
                  ans = i;
                  break;
              }
          }
          if(ans == -1){
            System.out.println("Your Element not is Founded : ");
          } else {
            System.out.println("Your Element is Founded : ");
          }

      }
      
}