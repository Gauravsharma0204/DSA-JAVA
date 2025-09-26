
import java.util.Scanner;

public class UpdateIn2DArray{
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
      //     System.out.println("Enter the Array Element List : ");

      //     int num = sc.nextInt();

          int[][] arr = new int[3][3];

          for (int i = 0; i < arr.length; i++) {
              for(int j = 0; j < arr[0].length; j++){
                  System.out.print("Elements " + i + " " + j +" => ");
                  arr[i][j] = sc.nextInt();
              }
              System.out.println();
              
          } 

            printArr(arr);
            update(arr, 0, 1, 25);
            printArr(arr);
      }

       public static void printArr(int arr[][]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
                  for(int j = 0; j < arr[0].length; j++){
                        System.out.print(arr[i][j] + " ");
                  }
                  System.out.println();
            }
      }

      public static void update(int arr[][], int pos1, int pos2, int element){ 
            int size = arr.length;
            if(pos1<0 || pos1>size-1){
                  System.out.println("Wrong Position : ");
                  return;
            }

            int size1 = arr[pos1].length;
            if(pos2<0 || pos2>size-1){
                  System.out.println("Wrong Position : ");
                  return;
            }

            arr[pos1][pos2] = element;
      }

}



