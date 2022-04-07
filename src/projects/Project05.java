package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;
import utilities.StringHelper;

public class Project05 {
    public static void main(String[] args) {
        System.out.println("---------- Task-1 ----------\n");

        System.out.println("Please enter a string:");
        String str1 = ScannerHelper.getAStringFromUser();

        if(str1.length() >= 8){
            String str1First = str1.substring(0,4);
            String str1Middle = str1.substring(4,str1.length()-4);
            String str1Last = str1.substring(str1.length()-4);
            System.out.println(str1Last.concat(str1Middle).concat(str1First));
        }
        else System.out.println("This string does not have 8 characters");



        System.out.println("\n---------- Task-2 ----------\n");

        System.out.println("Please enter a sentence:");
        String str2 = ScannerHelper.getAStringFromUser();

        if(str2.trim().contains(" ")) {
            String str2First = str2.substring(0,str2.indexOf(32));
            String str2Middle = str2.substring(str2.indexOf(32),str2.lastIndexOf(32)+1);
            String str2Last = str2.substring(str2.lastIndexOf(32)+1);
            System.out.println(str2Last + str2Middle + str2First);
        }
        else System.out.println("This sentence does not have 2 or more words to swap");



        System.out.println("\n---------- Task-3 ----------\n");

        String str3 = "These books are so idiot";

        if(str3.contains("stupid") || str3.contains("idiot")) {
            System.out.println(str3.replace("stupid", "nice").replace("idiot","nice"));
        }
        else System.out.println(str3);



        System.out.println("\n---------- Task-4 ----------\n");

        String str4 = ScannerHelper.getANameFromUser();

        if(str4.length() > 2) {
            if (str4.length() % 2 == 0) System.out.println(StringHelper.getMiddle(str4));
            else if (str4.length() % 2 != 0) System.out.println(StringHelper.getMiddle(str4));
        }
        else System.out.println("Invalid input!!!");



        System.out.println("\n---------- Task-5 ----------\n");

        System.out.println("Please enter a country name:");
        String str5 = ScannerHelper.getAStringFromUser();

        if(str5.length() > 5){
            System.out.println(str5.replace(str5.substring(0, 2), "").replace(str5.substring(str5.length() - 2), ""));
        }
        else System.out.println("Invalid input!!!");



        System.out.println("\n---------- Task-6 ----------\n");

        String str6 = ScannerHelper.getAnAddressFromUser();

        System.out.println(str6.replace('a','*').replace('A','*')
                .replace('e','#').replace('E','#').replace('i','+')
                .replace('I','+').replace('u','$').replace('U','$')
                .replace('o','@').replace('O','@'));



        System.out.println("\n---------- Task-7 ----------\n");

        int t7_num1 = RandomNumberGenerator.getRandomNumber(0,25);
        int t7_num2 = RandomNumberGenerator.getRandomNumber(0,25);

        System.out.println("Random number 1 = " + t7_num1);
        System.out.println("Random number 2 = " + t7_num2 + "\n");

        for(int random = t7_num1; random <= t7_num2; random++){
            if(random%5 != 0) System.out.println(random);
        }

        for(int random = t7_num2; random <= t7_num1; random++){
            if(random%5 != 0) System.out.println(random);
        }


        System.out.println("\nEnd of the program!");
    }
}
