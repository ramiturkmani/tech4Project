package arrays;

import java.util.Arrays;

public class _03_Practice_int_Array {
    public static void main(String[] args) {

        System.out.println("---------- TASK-1 ----------\n");

        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};

        System.out.println("Array not sorted = " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Array sorted = " + Arrays.toString(numbers));



        System.out.println("\n---------- TASK-2 ----------\n");

        int countPositive = 0, countNegative = 0, countZero = 0;

        for (int number : numbers) {
            if(number > 0) countPositive++;
            else if(number < 0) countNegative++;
            else if(number == 0) countZero++;
        }
        System.out.println("Positive = " + countPositive);
        System.out.println("Negative = " + countNegative);
        System.out.println("Zero = " + countZero);



        System.out.println("\n---------- TASK-3 ----------\n");

        int countEven = 0, countOdd = 0;

        for (int number : numbers) {
            if(number % 2 == 0) countEven++;
            else countOdd++;
        }
        System.out.println("Evens = " + countEven);
        System.out.println("Odds = " + countOdd);


        /*
        EXTRA PRACTICE
        Numbers that are more than 7 -> 2
        Numbers that can be divided by 5 -> 4
        Numbers can be divided by 2 but not by 3 -> 3
        Check if it contains 10 -> true
        Check if it contains 8 -> false

        Please do this
        Count how many numbers are 2 digits
         */


    }
}
