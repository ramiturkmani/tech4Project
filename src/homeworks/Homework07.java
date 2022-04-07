package homeworks;

import java.util.Scanner;
public class Homework07 {
    public static void main(String[] args){

        System.out.println("---------- Task-1 ----------");

        int num1 = (int)(Math.random()*11);
        int num2 = (int)(Math.random()*11);
        int num3 = (int)(Math.random()*11);
        int num4 = (int)(Math.random()*11);
        int absDifference = 5;
        /*
        I assigned the 5 as absDifference because I remember when we went over task 6,
        you said that this time it is set at 5 but now that I assigned it as an int, it can be easily changed if we need to in the future.
         */

        System.out.println("Number 1 = "+num1+"\nNumber 2 = "+num2+"\nNumber 3 = "+num3+
                "\nNumber 4 = "+num4+
                "\nAbsolute difference of "+num1+" with "+absDifference+" is = "+Math.abs(num1-absDifference)+
                "\nAbsolute difference of "+num2+" with "+absDifference+" is = "+Math.abs(num2-absDifference)+
                "\nAbsolute difference of "+num3+" with "+absDifference+" is = "+Math.abs(num3-absDifference)+
                "\nAbsolute difference of "+num4+" with "+absDifference+" is = "+Math.abs(num4-absDifference)+
                "\nGreatest number is = "+Math.max(Math.max(num1,num2),Math.max(num3,num4))+
                "\nSmaller number is = "+Math.min(Math.min(num1,num2),Math.min(num3,num4)));


        System.out.println("\n---------- Task-2 ----------");

        int rand1 = (int) (Math.random()*101)-50, rand2 = (int) (Math.random()*101)-50,
                rand3 = (int) (Math.random()*101)-50, rand4 = (int) (Math.random()*101)-50,
                rand5 = (int) (Math.random()*101)-50, rand6 = (int) (Math.random()*101)-50,
                rand7 = (int) (Math.random()*101)-50, rand8 = (int) (Math.random()*101)-50;

        int randMax = Math.max(Math.max(Math.max(rand1,rand2),Math.max(rand3,rand4)),
                Math.max(Math.max(rand5,rand6),Math.max(rand7,rand8)));

        int randMin = Math.min(Math.min(Math.min(rand1,rand2),Math.min(rand3,rand4)),
                Math.min(Math.min(rand5,rand6),Math.min(rand7,rand8)));

        System.out.println("Number 1 = "+rand1+"\nNumber 2 = "+rand2+"\nNumber 3 = "+rand3+"\nNumber 4 = "+rand4+
                "\nNumber 5 = "+rand5+"\nNumber 6 = "+rand6+"\nNumber 7 = "+rand7+"\nNumber 8 = "+rand8+
                "\nGreatest number is = "+randMax+"\nSmaller number is = "+randMin+"\nAverage of 8 numbers is = "+
                ((rand1+rand2+rand3+rand4+rand5+rand6+rand7+rand8)/8)+
                "\nAbsolute difference between smallest and greatest is = "+Math.abs(randMax-randMin));

//        if(rand3>0) System.out.println("3rd number is positive = true");
//        else System.out.println("3rd number is positive = false");

        System.out.println("3rd number is positive = " + (rand3>0));

//        if(rand5<0) System.out.println("5th number is negative = true");
//        else System.out.println("5th number is negative = false");

        System.out.println("5th number is negative = " + (rand5<0));

//        if(rand1==0 || rand2==0 || rand3 ==0 || rand4==0 || rand5==0 || rand6==0 || rand7==0 || rand8==0)
//            System.out.println("There is at least one zero among those numbers is = " + true);
//        else System.out.println("There is at least one zero among those numbers is = " + false);

        System.out.println("There is at least one zero among those numbers is = " +
                (rand1==0 || rand2==0 || rand3 ==0 || rand4==0 || rand5==0 || rand6==0 || rand7==0 || rand8==0));


        System.out.println("\n---------- Task-3 ----------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 7 numbers between 0 and 50 (0 and 50 are also included).");

        int input1 = scan.nextInt(), input2 = scan.nextInt(),
                input3 = scan.nextInt(), input4 = scan.nextInt(),
                input5 = scan.nextInt(), input6 = scan.nextInt(),
                input7 = scan.nextInt();

        int inputMax = Math.max(Math.max((Math.max(input1,input2)),(Math.max(input3,input4))),
                Math.max(Math.max(input5,input6),input7));

        int inputMin = Math.min(Math.min((Math.min(input1,input2)),(Math.min(input3,input4))),
                Math.min(Math.min(input5,input6),input7));

        System.out.println("Number 1 = "+input1+"\nNumber 2 = "+input2+"\nNumber 3 = "+input3+"\nNumber 4 = "+input4+
                "\nNumber 5 = "+input5+"\nNumber 6 = "+input6+"\nNumber 7 = "+input7+"\nGreatest number is = "+inputMax+
                "\nSmallest number is = "+inputMin+"\nAverage of 7 numbers is = "+(input1+input2+input3+input4+input5+
                input6+input7)/7);

        if(input1 >= 10) System.out.println("First number is greater than or equal to 10 = true");
        else System.out.println("First number is greater than or equal to 10 = false");

        if(input7 <= 40) System.out.println("Last number is less than or equal to 40 = true");
        else System.out.println("Last number is less than or equal to 40 = false");

        if(input1 > 25 && input7 > 25) System.out.println("Both first and last numbers are greater than 25 = true");
        else System.out.println("Both first and last numbers are greater than 25 = false");

        if(input1==0 || input1==50 || input2==0 || input2==50 || input3==0 || input3==50 || input4==0 || input4==50 ||
        input5==0 || input5==50 || input6==0 || input6==50 || input7==0 || input7==50){
            System.out.println("At least one of those numbers is 0 or 50 = true");
        }else System.out.println("At least one of those numbers is 0 or 50 = false");

        if(input1>=40 && input1<=50 || input2>=40 && input2<=50 || input3>=40 && input3<=50 || input4>=40 && input4<=50
                || input5>=40 && input5<=50 || input6>=40 && input6<=50 || input7>=40 && input7<=50){
            System.out.println("There is no number between 40 and 50 = false");
        }else System.out.println("There is no number between 40 and 50 = true");


        System.out.println("\n---------- Task-4 ----------");

        int random1 = (int)(Math.random()*101), random2 = (int)(Math.random()*101), random3 = (int)(Math.random()*101);

        if(random1>25 && random2>25 && random3>25) System.out.println("True");
        else System.out.println("False");


        System.out.println("\n---------- Task-5 ----------");

        System.out.println("Please enter a number from 1 to 7 (1 and 7 included).");

        int input1To7 = scan.nextInt();

        switch (input1To7){
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("The number entered returns SUNDAY");
        }


        System.out.println("\n---------- Task-7 ----------");

        System.out.println("Please tell me your exam results.");

        int exam1 = scan.nextInt(), exam2 = scan.nextInt(), exam3 = scan.nextInt();

        if(((exam1+exam2+exam3)/3) >= 70) System.out.println("YOU PASSED!");
        else if (((exam1+exam2+exam3)/3) <= 70) System.out.println("YOU FAILED!");


        System.out.println("\n---------- Task-8 ----------");

        System.out.println("Please enter 3 numbers");

        int number1 = scan.nextInt(), number2 = scan.nextInt(), number3 = scan.nextInt();

        if(number1==number2 && number2==number3) System.out.println("TRIPLE MATCH");
        else if(number1==number2 || number2==number3 || number1==number3) System.out.println("DOUBLE MATCH");
        else System.out.println("NO MATCH");

        System.out.println("\nEnd of the program!");
    }
}
