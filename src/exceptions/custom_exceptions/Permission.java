package exceptions.custom_exceptions;

import java.util.Scanner;

public class Permission {
    public static void checkAge(int age){
        if (age > 16) System.out.println("It is allowed to have driver license");
        else throw new RuntimeException("Age of " + age + " is not allowed to have driver license");
    }

    public static void checkIn(int day){
        if (day > 1 && day < 7) System.out.println("Check in is from 10AM to 5PM");
        else if (day == 1 || day == 7) System.out.println("Check in is from 10AM to 3PM");
        else throw new RuntimeException("The input does not represent a day!!!");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user! Please enter your age?");
        int age = scan.nextInt();
        try{
            checkAge(age);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Your age is = " + age);
        }
        System.out.println("End of the program!");

        System.out.println("\n\n--------------------------------------------------");
        checkIn(3);

        System.out.println("End of the program!");
    }
}
