package loops.controlStatements;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        /*
        1) Get 2 numbers from user
        2) Find the min of the 2 numbers as the starting point
        3) Find the max of the 2 numbers as the termination point
        4) Print out all numbers (except 5) between the 2 numbers (inclusive) in ascending order using fori loop
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers between 0 and 10");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for (int i = Math.min(num1,num2); i <= Math.max(num1,num2); i++) {
            if(i == 5) continue;
            System.out.println(i);
        }




    }
}
