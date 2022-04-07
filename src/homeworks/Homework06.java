package homeworks;

import java.util.Scanner;
public class Homework06 {
    public static void main(String[] args){

        System.out.println("---------- Task-1 ----------");

        String s1 = "5", s2 = "10";

        int str1 = Integer.parseInt(s1), str2 = Integer.parseInt(s2);

        System.out.println("-Sum of "+str1+" and "+str2+" is = "+(str1+str2)+
                "\n-Product of "+str1+" and "+str2+" is = "+(str1*str2)+
                "\n-Division of 5 and 10 is = "+(str1/str2)+
                "\n-Subtraction of 5 and 10 is = "+(str1-str2)+
                "\n-Remainder of 5 and 10 is = "+(str1%str2));

        /*
        I used two difference methods of writing out the sentence in task-1 because I'm
        not sure which one is better to use. I assume that writing "5 and 10" is sufficient
        since the numbers are set and they are not based on user input.
        */

        System.out.println("\n---------- Task-2 ----------");

        String s3 = "200", s4 = "-50";

        int str3 = Integer.parseInt(s3), str4 = Integer.parseInt(s4);

        System.out.println("The greatest value is = "+(Math.max(str3,str4))+
                "\nThe smallest value is = "+(Math.min(str3,str4))+
                "\nThe average is = "+(str3+str4)/2+
                "\nThe absolute difference is = "+(Math.abs(str3-str4)));

        System.out.println("\n---------- Task-3 ----------");

        //3 quarters, 1 dime, 2 nickels, and 1 penny = $0.96 saved daily

        double dailySaving = 0.96;

        System.out.println((int)(24/dailySaving)+" days\n"+
                (int)(168/dailySaving)+" days"+
                "\n$"+(150*dailySaving));      // 5 months -> 30*5=150

        System.out.println("\n---------- Task-4  ----------");

        double jessieSaving = 62.5;

        System.out.println((int) (1250/jessieSaving));

        System.out.println("\n---------- Task-5 ----------");

        double carPrice = 14265, option1 = 475.50, option2 = 951;

        System.out.println("Option 1 will take "+(int)(carPrice/option1)+" months"+
                "\nOption 2 will take "+(int)(carPrice/option2)+" months");

        System.out.println("\n---------- Task-6 ----------");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 2 numbers");

        int number1 = input.nextInt(), number2 = input.nextInt();

        System.out.println("\n"+(double)number1/number2);

    }
}
