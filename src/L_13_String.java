import java.util.Scanner;

public class L_13_String {
    public static void main(String[] args) {
        System.out.println("String in JAVA");

////        String Object Using constructor
        String str = new String("Krish");
        System.out.println(str);
//
////        using string as a data type
//
        String name = "Krish Gupta";
        System.out.println(name);

////        Different ways to print in java
//
        System.out.print("The name is :- "); // no new line printed at the end
        System.out.println("Krish"); //new line will be printed at the end
//
////        Format specifiers
        int a = 6;
        float f = 5.6534f;
        System.out.printf("The value of a is %d and the value of F is %f", a,f);

//        Taking String as an input
        Scanner sc = new Scanner(System.in);
        String st = sc.next(); //It only prints one word
        System.out.println(st);
        String st2 = sc.nextLine(); //It prints the whole string
        System.out.println(st2);
    }
}
