package homeworks;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HomeworkR4 {
    //Task-1
    public static String noSpace(String str){
//        String noSpaces = "";
//        for (char c : str.toCharArray()) {
//            if (c != ' ') noSpaces += c;
//        }
//        return noSpaces;
        return str.replaceAll(" ","");
    }

    //Task-2
    public static String replaceFirstLast(String str){
        String trimmed = str.trim();
        if (trimmed.length() < 2) return "";
        else{
            return trimmed.charAt(trimmed.length()-1) + trimmed.substring(1,trimmed.length()-1) + trimmed.charAt(0);
        }
    }

    //Task-3
    public static boolean hasVowel(String str){
//        String lower = str.toLowerCase();
//        if (lower.contains("a") || lower.contains("e") || lower.contains("i") || lower.contains("o") || lower.contains("u")) return true;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return true;
        }
        return false;
    }

    //Task-4
    public static void checkAge(int yearOfBirth){
        int age = (Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()))) - yearOfBirth;
        if (age >= 0 && age < 16) System.out.println("AGE IS NOT ALLOWED");
        else if (age >= 16 && age <= 100) System.out.println("AGE IS ALLOWED");
        else System.out.println("AGE IS NOT VALID");
    }

    //Task-5
    public static int averageOfEdges(int a, int b, int c){
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (max + min) / 2;
    }

    //Task-6
    public static String[] noA(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().startsWith("a")) arr[i] = "###";
        }
        return arr;
    }

    //Task-7
    public static int[] no3or5(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 15 == 0) arr[i] = 101;
            else if (arr[i] % 3 == 0) arr[i] = 100;
            else if (arr[i] % 5 == 0) arr[i] = 99;
        }
        return arr;
    }

    //Task-8
    public static int countPrimes(int[] arr){
        int count = 0;
        for (int element : arr){
            int tempCount = 0;
            for (int i = 1; i <= element; i++){
                if (element % i == 0 && element != 1){
                    tempCount++;
                }
            }
            if(tempCount == 2) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "   Hello World     ";
        System.out.println(noSpace(str));
        System.out.println(replaceFirstLast(str));
        System.out.println(hasVowel(str));
        checkAge(2023);
        System.out.println(averageOfEdges(10,18,20));
        String[] arr = {"appium", "123", "java", "Alex"};
        System.out.println(Arrays.toString(noA(arr)));
        System.out.println(Arrays.toString(no3or5(new int[] {10, 11, 12, 13, 14, 15})));
        System.out.println(countPrimes(new int[] {7, 4, 11, 23, 17}));
    }
}