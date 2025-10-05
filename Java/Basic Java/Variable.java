//Variable in Java ->
//       -> A variable in Java is a named memory location that is used to store data values.
//       -> The value of a variable can be changed during program execution.
//       -> Variable = container (name) + value (data)

//      Types of Variables
//          -> Local Variable → Method ke andar banta hai, sirf wahi use hota hai.
//          -> Instance Variable → Class ke andar banta hai, har object ka apna hota hai.
//          -> Static Variable → Class ke saath banta hai, sab objects ke liye common hota hai.

//      Rules for Naming Variables
//          -> Must begin with a letter, $, or _ (not with a number).
//          -> No spaces allowed.
//          -> Case-sensitive (Age ≠ age).
//          -> Cannot use Java keywords (int, class, etc.).
//          -> ✅ Valid: age, _count, $salary
//          -> ❌ Invalid: 123num, class, my name

public class Variable {
    public static void main(String[] args){

        int age = 21; // 'age' is an integer variable storing 21
        System.out.println(age); // Output: 21

        double price = 99.99; // 'price' stores a decimal number
        System.out.println(price); // Output: 99.99

        char grade = 'A'; // 'grade' stores a single character
        System.out.println(grade); // Output: A

    }
}