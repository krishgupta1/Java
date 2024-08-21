import java.util.Scanner;

public class Ex_1_Percentage {
    public static void main(String[] args) {
        System.out.println("Percentage Calculator");
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your English Marks");
        int english = inp.nextInt();
        System.out.println("Enter your Maths Marks");
        int maths = inp.nextInt();
        System.out.println("Enter your Hindi Marks");
        int hindi = inp.nextInt();
        System.out.println("Enter your Science Marks");
        int science = inp.nextInt();
        System.out.println("Enter your SST Marks");
        int social = inp.nextInt();

        float per = (((float) (english + maths + hindi + science + social) /500) *100);
        System.out.println("Your Percentage is :- " + per);
    }

}
