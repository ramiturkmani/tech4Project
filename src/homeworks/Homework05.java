package homeworks;

import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("---------- Task-1 ----------");
        System.out.println("Please enter 3 numbers.");

        int maxMin1 = input.nextInt(), maxMin2 = input.nextInt(), maxMin3 = input.nextInt();

        System.out.println("Max value = "+Math.max(Math.max(maxMin1,maxMin2),maxMin3)+
                "\nMin value = "+Math.min(Math.min(maxMin1,maxMin2),maxMin3));

        System.out.println("\n---------- Task-2 ----------");
        System.out.println("Please enter 5 numbers.");

        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt(),
                num4 = input.nextInt(), num5 = input.nextInt();

        int maxOf1And2 = Math.max(num1,num2);
        int maxOf3And4 = Math.max(num3,num4);

        int minOf1And2 = Math.min(num1,num2);
        int minOf3And4 = Math.min(num3,num4);

        System.out.println("Max value = "+Math.max(Math.max(maxOf1And2,maxOf3And4), num5)+
                "\nMin value = "+Math.min(Math.min(minOf1And2,minOf3And4),num5));

        System.out.println("\n---------- Task-3 ----------");
        System.out.println("Please enter 2 numbers.");

        int abs1 = input.nextInt(), abs2 = input.nextInt();

        System.out.println("The difference between numbers is = "+Math.abs(abs1-abs2));

        System.out.println("\n---------- Task-4 ----------");

        int random1 = (int) (Math.random()*51)+50, random2 = (int) (Math.random()*51)+50,
        random3 = (int) (Math.random()*51)+50;

        System.out.println("Number 1 = "+random1+"\nNumebr 2 = "+random2+"\nNumber 3 = "+random3+
                "\nThe sum of numbers is = "+(random1+random2+random3));

        System.out.println("\n---------- Task-5 ----------");

        double alexBefore = 125, mikeBefore = 220, alexToMike = 25.5;

        System.out.println("Alex's money: $"+(alexBefore-alexToMike)+"\nMike's money: $"+(mikeBefore+alexToMike));

        System.out.println("\n---------- Task-6 ----------");

        double dailySaving = 15.6, totalSaving = 390;

        System.out.println((int)(totalSaving/dailySaving));

    }
}
