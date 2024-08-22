public class L_14_StringMethods {
    public static void main(String[] args) {
        System.out.println("String Methods in Java");

        String name = "Krish";
//        System.out.println(name);
//
////        Finding the length of String
//        int value = name.length();
//        System.out.println(value);
//
////        Changing the String to LowerCase
//        String lcStr = name.toLowerCase();
//        System.out.println(lcStr);
//
////        Changing the String to Upper Case
//        String ucStr = name.toUpperCase();
//        System.out.println(ucStr);

////        Non Trimmed String
//        String newStr = "    Krish    ";
//        System.out.println(newStr);
//
////        Trimmed String
//        String trimmedStr = newStr.trim();
//        System.out.println(trimmedStr);

////        SubString
//        String subStr = "Krish";
//        System.out.println(subStr);
//
//        String subStr_ = subStr.substring(2);
//        System.out.println(subStr_);


////        SubString
//        String subString = "Krish";
//        System.out.println(subString);
//
//        String subString_ = subString.substring(2, 4);
//        System.out.println(subString_);

////        Replacing word in string
//        String nameRep = (name.replace('K','C'));
//        System.out.println(nameRep );

//        Checking Starts With
        System.out.println(name.startsWith("Kr"));
        System.out.println(name.startsWith("r"));

//        Checking Ends With
        System.out.println(name.endsWith("sh"));
        System.out.println(name.endsWith("i"));

//        Getting character through index
        System.out.println((name.charAt(2)));
        System.out.println((name.charAt(3)));

//        Getting (Index of ) String
        System.out.println((name.indexOf("ri")));

//        Last Index Of
//        name = "Krrissh";
        System.out.println((name.lastIndexOf("s")));
        System.out.println((name.lastIndexOf("s", 4)));

//        Checking String Equality
        System.out.println(name.equals("Krish"));

//        Equals Ignore Case
        System.out.println(name.equalsIgnoreCase("krish"));

//        Escape Characters
//        Single Quote
        System.out.println("This is an string having \' an Single Quote");

//        Double Quote
        System.out.println("This is an String having \" double Quote");


    }
}
