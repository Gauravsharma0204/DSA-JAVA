
import java.util.Scanner;

public class Insert{
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the Array Element List : ");
            
            // int num = sc.nextInt();
            int arr[] = new int[5];
            
            for (int i = 0; i < arr.length - 2; i++) {
            System.out.print("Elements " + i + " : => ");
            arr[i] = sc.nextInt();
            }

            printArr(arr);
            insertElement(arr, 2, 15);
            printArr(arr);
          
      }

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
}


