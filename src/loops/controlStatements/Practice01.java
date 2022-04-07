package loops.controlStatements;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        /*
        Write a Java program that ask user to enter 2 diff
        integers
        Print all the numbers between given 2 integers starting from
        biggest to smallest (given numbers are included)
        HOWEVER, do not print any number less than 10

        5 9 -> 9 8 7 6 5

        8 4 -> 8 7 6 5 4
         */

        /*
        1) Get 2 numbers from user
        2) Find the max of the 2 numbers as the starting point
        3) Find the min of the 2 numbers as the termination point
        4) Print out all numbers between the 2 numbers (inclusive) in descending order using fori loop
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

//        for (int i = Math.max(num1,num2); i >= Math.min(num1,num2); i--) {
//            if (i < 10) break;
//            System.out.println(i);
//        }

        String s = "";
        for (int i = Math.max(num1,num2); i >= Math.min(num1,num2); i--) {
           if (i < 10) break;
           s += i + " - ";
       }

        System.out.println(s.substring(0,s.length()-3));

    }
}
