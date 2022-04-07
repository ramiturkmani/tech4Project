package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Task-1

        System.out.println("Please enter your first name.");
        String firstName = input.next();

        System.out.println("Please enter your last name.");
        String lastName = input.next();

        System.out.println("Please enter your age.");
        int userAge = input.nextInt();

        System.out.println("Please enter your email address.");
        String emailAddress = input.next();

        input.nextLine();

        System.out.println("PLease enter your phone number.");
        String phoneNumber = input.nextLine();

        System.out.println("Please enter your address");
        String userAddress = input.nextLine();

        System.out.println();

        System.out.println("\tUser who joined this program is "+firstName+" "+lastName+". "+firstName+"'s age is "+
                userAge+". "+firstName+"'s email\naddress is "+emailAddress+", phone number "+
                phoneNumber+ ", and address is\n"+userAddress+".");

        System.out.println();

        //Task-2

        System.out.println("Please enter your favorite book.");
        String favBook = input.nextLine();

        System.out.println("Please enter your favorite color.");
        String favColor = input.next();

        System.out.println("Please enter your favorite number.");
        int favNumber = input.nextInt();

        System.out.println();

        System.out.println("User's favorite book is: "+favBook+
                "\nUser's favorite color is: "+favColor+
                "\nUser's favorite number is: "+favNumber);

    }
}
