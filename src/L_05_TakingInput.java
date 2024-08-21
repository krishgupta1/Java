import java.util.Scanner;

public class L_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the users");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :- ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("a+b = " + sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

    }
}
