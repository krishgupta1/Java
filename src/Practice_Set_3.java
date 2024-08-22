public class Practice_Set_3 {
    public static void main(String[] args) {
        System.out.println("Practice Set 3");
//        Convert a String to lower case
        String lCase = "THIS IS A STRING IN UPPERCASE CHANGE IT TO LOWERCASE";
        System.out.println(lCase);
        System.out.println(lCase.toLowerCase());

//        Replace Spaces with underscores

        String replace = "Replace  Space  With  Underscores";
        System.out.println(replace);
        System.out.println(replace.replace("  ", "_"));

//        Replace a word in String
        String repWord = "Dear </name>, Thanks a lot!";
        System.out.println(repWord);
        System.out.println(repWord.replace("</name>","Krish Gupta" ));

//        Detect Two or Three Spaces in String
        String space = "This i s a string containing two  or three   Spaces";
        System.out.println(space);
        System.out.println(space.indexOf(" "));
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

//        Format the Letter

        String myLetter = "Dear Krish, \n \tHow are you. I wish for your successful journey. \nHappy Journey!";
        System.out.println(myLetter);
    }
}
