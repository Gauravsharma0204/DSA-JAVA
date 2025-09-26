
import java.util.Scanner;

public class Array2D{
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

}


