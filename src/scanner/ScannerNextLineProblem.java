package scanner;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args){

        /*
        name      --> next()
        age       --> nextInt()
        myBrainOK --> nextBoolean()
        fav quote --> nextLine()
         */

//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("What's your name?");
//        String name = userInput.next();
//
//        System.out.println("What's your age?");
//        int age = userInput.nextInt();
//
//        System.out.println("Is your brain fried? (true/false)");
//        boolean myBrainOK = userInput.nextBoolean();
//
//        System.out.println("What's your address?");
//        userInput.nextLine();
//        String address = userInput.nextLine();
//
//        System.out.println("User name is = "+name+
//                "\nUser age is = "+age+
//                "\nIs your brain OK? "+myBrainOK+
//                "\nWhat's your address? "+address);
//
//        int number = 10;
//
//        System.out.println("The Number is = "+number);
//
//        number = 20;
//
//        System.out.println("New number is = "+number);



        Scanner userNumber = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int firstNumber = userNumber.nextInt();
        //System.out.println("User's first number is: " + firstNumber);

        System.out.println("Please enter your second number: ");
        int secondNumber = userNumber.nextInt();
        //System.out.println("User's second number is: " + secondNumber);

        System.out.println("Please enter your third number: ");
        int thirdNumber = userNumber.nextInt();
        //System.out.println("User's third number is: " + thirdNumber);

        System.out.println("The sum of your numbers are: "+ (firstNumber+secondNumber+thirdNumber));



    }
}
