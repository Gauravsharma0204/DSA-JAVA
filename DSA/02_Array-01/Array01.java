import java.util.Scanner;

public class Array01{
      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Array Element List : ");
            
            int num = sc.nextInt();
            int arr[] = new int[num];
            
            for (int i = 0; i < arr.length; i++) {
            System.out.print("Elements " + i + " : => ");
            arr[i] = sc.nextInt();
            }

            printArr(arr);
          
      }

      public static void printArr(int arr[]){ 
            System.out.println();
            for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            }
      }
}