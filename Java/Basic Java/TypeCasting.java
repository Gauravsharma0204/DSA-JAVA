//      Typecasting => Typecasting means converting one data type into another.

//      Types of TypeCasting
//       1. Widening (Implicit Casting)
//            -> Also called upcasting.
//            -> Small data type → bigger data type (automatically).
//            -> No data loss.
//            -> Ex : byte → short → int → long → float → double

//      2. Narrowing (Explicit Casting)
//            -> Also called downcasting.
//            -> Bigger data type → smaller data type.
//            -> Needs manual casting (type).
//            -> data can loss.
//            -> Ex : double -> float -> long -> int -> short -> byte


public class TypeCasting{
    public static void main(String[] args){

//      Widening (Implicit Casting)
        int a = 50;      // 4 bytes
        double b = a;    // 8 bytes (auto conversion)
        System.out.println("Int value: " + a);
        System.out.println("Double value: " + b);

//      Narrowing (Explicit Casting)
        double d = 9.78;   // 8 bytes
        int i = (int) d;   // 4 bytes (manual conversion)
        System.out.println("Double value: " + d);
        System.out.println("Int value: " + i);
    }
}


