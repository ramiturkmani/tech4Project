package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        int[] numbers = {10, -5, 0, 0, 3, 0, 7, 9};

        System.out.println("My array is = " + Arrays.toString(numbers));

        // Sort this array in ascending order

        Arrays.sort(numbers); // void method

        System.out.println("My array sorted = " + Arrays.toString(numbers));


        System.out.println("\n------- Sorting characters-------\n");
        char[] characters = {'A', 'b', 'z', 'H'};

        System.out.println("My characters array = " + Arrays.toString(characters));

        Arrays.sort(characters);

        System.out.println("My characters array sorted = " + Arrays.toString(characters));


        System.out.println("\n------- Sorting words-------\n");
        String[] names = {"Adam", "Alex", "tom", "ally", "Adele", "terry", "Josh"};

        System.out.println("My names array = " + Arrays.toString(names));

//        How to get names in order regardless of case (ally before Josh)
//        for (int i = 0; i < names.length; i++) {
//            names[i] = names[i].toUpperCase().charAt(0) + names[i].toLowerCase().substring(1);
//        }

        Arrays.sort(names);

        //Lexicographically
        System.out.println("My names array sorted = " + Arrays.toString(names));



    }
}
