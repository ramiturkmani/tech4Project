package mathClass;

import java.util.Scanner;

public class ExerciseMaxAndMin {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        /*
        Find the min and max of given 3 numbers, write
        down the Pseudo code and print min and max with
        proper messages.


        NOTE: Declare and Assign all of them in one single line
        x = 4, y = 67, z = -54
         */

        int x = 4, y = 67, z = -54;

        int minOfXY = Math.min(x,y);
        int maxOfXY = Math.max(x,y);

        int minOfXYZ = Math.min(minOfXY,z);
        int maxOfXYZ = Math.max(maxOfXY,z);

        System.out.println("Min of every number is = "+minOfXYZ);
        System.out.println("Max of every number is = "+maxOfXYZ);

        Math.max(4,6);

        /*
        Write a program which is going to print the max of given 3 numbers
        4, 56, 23
         */

//        int num1 = 4;
//        int num2 = 56;
//        int num3 = 23;

        System.out.println("Max of given 3 numbers are = "+Math.max((Math.max(4,56)),23));

        /*
        Write a program which is going to ask 4 number print the max of retrieved 4 numbers
         */

        System.out.println("Input 4 numbers:");

        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt(), num4 = input.nextInt();

        System.out.println("Max of input numbers = "+Math.max((Math.max(num1,num2)),((Math.max(num3,num4)))));
        /*
        Both of these lines are the same but since the num1-num4 are only used once, we don't have to store them,
        we can just do it like below.
        */
        //System.out.println("Max of input numbers = "+Math.max((Math.max(input.nextInt(),input.nextInt())),((Math.max(input.nextInt(),input.nextInt())))));

        System.out.println("Max of input numbers = "+Math.min((Math.min(num1,num2)),((Math.min(num3,num4)))));
        /*
        Since I have both max and min, we must use the stored int variables and used those instead of input.nextInt().
         */
        //System.out.println("Min of input numbers = "+Math.min((Math.min(input.nextInt(),input.nextInt())),((Math.min(input.nextInt(),input.nextInt())))));
    }
}
