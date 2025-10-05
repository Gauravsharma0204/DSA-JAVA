// String =>
//    => a String is a sequence of characters enclosed in double quotes (" ").
//    => It is a class in java.lang package, but Java allows us to use it like a data type.
//    => String → immutable sequence of characters.
//    => Created using literals or new keyword.
//    => Has many useful methods for manipulation.
//    => For modification use StringBuffer/StringBuilder.

//    Ways to Create a String
//      => 1.String literal (most common)
//          Ex - String s1 = "Hello";

//      => 2. Using new keyword
//         Ex - String s2 = new String("Hello");

// ⚡ Difference:
//      => String literals are stored in String Pool (memory optimization).
//      => new String() always creates a new object in heap memory.


public class StringClass{
      public static void main(String args[]){
        String s1 = "Hello";                  // using literal
        String s2 = new String("World");      // using new keyword

        System.out.println(s1);  // Hello
        System.out.println(s2);  // World
      }
}