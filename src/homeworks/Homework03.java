package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /*
        Task-1
        1) Print out question
        2) Create variable
        3) Repeat step 1 and 2
        4) Print out user entry as well as the sum of both numbers
        */

        System.out.println("Please enter a number of your choice.");
        int num1 = input.nextInt();

        System.out.println("Please enter another number of your choice.");
        int num2 = input.nextInt();

        System.out.println("The number 1 entered by user is = "+num1);
        System.out.println("The number 2 entered by user is = "+num2);
        System.out.println("The sum of number 1 and 2 entered by user is = "+(num1+num2));

        System.out.println("---");

        /*
        Task-2
        1) Print out question
        2) Create input variable
        3) Repeat step 1 and 2
        4) Print out user entry as well as the division of both numbers
         */

        System.out.println("Please enter a floating number.");
        double num3 = input.nextDouble();

        System.out.println("Please enter another floating number.");
        double num4 = input.nextDouble();

        System.out.println("The number 1 entered by user is = "+num3);
        System.out.println("The number 2 entered by user is = "+num4);
        System.out.println("The division of number 1 and 2 entered by user is = "+num3/num4);

        System.out.println("---");

        /*
        Task-3
        1) Create equations
        2) Print out answers
         */

        System.out.println("1.\t\t"+(-10+7*5));
        System.out.println("2.\t\t"+((72+24)%24));
        System.out.println("3.\t\t"+(10+-3*9/9));
        System.out.println("4.\t\t"+(5+18/3*3-(6%3)));

        System.out.println("---");

        /*
        Task-4
        1) Print out question
        2) Create input variable
        3) Repeat step 1 and 2
        4) Create equations
        5) Print answers
         */

        System.out.println("Please enter a floating number");
        double num5 = input.nextDouble();

        System.out.println("Please enter another floating number");
        double num6 = input.nextDouble();

        System.out.println("Number 1 = "+num5);
        System.out.println("Number 2 = "+num6);
        System.out.println("The sum of the given numbers is = "+(num5+num6));
        System.out.println("The product of the given numbers is = "+(num5*num6));
        System.out.println("The subtraction of the given numbers is = "+(num5-num6));
        System.out.println("The division of the given number is = "+(num5/num6));
        System.out.println("The remainder of the given number is = "+(num5%num6));

        System.out.println("---");

        /*
        Task-5
        1) Create the variables
        2) Find the area by multiplying
        3) Find the perimeter with the formula (2*(a+b))
        4) Print them out
         */

        float rectangleWidth = 7.5F;
        float rectangleHeight = 10.5F;

        System.out.println("The area of the rectangle = "+(rectangleWidth * rectangleHeight));
        System.out.println("The perimeter of the rectangle = "+(2*(rectangleWidth+rectangleHeight)));

        System.out.println("---");

        /*
        Task-6
        1) Create the variables
        2) Do the equation
        3) Print them out
         */

        double avgSalary = 90000;
        int yearsWorked = 3;

        System.out.println("A Software Engineer in Test can earn "+(avgSalary*yearsWorked)+" in "+yearsWorked+" years.");


    }
}
