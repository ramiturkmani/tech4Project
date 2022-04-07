package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _01_Practice_Counting_ArrayList_Elements {
    public static void main(String[] args) {

        System.out.println("\n----------- TASK-1 ----------\n");

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(12);
        nums.add(13);
        nums.add(8);
        nums.add(9);
        nums.add(15);

        System.out.println(nums);


        System.out.println("\n----------- TASK-2 ----------\n");

        int countOdds = 0;

        for (Integer num : nums) {
            if (num % 2 != 0) countOdds++;
        }

        System.out.println("Odds = " + countOdds);


        System.out.println("\n----------- TASK-3 ----------\n");

        List<String> colors = new ArrayList<>();
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");

        System.out.println(colors);


        System.out.println("\n----------- TASK-4 for each loop ----------\n");

        int countUpper = 0;

        for (String color : colors) {
            if (Character.isUpperCase(color.charAt(0))) countUpper++;
        }
        System.out.println(countUpper);

        System.out.println("\n----------- TASK-4 fori loop ----------\n");
        countUpper = 0;

        for (int i = 0; i < colors.size(); i++) {
            if(Character.isUpperCase(colors.get(i).charAt(0))) countUpper ++;
        }
        System.out.println(countUpper);

        /*
        Practice
        Lowercases
        nulls
        empties
        That has length of 4 at least
        That has length of even or odd
        That has a or A
         */


    }
}
