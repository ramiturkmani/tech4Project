package homeworks;

import utilities.ScannerHelper;

public class Homework09 {
    public static void main(String[] args) {
        System.out.println("---------- Task-1 ----------\n");

        String name = ScannerHelper.getANameFromUser();

        System.out.println("The length of the name = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last character in the name is = " + name.charAt(name.length()-1));
        System.out.println("The first 3 characters in the name is = " + name.substring(0,3));
        System.out.println("The last 3 characters in the name is = " + name.substring(name.length()-3));

        if (name.toLowerCase().charAt(0) == 97) System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");



        System.out.println("\n---------- Task-2 ----------\n");

        String address = ScannerHelper.getAnAddressFromUser();

        if (address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plaines")) System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");



        System.out.println("\n---------- Task-3 ----------\n");

        System.out.print("Please enter at least 4 of your favorite colors in the same line:");
        String colors = ScannerHelper.getAStringFromUser();

        if(colors.toLowerCase().contains("red") && colors.toLowerCase().contains("green")){
            System.out.println("Green and red are in the list");
        }
        else if(colors.toLowerCase().contains("green")) System.out.println("Green is in the list");
        else if(colors.toLowerCase().contains("red")) System.out.println("Red is in the list");
        else System.out.println("Green and red are not in the list");




        System.out.println("\n---------- Task-4 ----------\n");

        String str = " Java is FUN ";

        System.out.println("The first word in the str is = " + str.trim().toLowerCase().substring(0,4));
        System.out.println("The second word in the str is = " + str.trim().toLowerCase().substring(5,7));
        System.out.println("The last word in the str is = " + str.trim().toLowerCase().substring(str.length()-5));

        System.out.println("\n\nEnd of the program!");
    }
}
