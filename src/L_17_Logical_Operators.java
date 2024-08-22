public class L_17_Logical_Operators {
    public static void main(String[] args) {
        System.out.println("Logical Operators in Java");

//        Locical AND
         int a = 10, b = 20;
         if((a>b) && (b<a)){
             System.out.println("Both Condi. are true");
         }
         else{
             System.out.println("false");
         }

 //        Locical OR
         if((a>b) || (b<a)){
             System.out.println("Both Condi. are true");
         }
         else{
             System.out.println("false");
         }

 //        Locical NOT

         if(!(a>b)){
             System.out.println("True");
         }
         else{
             System.out.println("false");
         }
    }
}
