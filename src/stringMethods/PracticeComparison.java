package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeComparison {
    public static void main(String[] args) {

        /*
        Write a Java program that asks user to enter 2 strings
        And store answers of user in different String variables
        Finally, check if given 2 Strings are equal or not and print messages given below

        Test data 1:
        Java
        java

        Expected output 1:
        These strings are not equal

        Test data 2:
        Hello
        Hello

        Expected output 2:
        These strings are equal
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name");

        String str1 = scan.nextLine();

        System.out.println("Please enter your name again");

        String str2 = scan.nextLine();

        if (str1.equals(str2)) System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");

        //2nd way to do it

        String str3 = ScannerHelper.getAStringFromUser();
        String str4 = ScannerHelper.getAStringFromUser();

        System.out.println(str3.equals(str4) ? "These string are equal" : "These string are not equal");
        //OR
        System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ? "These string are equal" : "These string are not equal");
    }
}
