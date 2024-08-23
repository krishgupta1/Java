public class Practice_Set_6 {
    public static void main(String[] args) {
        System.out.println("Practice set 6");

//        Pattern Printing
        for (int i = 4; i>0;i--){
            for (int j = 0; j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

//        Sum first even numbers

        int sum =0;
        int n = 3;
        System.out.println("Printing the Even Numbers");
        for(int i = 0; i<n;i++){
            sum = sum +(2*i);
        }
        System.out.println(sum);


//        printing reverse table

        int n2 = 5;
        for (int i = 10; i>=1;i--){
            System.out.println(n2*i);
        }


//        Factorial of given numbers

//        fact = 2! = 2*1

        int i, fact =1;
        int num = 5;
        for(i=1;i<= num;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
