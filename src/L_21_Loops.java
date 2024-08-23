import java.util.Scanner;

public class L_21_Loops {
    public static void main(String[] args) {
        System.out.println("Loops in Java ");
        Scanner num = new Scanner(System.in);
        int val = num.nextInt();
        int i =1;
        int c;
        while(i<=10){
            c = val*i;
            System.out.printf("%d * %d = %d \n",val,i,c);
            i++;
        }

        int n = 10;
        for (int j = 0; j<n;j++){
            System.out.println(2*j+1);
        }

    }
}
