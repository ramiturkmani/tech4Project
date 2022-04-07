package methods;

import utilities.MathHelper;

import java.util.Scanner;

public class FindIfNumberIsPosNegOrZero {
    public static void main(String[] args) {

        System.out.println("Please enter a number");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if(MathHelper.isPositive(num)) {
            System.out.println("The number is positive");
        }else if(MathHelper.isNegative(num)){
            System.out.println("The number is negative");
        }else System.out.println("The number is zero");

        System.out.println("End of the program!");


    }
}
