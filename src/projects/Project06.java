package projects;

import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---------- TASK-1 ----------\n");

        System.out.println("Please enter a sentence:");
        String t1_Sentence = input.nextLine().trim();

        if (!t1_Sentence.contains(" ")) System.out.println("This sentence does not have multiple words.");
        else {
            int wordCount = 1;

            for (int i = 0; i < t1_Sentence.length(); i++) {
                if (t1_Sentence.charAt(i) == ' ') wordCount++;
            }
            System.out.println("This sentence has " + wordCount + " words.");
        }



        System.out.println("\n---------- TASK-2 ----------\n");

        System.out.println("Please enter a word:");
        String t2_Word = input.nextLine().trim();

        if (t2_Word.length() < 1) System.out.println("This word does not have 1 or more characters.");
        else {
            String palindrome1 = "";
            String palindrome2 = "";

            for (int i = 0; i < t2_Word.length(); i++) {
                palindrome1 += t2_Word.charAt(i);
            }
            for (int i = t2_Word.length()-1; i >= 0 ; i--) {
                palindrome2 += t2_Word.charAt(i);
            }
            if (palindrome1.equals(palindrome2)) System.out.println("This word is palindrome");
            else System.out.println("This word is not palindrome");
        }



        System.out.println("\n---------- TASK-3 ----------\n");

        System.out.println("Please enter a sentence:");
        String t3_Sentence = input.nextLine().trim().toLowerCase();

        if (t3_Sentence.length() < 1) System.out.println("This sentence does not have any characters.");
        else{
            int aCount = 0;
            for (int i = 0; i < t3_Sentence.length(); i++) {
                if (t3_Sentence.charAt(i) == 'a') aCount++;
            }
            System.out.println("This sentence has " + aCount + " a or A letters.");
        }



        System.out.println("\n---------- TASK-4 ----------\n");

        System.out.println("Please enter a positive number:");
        int t4_Num = input.nextInt();

        for (int i = 1; i <= t4_Num; i++) {
            if (i % 6 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }

        System.out.println("End of the program!");
    }
}