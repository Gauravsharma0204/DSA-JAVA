//    Conditional Statement.
      // if => Only executes when condition is true.
      // if-else => Executes one block if true, another if false.
      // if-else-if ladder => Multiple conditions checked in sequence.
      // nested if => One condition inside another (hierarchy check).
      // switch => Used when we have many fixed cases (cleaner than multiple if-else).

public class ConditionalStatement {
    public static void main(String[] args) {

        // 1. if statement
        int age = 20;
        if (age >= 18) {
            System.out.println("✅ IF: You are eligible to vote.");
        }

        // 2. if-else statement
        int age2 = 16;
        if (age2 >= 18) {
            System.out.println("✅ IF-ELSE: You can vote.");
        } else {
            System.out.println("✅ IF-ELSE: You cannot vote.");
        }

        // 3. if-else-if ladder
        int marks = 75;
        if (marks >= 90) {
            System.out.println("✅ IF-ELSE-IF: Grade A+");
        } else if (marks >= 75) {
            System.out.println("✅ IF-ELSE-IF: Grade A");
        } else if (marks >= 50) {
            System.out.println("✅ IF-ELSE-IF: Grade B");
        } else {
            System.out.println("✅ IF-ELSE-IF: Fail");
        }

        // 4. Nested if
        int personAge = 25;
        boolean hasID = true;
        if (personAge >= 18) {  // outer condition
            if (hasID) {        // inner condition
                System.out.println("✅ NESTED IF: Entry allowed.");
            } else {
                System.out.println("✅ NESTED IF: ID required.");
            }
        } else {
            System.out.println("✅ NESTED IF: Underage, entry denied.");
        }

        // 5. switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("✅ SWITCH: Monday");
                break;
            case 2:
                System.out.println("✅ SWITCH: Tuesday");
                break;
            case 3:
                System.out.println("✅ SWITCH: Wednesday");
                break;
            case 4:
                System.out.println("✅ SWITCH: Thursday");
                break;
            case 5:
                System.out.println("✅ SWITCH: Friday");
                break;
            case 6:
                System.out.println("✅ SWITCH: Saturday");
                break;
            case 7:
                System.out.println("✅ SWITCH: Sunday");
                break;
            default:
                System.out.println("✅ SWITCH: Invalid day");
        }
    }
}
