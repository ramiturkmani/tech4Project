package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class WhiteboardMentoring {
    /*
    -----TASK-1-----
    Requirement:
    Write a method countWords() that takes a String as an argument, and returns how many words there are in the given String

    Test data 1:
    String str = “      Java is fun       ”;
    Expected output 1:
    3
     */
    public static int countWords(String str){
//        if(str.trim().isEmpty()) return 0;
//        else{
//            int countSpaces = 1; //starts at 1 because 1 space means there is at least 2 words
//            for (char c : str.trim().toCharArray()) {
//                if (c == ' ') countSpaces++;
//            }
//            return countSpaces;
//        }
        String[] strArr = str.trim().split(" ");
        return strArr.length;
    }


    /*
    -----TASK-2-----
    Requirement:
    Write a method add() that takes 2 int[] arrays as arguments and returns a new array with sum of given arrays elements.
    Test data 1:
    int[] arr1 = {3, 0, 0, 7, 5, 10};
    int[] arr2 = {6, 3, 2};

    Expected output 1:
    [9, 3, 2, 7, 5, 10]
     */

    public static int[] add(int[] arr1, int[] arr2){
        int[] newArr;
        if (arr1.length >= arr2.length) newArr = arr1;
        else newArr = arr2;
        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            newArr[i] = arr1[i] + arr2[i];
        }
        return newArr;
    }


    /*
    -----TASK-3-----
    Requirement:
    Write a method removeDuplicateElements() that takes an ArrayList of String as an argument, and returns it back with removed duplicates

    Test data 1:
    [“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]

    Expected output 1:
    [“java”, “C#”, “ruby”, “JAVA”,  “C++”]
    */

    public static ArrayList<String> removeDuplicateElements(ArrayList<String> arr){
//        ArrayList<String> newArr = new ArrayList<>();
//        for (String string : arr) {
//            if (!newArr.contains(string)) newArr.add(string);
//        }
//        return newArr;
        LinkedHashSet<String> noDups = new LinkedHashSet<>(arr);
        return new ArrayList<>(noDups);
    }


    /*
    -----TASK-4-----
    Requirement:
    Write a method removeExtraSpaces() that takes a String as an argument, and returns a String with removed extra spaces

    Test data 1:
    String str = “   I   am      learning     Java      ”;

    Expected output 1:
    I am learning Java
    */

    public static String removeExtraSpaces(String str){
        String[] words = str.trim().split(" ");
        StringBuilder newStr = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) newStr.append(word).append(" ");
        }
        return newStr.toString().trim();
    }


    /*
    -----TASK-5-----
    Requirement:
    -Create a method called countPrimes()
    -This method will take an int array argument, and it will return how many elements in the array are prime numbers

    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    NOTE: Smallest prime number is 2

    Test Data 1: [-10, -3, 0, 1]
    Expected Result 1: 0
     */

    public static int countPrimes(int[] arr){
        int count = 0;
        for (int element : arr) {
            int tempCount = 0;
            for (int i = 1; i <= element; i++) {
                if (element % i == 0 && element != 1){
                    tempCount++;
                }
            }
            if (tempCount == 2) count++;
        }
        return count;
    }


    //TESTING OUR METHODS
    public static void main(String[] args) {
        System.out.println("Task-1");
        System.out.println(countWords("      Java is fun       "));

        System.out.println("Task-2");
        int[] arr1 = {3, 0, 0, 7, 5, 10};
        int[] arr2 = {6, 3, 2};
        System.out.println(Arrays.toString(add(arr1, arr2)));

        System.out.println("Task-3");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("java");
        stringArrayList.add("C#");
        stringArrayList.add("ruby");
        stringArrayList.add("JAVA");
        stringArrayList.add("ruby");
        stringArrayList.add("C#");
        stringArrayList.add("C++");
        stringArrayList.add("C#");
        System.out.println(removeDuplicateElements(stringArrayList));

        System.out.println("Task-4");
        System.out.println(removeExtraSpaces("   I   am      learning     Java      "));

        System.out.println("Task-5");
        System.out.println(countPrimes(new int[] {-10, -3, 0, 1, 5, 11}));
    }
}