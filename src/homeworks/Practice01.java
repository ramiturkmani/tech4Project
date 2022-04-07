package homeworks;

import utilities.ScannerHelper;

import java.util.Locale;

public class Practice01 {
    public static void main(String[] args) {
        System.out.println("---------- Task-1 ----------\n");
        /*
        Assume that you are given a String as below;
        String str = ”SDLC is step by step procedure to create an application”;
        Write a program to find length of given String and the indexes of “SDLC” and “application” words
         */

        String str = "SDLC is step by step procedure to create an application";

        System.out.println("The length of the string is = " + str.length());
        System.out.println("The index of \"SDLC\" is = " + str.indexOf("SDLC"));
        System.out.println("The index of \"application\" is = " + str.indexOf("application"));



        System.out.println("\n---------- Task-2 ----------\n");
        /*
        Assume that you are given a String as below;
        String str2 = “  I know how to code with Python  ”;
        Write a program to manipulate given String and convert it to be:
        “I KNOW HOW TO CODE WITH JAVA”
        */

        String str2 = "  I know how to code with Python  ";

        System.out.println(str2.trim().toUpperCase().replace("PYTHON","JAVA"));



        System.out.println("\n---------- Task-3 ----------\n");
        /*
        Assume that you are given a String as below;
        String str = “    SDLC has planning, design, development, testing, deployment and maintenance phases   ”;
        1.Find the first character of given String which is not white space
        2.Find the last character of given String which is not white space
        */

        String str3 = "    SDLC has planning, design, development, testing, deployment and maintenance phases   ";

        System.out.println(str3.trim().charAt(0));
        System.out.println(str3.trim().charAt(str3.trim().length()-1));



        System.out.println("\n---------- Task-4 ----------\n");
        /*
        Assume you are given 3 Strings as below;
        String s1 = “  TECH ”;
        String s2 = “ glo  ”;
        String s3 = “ BAL       “;
        Write a program that manipulates these 3 Strings and stores them in a new String s4 and s4 will get value of “TechGlobal”
        Note: The length of s4 will be 10 at the end!!!
         */

        String s1 = "  TECH ";
        String s2 = " glo  ";
        String s3 = " BAL       ";
        String s4 = s1.trim().concat(s2.trim()).concat(s3.trim());

        System.out.println(s4.toLowerCase().replace("t","T").replace("g","G"));



        System.out.println("\n---------- Task-5 ----------\n");
        /*
        Write a program that asks user to enter their favorite color.
        Then, print the first and last characters of the color
        Also, print the first and last 3 characters of the color
        Test data:
        green
        Expected output:
        1st character is = g
        2nd character is = n
        First 3 characters are = gre
        Last 3 characters are = een
         */
        System.out.println("Please enter your favorite color:");
        String color = ScannerHelper.getAStringFromUser();

        System.out.println("1st character is = " + color.charAt(0));
        System.out.println("Last character is = " + color.charAt(color.length()-1));
        System.out.println("First 3 characters are = " + color.substring(0,3));
        System.out.println("Last 3 characters are = " + color.substring(color.length()-3));



        System.out.println("\n---------- Task-6 ----------\n");
        /*
        Write a program that asks user to enter a full sentence
        Then, convert all sentence to lower case and print the first and last words in the given sentence
        Test data:
        JavA is an object-oriented programming LanguAGE
        Expected output:
        1st word is = java
        2nd word is = language
         */

        System.out.println("Please enter a full sentence:");
        String s6 = ScannerHelper.getAStringFromUser().toLowerCase();

        System.out.println("1st word is = " + s6.trim().substring(0 , s6.indexOf(' ')));
        System.out.println("Last word is = " + s6.trim().substring(s6.lastIndexOf(' ')+1));



        System.out.println("\n---------- Task-7 ----------\n");

        System.out.println("Please enter a full sentence:");
        String s7 = ScannerHelper.getAStringFromUser().trim();

        if (s7.contains("$")){
            System.out.println("The sentence contains $ character\n" + "$ character's index is = " + s7.indexOf('$'));
        }
        else System.out.println("The sentence does not contain $ character");


    }

}
