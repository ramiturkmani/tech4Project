package ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOf2Numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");

        int num1 = input.nextInt(), num2 = input.nextInt();

        System.out.println("num1 = "+num1+"\nnum2 = "+num2);

//        if(num1<num2){
//            System.out.println(num1);
//        }else {
//            System.out.println(num2);
//        }
//
//        System.out.println("End of the program!");

        // TURNERY Operator Method
        int smallestNumber = num1 < num2 ? num1 : num2;

        System.out.println(smallestNumber);

    }
}
