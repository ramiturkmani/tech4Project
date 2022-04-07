package homeworks;

import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("---------- Task-1 ----------");
        System.out.println("Please enter two numbers.");

        int avg1 = input.nextInt();
        int avg2 = input.nextInt();

        System.out.println("The average of the given 2 numbers is: "+(avg1+avg2)/2);

        System.out.println("\n---------- Task-2 ----------");
        System.out.println("Please enter two numbers.");

        int prod1 = input.nextInt();
        int prod2 = input.nextInt();

        System.out.println("The product of the given 2 numbers is: "+(prod1*prod2));

        System.out.println("\n---------- Task-3 ----------");
        System.out.println("Please enter three numbers.");

        int sqr1 = input.nextInt();
        int sqr2 = input.nextInt();
        int sqr3 = input.nextInt();

        System.out.println("The "+sqr1+" multiplied with "+sqr1+" is = "+(sqr1*sqr1));
        System.out.println("The "+sqr2+" multiplied with "+sqr2+" is = "+(sqr2*sqr2));
        System.out.println("The "+sqr3+" multiplied with "+sqr3+" is = "+(sqr3*sqr3));

        System.out.println("\n---------- Task-4 ----------");
        System.out.println("Please enter two numbers with the first one being larger than the second one.");

        int remainder1 = input.nextInt();
        int remainder2 = input.nextInt();

        System.out.println("The remainder of "+remainder1+" % "+remainder2+" = "+(remainder1%remainder2));

        System.out.println("\n---------- Task-5 ----------");
        System.out.println("Please enter five numbers.");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        System.out.println("The average of the given 5 numbers is: "+(num1+num2+num3+num4+num5)/5);

        System.out.println("\n---------- Task-6 ----------");
        System.out.println("Please enter one number.");

        int multiply = input.nextInt();

        System.out.println(multiply+" * 1 = "+(multiply));
        System.out.println(multiply+" * 2 = "+(multiply*2));
        System.out.println(multiply+" * 3 = "+(multiply*3));
        System.out.println(multiply+" * 4 = "+(multiply*4));
        System.out.println(multiply+" * 5 = "+(multiply*5));
        System.out.println(multiply+" * 6 = "+(multiply*6));
        System.out.println(multiply+" * 7 = "+(multiply*7));
        System.out.println(multiply+" * 8 = "+(multiply*8));
        System.out.println(multiply+" * 9 = "+(multiply*9));
        System.out.println(multiply+" * 10 = "+(multiply*10));

        System.out.println("\n---------- Task-7 ----------");
        System.out.println("Please enter a number which will represent one side of a square.");

        int squareSide = input.nextInt();

        System.out.println("Perimeter of the square = "+(4*squareSide));
        System.out.println("Area of the square = "+(squareSide*squareSide));

    }
}
