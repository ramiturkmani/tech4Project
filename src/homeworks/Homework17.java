package homeworks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework17 {
    //-----Task-1-----
    public static String underscore(String str){
     String s = str.replaceAll(" ", "_");
     return s;
    }

    //-----Task-2-----
//    public static int vowelCount(String str){
//
//    }

    public static void main(String[] args) {
        System.out.println(underscore("Java is fun"));
//        System.out.println(vowelCount("JAVA"));
    }
}
