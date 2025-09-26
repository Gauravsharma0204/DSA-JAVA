
import java.util.Scanner;

public class Deletion{
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the Array Element List : ");
            
            // int num = sc.nextInt();
            int arr[] = new int[5];
            
            for (int i = 0; i < arr.length ; i++) {
            System.out.print("Elements " + i + " : => ");
            arr[i] = sc.nextInt();
            }

            printArr(arr);
            deleteElement(arr, 2);
            printArr(arr);
          
      }

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
      }

      public static void deleteElement(int arr[], int pos){

            for (int i = pos; i <= arr.length-2; i++) {
                  arr[i] = arr[i + 1];
            }
            arr[arr.length-1] = 0;

      }
}


