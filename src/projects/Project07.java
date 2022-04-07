package projects;

import java.util.ArrayList;
import java.util.Arrays;

public class Project07 {

    // ---------- TASK-1 ----------
    public static void findGreatestAndSmallestWithSort(int[] array){
        Arrays.sort(array);
        System.out.println("Smallest = " + array[0]);
        System.out.println("Greatest = " + array[array.length-1]);
    }


    // ---------- TASK-2 ----------
    public static void findGreatestAndSmallest(int[] array){
        int min = array[0], max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }


    // ---------- TASK-3 ----------
    public static void findSecondGreatestAndSmallestWithSort(int[] array){
        Arrays.sort(array);
        int min = array[0], secondMin = array[1];
        int max = array[array.length-1], secondMax = array[array.length-2];

        for (int num : array){
            if(min != num) {
                secondMin = num;
                break;
            }
        }
        for (int num : array){
            if(max != num) {
                secondMax = num;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }


    // ---------- TASK-4 ----------
    public static void findSecondGreatestAndSmallest(int[] array){
        int min = Math.min(array[0],array[1]), secondMin = Math.max(array[0], array[1]);
        int max = Math.max(array[array.length-1],array[array.length-2]), secondMax = Math.min(array[array.length-1],array[array.length-2]);

        for (int num : array){
            if(min != num) {
                secondMin = num;
                break;
            }
        }
        for (int num : array){
            if(max != num) {
                secondMax = num;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }


    // ---------- TASK-5 ----------
    public static void findDuplicatedElementsInAnArray(String[] array){
        String duplicates = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i].equals(array[j]) && !duplicates.contains(array[i])) {
                    System.out.println(array[i]);
                    duplicates += array[i];
                }
            }
        }
    }


    // ---------- TASK-6 ----------
    public static void findMostRepeatedElementInAnArray(String[] array){
        String mostRepeatedElement = "";
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String tempElement = array[i];
            int tempCount = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (tempElement.equals(array[j])) tempCount++;
            }
            if (tempCount > count){
                mostRepeatedElement = tempElement;
                count = tempCount;
            }
        }
        System.out.println(mostRepeatedElement);
    }






    // Akin's Solution

    /*
    TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element
    and print it.

    Test data:
    ["pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"]

    Expected output:
    pen
     */

    public static void findMostRepeatedElementInAnArray2(String[] arr){
        String mostCountedWord = "";
        int mostCountedTimes = 0;

        ArrayList<String> countedElements = new ArrayList<>();

        for (int i = 0; i <= arr.length-1; i++) {
            String word = arr[i];
            int countOfWord = 0;

            if(!countedElements.contains(word)){
                for (String w : arr) {
                    if(word.equals(w)) countOfWord++;
                }

                if(countOfWord > mostCountedTimes){
                    mostCountedWord = word;
                    mostCountedTimes = countOfWord;
                }
                countedElements.add(word);
            }
        }

        System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
    }



    public static void main(String[] args) {
        String[] words = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        String[] words2 = {"a", "a", "b", "c"}; // a counted 2 times in this array
        String[] words3 = {"abc", "ABC", "ab", "ab", "abc", "ab"}; // ab counted 3 times in this array


        findMostRepeatedElementInAnArray2(words);
        findMostRepeatedElementInAnArray2(words2);
        findMostRepeatedElementInAnArray2(words3);
        findMostRepeatedElementInAnArray2(new String[]{"x", "y", "z", "y"});


    }
}
