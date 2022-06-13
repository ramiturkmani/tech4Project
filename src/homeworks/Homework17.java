package homeworks;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Homework17 {
    //-----Task-1-----
    public static String underscore(String str){
        return str.replaceAll(" ", "_");
    }

    //-----Task-2-----
    public static int vowelCount(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Pattern.matches("[AEIOUaeiou]", str.substring(i,i+1))) count ++;
        }
        return count;
    }

    //-----Task-3-----
    public static String[] stringArray(String str){
        return str.trim().split(" ");
    }

    //-----Task-4-----
    public static boolean validEmail(String email){
        return Pattern.matches("[A-Za-z0-9.]{2,}\\@[A-Za-z0-9.]{2,}\\.[A-Za-z0-9.]{2,}", email);
    }

    //-----Task-5-----
    public static String[] separateLettersAndDigits(String str){
        return new String[5];
    }

    public static void main(String[] args) {
        System.out.println(underscore("Java is fun"));
        System.out.println(vowelCount("JAVA"));
        System.out.println(Arrays.toString(stringArray("Java is fun")));
        System.out.println(validEmail("abc@student.techglobal.com"));
        System.out.println(separateLettersAndDigits("abc123"));
    }
}
