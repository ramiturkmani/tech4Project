package scanner;

import sun.lwawt.macosx.CInputMethod;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args){

        /*
        Pseudo Code:
        1) Create an object of Scanner (import)
        2) Print out instructions about what we need
        3) Use next() method for reading
        4) Print out the first and last name in one statement
        */

        Scanner fullName = new Scanner(System.in);

        System.out.println("What is your first name?");

        String firstName = fullName.next();

        System.out.println("What is your last name?");

        String lastName = fullName.next();

        System.out.println("User's Full Name = "+firstName+" "+lastName);

        /*
        Write a Java program that reads the full address from user and print the address
        1) Create an object Scanner
        2) Print instructions for user to input address
        3) Use nextLine() method for reading
        4) Print out the user's address
         */

        //Scanner input = new Scanner(System.in);

        System.out.println("What is your address?");

        fullName.nextLine();

        String userAddress = fullName.nextLine();

        System.out.println("User's Address = "+userAddress);



    }
}
