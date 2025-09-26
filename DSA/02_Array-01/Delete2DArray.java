
import java.util.Scanner;

public class Delete2DArray{
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the Array Element List : ");
            
            System.out.print("Enter the Array Rows : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Array Columns : ");
            int num2 = sc.nextInt();
            int arr[][] = new int[num1][num2];
            
            for (int i = 0; i < arr.length; i++) {
                  for (int j = 0; j < arr[0].length; j++) {
                       System.out.print("Elements " + i + " " + j +" : => ");
                       arr[i][j] = sc.nextInt();
                  }
            }

            printArr(arr);
            Delete2DArray(arr, 2, 2);
            printArr(arr);
          
      }

      public static void printArr(int arr[][]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                  for (int j = 0; j < arr[0].length; j++) {
                      System.out.print(arr[i][j] + " ");
                  }
                  System.out.println();
            
            }
      }

      public static void deleteElement(int arr[], int pos){

            for (int i = pos; i <= arr.length-2; i++) {
                  arr[i] = arr[i + 1];
            }
            arr[arr.length-1] = 0;

      }

      public static void Delete2DArray(int arr[][], int pos1, int pos2){
            deleteElement(arr[pos1], pos2);
      }
      

}


