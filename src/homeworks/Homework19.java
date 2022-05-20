package homeworks;

import java.util.Arrays;

public class Homework19 {
    //TASK - 1
    public static String noDigits(String str){
//        String newStr = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (!Character.isDigit(str.charAt(i))) newStr += str.charAt(i);
//        }
//        return newStr;
        return str.replaceAll("\\d", "").trim();
    }

    //TASK - 2
    public static String noVowel(String str){
//        String newStr = "";
//        for (int i = 0; i < str.length(); i++) {
//            if (!CharacterHelper.isVowel(str.charAt(i))) newStr += str.charAt(i);
//        }
//        return newStr;
        return str.replaceAll("[AEIOUaeiou]", "").trim();
    }

    //TASK - 3
    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        return sum;
    }

    //TASK - 4
    public static boolean hasUpperCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) return true;
        }
        return false;
    }

    //TASK - 5
    public static int middleInt(int a, int b, int c){
        if (a >= b && a <= c || a <= b && a >= c) return a;
        else if (b >= a && b <= c || b <= a && b >= c) return b;
        else return c;
    }

    //TASK - 6
    public static int[] no13(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }

    //TASK - 7
    public static int[] arrFactorial(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else {
                int factorial = 1;
                for (int j = 1; j <= arr[i]; j++) {
                    factorial *= j;
                }
                arr[i] = factorial;
            }
        }
        return arr;
    }

    //TASK - 8
    public static String[] categorizeCharacters(String str){
        String[] strArr = {"", "", ""};
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) continue;
            else if (Character.isLetter(str.charAt(i))) strArr[0] += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) strArr[1] += str.charAt(i);
            else if (!Character.isLetterOrDigit(str.charAt(i))) strArr[2] += str.charAt(i);
        }
        return strArr;
    }

    public static void main(String[] args) {
        System.out.println(noDigits("He9llo Wor4ld 237"));
        System.out.println(noVowel("Hello World AEI"));
        System.out.println(sumOfDigits("6 Hello 293"));
        System.out.println(hasUpperCase("Hello World"));
        System.out.println(middleInt(12,18,15));
        int[] arr = {1,2,3,4,6};
        System.out.println(Arrays.toString(no13(arr)));
        System.out.println(Arrays.toString(arrFactorial(arr)));
        System.out.println(Arrays.toString(categorizeCharacters(" ? 567 Hello 234 ! World ")));
    }
}
