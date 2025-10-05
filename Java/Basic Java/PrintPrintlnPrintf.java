// print(), println(), and printf() are used to display output on the screen, but they have different behaviors.

public class PrintPrintlnPrintf{
      public static void main(String[] args) {

//       1. print()
//          => Prints the text on the same line.
//          =>Cursor stays at the end of the output (no new line).       

            System.out.print("Hello ");
            System.out.print("World");

//       2. println()
//          => Prints the text and moves cursor to the next line.
//          => "ln" means line.

            System.out.println("Hello");
            System.out.println("World");

//       3. printf()
//          => Used for formatted output (like in C/C++).
//          => You can format numbers, strings, decimals, etc.
//          => Needs format specifiers like %d, %s, %f.

            int age = 20;
            double marks = 85.6789;
            String name = "Gaurav";

            System.out.printf("Name: %s, \nAge: %d, Marks: %.2f", name, age, marks);


      }
}