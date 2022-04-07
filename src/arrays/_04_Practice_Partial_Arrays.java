package arrays;

public class _04_Practice_Partial_Arrays {
    public static void main(String[] args) {
        /*
        Create an array to store below numbers
        10, -3, -7, 0, 0, 7, 22
        Print all elements one by one in separate lines using FOR EACH LOOP
        RESULT:
        10
        -3
        -7
        0
        0
        7
        22
         */

        System.out.println("---------- TASK-1 ----------\n");
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        for (int number : numbers) {
            System.out.println(number);
        }

        /*
        TASK-2
        Find the sum of all the elements

        RESULT:
        29
         */

        System.out.println("\n---------- TASK-2 ----------\n");

        int sum1 = 0;
        for (int number : numbers) {
            sum1 += number;
        }
        System.out.println(sum1);

        /*
        TASK-3
        Find the sum of first 3 elements in the array

        RESULT:
        0

        numbers[0]
        numbers[1]
        numbers[2]
        // 10, -3, -7, 0, 0, 7, 22
         */

        System.out.println("\n---------- TASK-3 ----------\n");

        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum2 += numbers[i];
        }
        System.out.println(sum2);

        /*
        TASK-4
        Find the sum of last 5 elements in the array
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        22
         */

        System.out.println("\n---------- TASK-4 ----------\n");

        int sum3 = 0;
        for (int i = numbers.length-5; i < numbers.length; i++) {
            sum3 += numbers[i];
        }
        System.out.println(sum3);

        /*
        TASK-5
        Find the product of last 4 elements in the array but exclude zero if there are any
        // 10, -3, -7, 0, 0, 7, 22

        RESULT:
        156
         */

        System.out.println("\n---------- TASK-5 ----------\n");



        /*
        TASK-6
        Check your collection and print true if one of the element is 0
        Print false if none of the elements is zero

        RESULT:
        true
         */

        System.out.println("\n---------- TASK-6 ----------\n");

        boolean hasZero = false;
        for (int number : numbers) {
            if(number == 0) {
                hasZero = true;
                break;
            }
        }
        System.out.println(hasZero);

    }
}
