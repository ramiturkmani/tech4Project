package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("---------- Task-1 ----------");

        /*
        Pseudo-code:
        1) Ask user question
        2) Create variables
        3) Perform equation and print results
         */

        System.out.println("Please enter 3 numbers: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("The product of the numbers entered is = "+(num1*num2*num3));
        System.out.println();

        System.out.println("---------- Task-2 ----------");

        /*
        Pseudo-code:
        1) Ask user questions
        2) Create variables
        3) Perform equation and print results
         */

        System.out.println("What is your first name?");
        String firstName = input.next();

        System.out.println("What is your last name?");
        String lastName = input.next();

        System.out.println("What is your year of birth?");
        int birthYear = input.nextInt();

        System.out.println(firstName+" "+lastName+"'s age is = "+(2022-birthYear)+".");
        System.out.println();

        System.out.println("---------- Task-3 ----------");

        /*
        Pseudo-code:
        1) Ask user questions
        2) Create variables
        3) Convert kg to lbs and print results
         */

        input.nextLine();

        System.out.println("What is your full name?");
        String fullName = input.nextLine();

        System.out.println("What is your weight in kg?");
        double kgWeight = input.nextDouble();

        System.out.println(fullName+"'s weight is = "+(kgWeight*2.205)+" lbs.");
        System.out.println();

        System.out.println("---------- Task-4 ----------");

        /*
        Pseudo-code:
        1) Ask users questions
        2) Create variables
        3) Perform all equations and print results
         */

        input.nextLine();

        System.out.println("Student 1:\nWhat is your full name?");
        String firstFullName = input.nextLine();
        System.out.println("What is your age?");
        int firstAge = input.nextInt();

        input.nextLine();
        System.out.println("Student 2:\nWhat is your full name?");
        String secondFullName = input.nextLine();
        System.out.println("What is your age?");
        int secondAge = input.nextInt();

        input.nextLine();
        System.out.println("Student 3:\nWhat is your full name?");
        String thirdFullName = input.nextLine();
        System.out.println("What is your age?");
        int thirdAge = input.nextInt();

        System.out.println(firstFullName+"'s age is "+firstAge+".\n"+
                secondFullName+"'s age is "+secondAge+".\n"+
                thirdFullName+"'s age is "+thirdAge+".");

        System.out.println("The average age is "+(firstAge+secondAge+thirdAge)/3+".");

        int eldestAge1And2 = Math.max(firstAge,secondAge);
        System.out.println("The eldest age is "+Math.max(eldestAge1And2,thirdAge)+".");

        int youngestAge1And2 = Math.min(firstAge,secondAge);
        System.out.println("The youngest age is "+Math.min(youngestAge1And2,thirdAge)+".");

    }
}
