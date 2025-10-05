public class StringMethod{
      public static void main(String args[]){
            
      //    1. length() => Returns the length (number of characters) of the string.
            String str = "Hello World";
            System.out.println("Length: " + str.length());  // Output: 11
      
      // 2. charAt(int index) => Returns the character at a given position (0-based index).    
            String str1 = "Java";
            System.out.println(str1.charAt(0)); // Output: J
            System.out.println(str1.charAt(3)); // Output: a

      // 3. toUpperCase() & toLowerCase() => Converts string to uppercase or lowercase.
            String str2 = "Gaurav Kumar";
            System.out.println(str2.toUpperCase()); // Output: GAURAV KUMAR
            System.out.println(str2.toLowerCase()); // Output: gaurav kumar
      
      // 4. trim() => Removes leading and trailing spaces.
            String str3 = "   Hello Java   ";
            System.out.println(str3.trim()); // Output: "Hello Java"
      
      // 5. substring(int start, int end) => Extracts part of the string.
            String str4 = "Programming";
            System.out.println(str4.substring(0, 4)); // Output: Prog
            System.out.println(str4.substring(6));    // Output: mming

      // 6. equals() & equalsIgnoreCase() => Compares two strings (case-sensitive / case-insensitive).
            String s1 = "Hello";
            String s2 = "hello";
            System.out.println(s1.equals(s2));          // false
            System.out.println(s1.equalsIgnoreCase(s2));// true
      
      // 7. contains(String sub) => Checks if a substring is present.
            String str5 = "Java Programming";
            System.out.println(str5.contains("Java")); // true
            System.out.println(str5.contains("Python")); // false


      // 8. replace(old, new) => Replaces characters or words.

            String str6 = "I love Java";
            System.out.println(str.replace("Java", "Python")); 
            // Output: I love Python

      // 9. split(String regex) => Splits string into array based on regex/delimiter.
            String str7 = "apple,banana,grapes";
            String[] fruits = str7.split(",");
            for(String fruit : fruits) {
            System.out.println(fruit);
            }
            // Output: apple
            //         banana
            //         grapes
      
      // 10. indexOf(String) & lastIndexOf(String) => Returns position of substring.
            String str8 = "hello world";
            System.out.println(str8.indexOf("o"));       // 4
            System.out.println(str8.lastIndexOf("o"));   // 7


      }
}