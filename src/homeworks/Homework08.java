package homeworks;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("---------- Task-1 ----------\n");

        int t1_num1 = (int) (Math.random() * 51);
        System.out.println("Random number = " + t1_num1);

        boolean t1_result;

        if (t1_num1 >= 10 && t1_num1 <= 25) t1_result = true;
        else t1_result = false;

        System.out.println("The random number is between 10 and 25 = " + t1_result);



        System.out.println("\n---------- Task-2 ----------\n");

        int t2_rand = (int) (Math.random() * 100 + 1);

        if (t2_rand >= 1 && t2_rand <= 25) System.out.println(t2_rand + " is in the 1st quarter");
        else if (t2_rand >= 26 && t2_rand <= 50) System.out.println(t2_rand + " is in the 2nd quarter");
        else if (t2_rand >= 51 && t2_rand <= 75) System.out.println(t2_rand + " is in the 3rd quarter");
        else if (t2_rand >= 76 && t2_rand <= 100) System.out.println(t2_rand + " is in the 4th quarter");

        if (t2_rand >= 1 && t2_rand <= 50) System.out.println(t2_rand + " is in the 1st half");
        else if (t2_rand >= 51 && t2_rand <= 100) System.out.println(t2_rand + " is in the 2nd half");



        System.out.println("\n---------- Task-3 ----------\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 numbers between 1 and 10 (1 and 10 are included)");

        int t3_num1 = scan.nextInt();
        int t3_num2 = scan.nextInt();
        int t3_num3 = scan.nextInt();
        int t3_num4 = scan.nextInt();
        int t3_num5 = scan.nextInt();

        if (t3_num1 >= 1 && t3_num1 <= 10) {
            t3_num1 = t3_num1 * 5;
        }else if(t3_num1<1 || t3_num1>10){
            t3_num1 = t3_num1 * 0;
        }

        if (t3_num2 >= 1 && t3_num2 <= 10) {
            t3_num2 = t3_num2 * 4;
        }else if(t3_num2<1 || t3_num2>10){
            t3_num2 = t3_num2 * 0;
        }

        if (t3_num3 >= 1 && t3_num3 <= 10) {
            t3_num3 = t3_num3 * 3;
        }else if(t3_num3<1 || t3_num3>10){
            t3_num3 = t3_num3 * 0;
        }

        if (t3_num4 >= 1 && t3_num4 <= 10) {
            t3_num4 = t3_num4 * 2;
        }else if(t3_num4<1 || t3_num4>10){
            t3_num4 = t3_num4 * 0;
        }

        if (t3_num5 >= 1 && t3_num5 <= 10) {
            t3_num5 = t3_num5 * 1;
        }else if(t3_num5<1 || t3_num5>10){
            t3_num5 = t3_num5 * 0;
        }

        System.out.println("Points = " + (t3_num1+t3_num2+t3_num3+t3_num4+t3_num5));



        System.out.println("\nEnd of the program!");
    }
}
