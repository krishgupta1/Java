import java.util.Scanner;

public class Practice_Set_4 {
    public static void main(String[] args) {
//        1st question
    int a = 10;
    if(a==11){
        System.out.println(a);
    }
    else{
        System.out.println(a);
    }


//        2nd Question
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter M1 Marks");
        int m1 = sc.nextInt();
        System.out.println("Enter M1 Marks");
        int m2 = sc.nextInt();
        System.out.println("Enter M1 Marks");
        int m3 = sc.nextInt();

        float avg = (m1+m2+m3) / 3.0f;

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Pass");
            System.out.printf("Your avg is %f ",avg);
        }
        else {
            System.out.println("Fail");
        }


//        Tax calculator 3rd Question

        float tax = 0;

        float income = sc.nextFloat();
        float taxAmt;

        if(income < 250000){
            tax = tax+ 0;
            taxAmt = ((income/100)*tax);
            System.out.printf("You have to pay %f Tax", tax);
        }
        else if(income >= 250000 && income < 500000){
            tax = 5;
            taxAmt = ((income/100)*tax);
            System.out.printf("You have to pay :- %f Tax per year", taxAmt);
        }
        else if(income > 500000 && income < 1000000){
            tax = 20;
            taxAmt = ((income/100)*tax);
            System.out.printf("You have to pay :- %f Tax per year", taxAmt);
        }
        else if(income > 1000000){
            tax = 30;
            taxAmt = ((income/100)*tax);
            System.out.printf("You have to pay :- %f Tax per year", taxAmt);
        }


//        Finding the day of week using Number

        int week = sc.nextInt();
        System.out.println("Enter the number of the weekday");
        switch (week) {
            case 1 :
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5 :
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
        }

//         Finding Leap year or not
        int year = sc.nextInt();
        if((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)){
            System.out.printf("%d is a leap year.",year);
        }
        else{
            System.out.printf("%d is not a leap year.",year);
        }


//        Finding the type of the website
        System.out.println("Enter the URL of the Website : ");
        String web = sc.next();

        if (web.endsWith(".com")){
            System.out.println("This is an Commercial Website");
        }
        else if (web.endsWith(".org")) {
            System.out.println("This is an Organisational Webiste");
        }

        else if (web.endsWith(".in")) {
            System.out.println("This is an Indian Website");
        }
        else{
            System.out.println("This is an Other type of website");
        }


    }
}
