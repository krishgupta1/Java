import java.util.Scanner;

public class Practice_Set_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Practice Set 1");

//      Sum of three numbers

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int add = (num1 + num2  + num3);
        System.out.println("Addition Of " + num1 + " + " + num2 + " + " + num3 + " = " + add);

//      CGPA Calculator
        System.out.println("Enter your English Marks ");
        int eng = sc.nextInt();
        System.out.println("Enter your Maths Marks ");
        int maths = sc.nextInt();
        System.out.println("Enter your Hindi Marks ");
        int hindi = sc.nextInt();

        float per = (((float)(eng + hindi + maths)/300)*100);

//        Converting to CGPA from Percentage
        double cg = 9.5;
        double cgpa = (per/ cg);
        System.out.println("Your Percentage is " + per);
        System.out.println("Your CGPA is " + cgpa);

//        Asking User to Enter Your name and greet him

        System.out.println("Please Enter Your Name ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "! Have a Good Day!!");

//        Converting Kilometer to Miles
        System.out.println("Kilometer to miles converter");
        System.out.println("Enter Kilometer ");
        float km = sc.nextFloat();
        double miles = (km * 0.62137);
        System.out.println(km + " km is " + miles + " miles");

//        Detecting the Entered number is Integer or not

        System.out.println("Checking the Entered Number is Integer or Not");
        System.out.println("Enter a number ");
        boolean number = sc.hasNextInt();
        System.out.println(number);;
    }
}
