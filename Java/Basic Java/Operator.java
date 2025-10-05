// Operator : An operator is a special symbol in programming 
//            that is used to perform operations on variables and values (operands).

// Types of Operator
      // 1. Arithmetic Operators => (+ , - , * , / , %)
      // 2. Relational (Comparison) Operators => (== , != , > , < , >= , <=)
      // 3. Logical Operators => (&& , || , !)
      // 4. Assignment Operators => (= , += , -= , *= , /= , %=)
      // 5. Unary Operators => (++ , -- , + , - , ~ , !)
      // 6. Bitwise Operators => (& , | , ^ , ~ , << , >> , >>>)
      // 7. Ternary Operator (Conditional) => ( ? " ": "" )

public class Operator{
      public static void main(String[] args) {
          
      // 1. Arithmetic Operators => (+ , - , * , / , %)
            int a = 10, b = 3;
            System.out.println(a + b); // 13
            System.out.println(a - b); // 7
            System.out.println(a * b); // 30
            System.out.println(a / b); // 3
            System.out.println(a % b); // 1 (remainder)

      

      // 2. Relational (Comparison) Operators => (== , != , > , < , >= , <=)
            int x = 5, y = 8;
            System.out.println(x == y); // false
            System.out.println(x != y); // true
            System.out.println(x > y);  // false
            System.out.println(x < y);  // true
            System.out.println(x >= y); // false
            System.out.println(x <= y); // true


      // 3. Logical Operators => (&& , || , !)
            boolean p = true, q = false;
            System.out.println(p && q); // false (AND)
            System.out.println(p || q); // true  (OR)
            System.out.println(!p);     // false (NOT)

      // 4. Assignment Operators => (= , += , -= , *= , /= , %=)
            int n = 10;
            n += 5;  // n = n + 5 → 15
            n -= 3;  // n = n - 3 → 12
            n *= 2;  // n = n * 2 → 24
            n /= 4;  // n = n / 4 → 6
            n %= 5;  // n = n % 5 → 1


      // 5. Unary Operators => (++ , -- , + , - , ~ , !)
            int k = 5;
            System.out.println(++k); // 6 (pre-increment)
            System.out.println(k++); // 6 (post-increment, then k=7)
            System.out.println(--k); // 6 (pre-decrement)
            System.out.println(k--); // 6 (post-decrement, then k=5)
            System.out.println(+k);  // 5 (unary plus)
            System.out.println(-k);  // -5 (unary minus)
            boolean j = true;
            System.out.println(!j);  // false

      
      // 6. Bitwise Operators => (& , | , ^ , ~ , << , >> , >>>)
            // int c = 5, d = 3; // binary: 0101 & 0011
            System.out.println(a & b);  // 1 (AND)
            System.out.println(a | b);  // 7 (OR)
            System.out.println(a ^ b);  // 6 (XOR)
            System.out.println(~a);     // -6 (NOT)
            System.out.println(a << 1); // 10 (Left Shift)
            System.out.println(a >> 1); // 2  (Right Shift)
            System.out.println(a >>> 1);// 2  (Unsigned Right Shift)

      
      // 7. Ternary Operator (Conditional) => ( ? " ": "" )
            int age = 18;
            String result = (age >= 18) ? "Adult" : "Minor";
            System.out.println(result); // Adult

      
      }
}