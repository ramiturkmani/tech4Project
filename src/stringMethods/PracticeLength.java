package stringMethods;

import java.util.Scanner;

public class PracticeLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the name of your favorite book");

        String bookName = scan.nextLine();

        System.out.println("Please enter your favorite quote from that book");

        String bookQuote = scan.nextLine();

        System.out.println("The length of \"" + bookName + "\" is = " + bookName.length());

        System.out.println("The length of \"" + bookQuote + "\" is = " + bookQuote.length());

    }
}
