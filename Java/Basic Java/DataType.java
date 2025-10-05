// Data Types in Java =>
//        -> Data Types in Java define the type of data a variable can hold
//              and the operations that can be performed on that data.
//        -> Java is a strongly typed language, which means every variable
//              must be declared with a data type before use.

// Types Of Data Type

//   1. Primitive Data Types :
//        Whole Number(Integer Number)
//              1. byte -> (1 byte) -128 to 127
//              2. short -> (2 bytes) -32768 to 32767
//              3. int -> (4 byte) -2147483648 to 214748364
//              4. long -> (8 byte) -9223372036854775808 to 9223372036854775807

//          Decimal Number
//              1. float -> (4 byte) 1.4E-45 to 3.4028235E38
//              2. double -> (8 byte) 4.9E-324 to 1.7976931348623157E308

//          Charaters
//              1. char -> 0 to 65535 (All Character)

//          Boolean
//               1. Boolean -> true and false

//  2. Non-Primitive (Reference) Data Types
//        -> Non-primitive data types are created by programmers and refer to objects.
//        -> They store memory addresses (references) of actual data.

//          1. String
//          2. Arrays
//          3. Classes
//          4. Interfaces
//          5. Enums

public class DataType{
    public static void main(String[] args){

//        Whole Number
        byte age = 20;
        System.out.println("Range of Byte Min => " + Byte.MIN_VALUE);
        System.out.println("Range of Byte Min => " + Byte.MAX_VALUE);
        System.out.println(age);

        short num1 = 516;
        System.out.println("Range of Short Min => " + Short.MIN_VALUE);
        System.out.println("Range of Short Min => " + Short.MAX_VALUE);
        System.out.println(num1);

        int num2 = 24324525;
        System.out.println("Range of Integer Min => " + Integer.MIN_VALUE);
        System.out.println("Range of Integer Min => " + Integer.MAX_VALUE);
        System.out.println(num2);

        long num3 = 2216645;
        System.out.println("Range of Long Min => " + Long.MIN_VALUE);
        System.out.println("Range of Long Min => " + Long.MAX_VALUE);
        System.out.println(num3);

//        Decimal Number
        float num4 = 125.55111f;
        System.out.println("Range of Float Min => " + Float.MIN_VALUE);
        System.out.println("Range of Float Min => " + Float.MAX_VALUE);
        System.out.println(num4);

        double num5 = 125.55111f;
        System.out.println("Range of Double Min => " + Double.MIN_VALUE);
        System.out.println("Range of Double Min => " + Double.MAX_VALUE);
        System.out.println(num5);


//      Character
        char Char = 'G';
        char heartSymbol = '\u27A4';
        System.out.println("Range of Character Min => " + (int) Character.MIN_VALUE);
        System.out.println("Range of Character Min => " + (int) Character.MAX_VALUE);
        System.out.println(Char);
        System.out.println(heartSymbol);

//        for (int i = 0; i <= 127; i++) {
//            System.out.println((char) + i);
//        }

//      boolean
        boolean True = true;
        System.out.println(True);


    }
}