
import java.util.Scanner;

public class InsertIn2DArray{
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the Array Element List : ");
            
            System.out.print("Enter the Array Rows : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Array Columns : ");
            int num2 = sc.nextInt();
            int arr[][] = new int[num1][num2];
            
            for (int i = 0; i < arr.length-1; i++) {
                  for (int j = 0; j < arr[0].length; j++) {
                       System.out.print("Elements " + i + " " + j +" : => ");
                       arr[i][j] = sc.nextInt();
                  }
            }

            printArr(arr);
            insertIn2DArray(arr, 2, 2, 15);
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

      public static void insertElement(int arr[], int pos, int element){
            int size = arr.length;
            if(pos<0 || pos>size-1){
                  System.out.print("Wrong Position : ");
                  return;
            }

            for (int i = size-2; i >= pos ; i--) {
                arr[i + 1] = arr[i];
            }

            arr[pos] = element;

      }

      public static void insertIn2DArray(int arr[][], int pos1, int pos2, int element){
            insertElement(arr[pos1], pos2, element);
      }
      

}


