
import java.util.Scanner;

public class Update{
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
      //     System.out.println("Enter the Array Element List : ");

      //     int num = sc.nextInt();

          int[] arr = new int[5];

          for (int i = 0; i < arr.length; i++) {
              System.out.print("Elements " + i + " => ");
              arr[i] = sc.nextInt();
          } 

            printArr(arr);
            update(arr, 2, 15);
            printArr(arr);
      }

       public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
      }

      public static void update(int arr[], int pos, int element){ 
            int size = arr.length;
            if(pos<0 || pos>=size-1){
                  System.out.println("Wrong Position : ");
                  return;
            }
            
            arr[pos] = element;
      }

}



