public class L_27_Arrays {
    public static void main(String[] args) {
        System.out.println("Array");

        int []arr = new int []{10,20,30,40,50};
        System.out.println(arr.length);
        System.out.println("Printing array in reverse ");
//        for (int i =4; i>=0;i--){
//            System.out.println(arr[i]);
//        }

        for ( int element : arr ){
            System.out.println(element);
        }

    }
}
