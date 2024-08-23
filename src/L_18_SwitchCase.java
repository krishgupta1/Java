import java.util.Scanner;

public class L_18_SwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
////        Else if statements
//         if (age > 56) {
//             System.out.println("Greater than 56");
//         }
//         else if(age >45) {
//             System.out.println("Greater than 45");
//         }
//         else if(age >35) {
//             System.out.println("Greater than 35 ");
//         }
//         else {
//             System.out.println("Not Checkable");
//         }

//         Switch Case Statement

        switch (age) {
            case 18:
                System.out.println("You are 18");
                break;

            case 25:
                System.out.println("You are 25");
                break;

            default :
                System.out.println("Enjoy");
        }
        //              Enhanced Switch - Case
//            case 28 -> System.out.println();

        System.out.println("Nothing");

    }
}
