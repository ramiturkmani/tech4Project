package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Homework16 {

    //---------- TASK-1 ----------//
    public static int countWords(String str){
        if(str.trim().isEmpty()) return 0;
        else{
            int countSpaces = 1;
            for (char c : str.trim().toCharArray()) {
                if (c == ' ') countSpaces++;
            }
            return countSpaces;
        }
    }

    //---------- TASK-2 ----------//
    public static int countA(String str){
        if(!str.toLowerCase().contains("a")) return 0;
        else{
            int countA = 0;
            for (char c : str.toLowerCase().toCharArray()) {
                if (c == 'a') countA++;
            }
            return countA;
        }
    }

    //---------- TASK-3 ----------//
    public static int countPos(ArrayList<Integer> arr){
        int countPos = 0;
        for (Integer integer : arr) {
            if(integer > 0) countPos++;
        }
        return countPos;
    }

    //---------- TASK-4 ----------//
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (Integer integer : arr) {
            if(!newArr.contains(integer)) newArr.add(integer);
        }
        return newArr;
    }

    //---------- TASK-5 ----------//
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> arr) {
//        ArrayList<String> newArr = new ArrayList<>();
//        for (String string : arr) {
//            if(!newArr.contains(string)) newArr.add(string);
//        }
//        return newArr;
        LinkedHashSet<String> noDups = new LinkedHashSet<>(arr);
        return new ArrayList<>(noDups);
    }

    //---------- TASK-6 ----------//
    public static String removeExtraSpaces(String str){
        String[] words = str.trim().split(" ");
        String newString = "";
        for (String word : words) {
            if(!word.isEmpty()) newString += word + " ";
        }
        return newString.trim();
    }

    //---------- TASK-7 ----------//
    public static int[] add(int[] arr1, int[] arr2){
        int[] newArr;
        if (arr1.length >= arr2.length) newArr = arr1;
        else newArr = arr2;
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            newArr[i] = arr1[i] + arr2[i];
        }
        return newArr;
    }

    //---------- TASK-8 ----------//
    public static int findClosestTo10(int[] arr) {
        int closestAbove = Integer.MAX_VALUE;
        int closestBelow = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int num : arr){
            if(num > 10 && num < closestAbove) closestAbove = num;
            else if(num < 10 && num > closestBelow) closestBelow = num;
        }
        if(closestAbove - 10 >= 10 - closestBelow) return closestBelow;
        return closestAbove;
    }

    // TESTING METHODS
    public static void main(String[] args) {

        System.out.println("---------- TASK-1 ----------\n");
        String t1_string = "   Java is fun    ";
        System.out.println(countWords(t1_string));

        System.out.println("\n---------- TASK-2 ----------\n");
        String t2_string = "QA stands for Quality Assurance";
        System.out.println(countA(t2_string));

        System.out.println("\n---------- TASK-3 ----------\n");
        ArrayList<Integer> t3_list = new ArrayList<>();
        t3_list.add(-23);
        t3_list.add(-4);
        t3_list.add(0);
        t3_list.add(2);
        t3_list.add(5);
        t3_list.add(90);
        t3_list.add(123);
        System.out.println(countPos(t3_list));

        System.out.println("\n---------- TASK-4 ----------\n");
        ArrayList<Integer> t4_list = new ArrayList<>();
        t4_list.add(10);
        t4_list.add(20);
        t4_list.add(35);
        t4_list.add(20);
        t4_list.add(35);
        t4_list.add(60);
        t4_list.add(70);
        t4_list.add(60);
        System.out.println(removeDuplicateNumbers(t4_list));

        System.out.println("\n---------- TASK-5 ----------\n");
        ArrayList<String> t5_list = new ArrayList<>();
        t5_list.add("abc");
        t5_list.add("xyz");
        t5_list.add("123");
        t5_list.add("ab");
        t5_list.add("abc");
        t5_list.add("ABC");
        t5_list.add("ABC");
        t5_list.add("xyz");
        System.out.println(removeDuplicateElements(t5_list));

        System.out.println("\n---------- TASK-6 ----------\n");
        String t6_string = "     I    am    learning    Java    ";
        System.out.println(removeExtraSpaces(t6_string));

        System.out.println("\n---------- TASK-7 ----------\n");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1,arr2)));

        System.out.println("\n---------- TASK-8 ----------\n");
        int[] numbers = {10, -13, 5, 70, 15, 57};
        System.out.println(findClosestTo10(numbers));

        System.out.println("End of the program!");
    }
}