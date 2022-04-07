package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {

        System.out.println("---------- Task-1 ----------\n");

        String t1_s = "";

        for (int i = 1; i < 101 ; i++) {
            if(i % 7 == 0) t1_s += i + "-";
        }
        if (!t1_s.isEmpty()) System.out.println(t1_s.substring(0,t1_s.length()-1));
        else System.out.println(t1_s);



        System.out.println("\n---------- Task-2 ----------\n");

        String t2_s = "";

        for (int i = 1; i < 51; i++) {
            if(i % 6 == 0) t2_s += i + "-";
        }
        if (!t2_s.isEmpty()) System.out.println(t2_s.substring(0,t2_s.length()-1));
        else System.out.println(t2_s);



        System.out.println("\n---------- Task-3 ----------\n");

        String t3_s = "";

        for (int i = 100; i > 49 ; i--) {
            if(i % 5 == 0) t3_s += i + "-";
        }
        if (!t3_s.isEmpty()) System.out.println(t3_s.substring(0,t3_s.length()-1));
        else System.out.println(t3_s);



        System.out.println("\n---------- Task-4 ----------\n");

        for (int i = 0; i < 8; i++) {
            System.out.println("The square of " + i + " is = " + (i*i));
        }



        System.out.println("\n---------- Task-5 ----------\n");

        int t5_container = 0;
        for (int i = 1; i < 11; i++) {
            t5_container += i;
        }
        System.out.println(t5_container);



        System.out.println("\n---------- Task-6 ----------\n");

        System.out.println("Please enter a positive number:");
        int t6_num = ScannerHelper.getNumberFromUser();

        int t6_container = 1;

        for (int i = 1; i <= t6_num; i++) {
            t6_container *= i;
        }
        System.out.println(t6_container);



        System.out.println("\n---------- Task-7 ----------\n");

        System.out.println("Please enter your full name:");
        String t7_name = ScannerHelper.getAStringFromUser();

        int t7_vowelCount = 0;

        for (int i = 0; i < t7_name.length(); i++) {
            if (t7_name.toLowerCase().charAt(i) == 'a' || t7_name.toLowerCase().charAt(i) == 'e' ||
                    t7_name.toLowerCase().charAt(i) == 'i' || t7_name.toLowerCase().charAt(i) == 'o' ||
                    t7_name.toLowerCase().charAt(i) == 'u') {
                t7_vowelCount ++;
            }
        }
        System.out.println("There are " + t7_vowelCount + " vowel letters in this full name");




        System.out.println("\n---------- Task-8 ----------\n");

        Scanner input = new Scanner(System.in);

        int t8_container = 0;
        int t8_num;

        do {
            System.out.println("Please enter a number");
            t8_num = input.nextInt();
            t8_container += t8_num;
        }
        while (t8_container < 100);

        if (t8_num > 100) System.out.println("The number is already more than 100");
        else System.out.println("Sum of the entered numbers is at least 100");



        System.out.println("\n---------- Task-9 ----------\n");

        System.out.println("Please enter a number");
        int t9_limit = input.nextInt();
        int t9_num1 = 0;
        int t9_num2 = 1;
        int t9_total;

        String s = "";
        int i = 0;
        while (i < t9_limit) {
            s += t9_num1 + "-";
            t9_total = t9_num1 + t9_num2;
            t9_num1 = t9_num2;
            t9_num2 = t9_total;
            i++;
        }
        System.out.println(s.substring(0, s.length() - 1));



        System.out.println("\n---------- Task-10 ----------\n");

        input.nextLine();
        String t10_name;

        do {
            System.out.println("Please enter a name");
            t10_name = input.nextLine();
        }
        while (t10_name.trim().toLowerCase().indexOf("j") != 0);

        System.out.println("End of the program");
    }
}