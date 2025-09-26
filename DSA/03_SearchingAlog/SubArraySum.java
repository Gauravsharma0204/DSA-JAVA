
import java.util.Scanner;

public class SubArraySum{
      public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

          System.out.print("Enter The Numbers of Rows : " );  
          int row = sc.nextInt();

          System.out.print("Enter The Numbers of Columns : " );  
          int column = sc.nextInt();

          int arr[][] = new int[row][column];

          for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                  System.out.print("Elements " + i + " " + j +" : => ");
                  arr[i][j] = sc.nextInt();   
            }    
          }

          maxSum(arr);

      }

// ********************Print the Array********************
      public static void printArr(int arr[][]) {
            for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                  System.out.print(arr[i][j] + " "); 
            } 
             System.out.println();   
          }
      }




      // **************************************************
      public static void maxSum(int arr[][]) {
          int max = Integer.MIN_VALUE;
          int resIndex = -1;

          for (int i = 0; i < arr.length; i++) {
              int sum = 0;
              for (int j = 0; j < arr[i].length; j++) {
                  sum = sum + arr[i][j];
              }
                  System.out.println("Sum fo Array : " + sum);

              if(sum > max){
                  max = sum;
                  resIndex = i;
              }
          }
          System.out.println("Maximun Sum of Sub Array : " + max + "," + "For the Index " + resIndex);
      }
}