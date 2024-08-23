public class L_24_BreakContinue {
    public static void main(String[] args) {
        System.out.println("Break and Continue Statement");
           for (int i=1;i<=5;i++){
               if(i==2){
                   System.out.println(i);
                   break;

               }
           }

           for (int i=1;i<=5;i++){
               System.out.printf("i = %d",i);
               if(i==2){
                   System.out.println(i);
                   continue;
               }
               System.out.println(i*i);
           }
    }
}
