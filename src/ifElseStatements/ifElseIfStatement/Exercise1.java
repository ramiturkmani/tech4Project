package ifElseStatements.ifElseIfStatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Exercise1 {
    public static void main(String[] args){

        /*
        Write a program that generates a random number between -10, 10(inclusive)
        and if the number is positive print out "number is POSITIVE!",
        if the number is negative print out "number is NEGATIVE!",
        and if the number is 0 print out "number is ZERO!".


        input:                      input:                  input:
        6                           -5                      0
        output:                     output:                 output:
        number is POSITIVE!         number is NEGATIVE!     number is ZERO!
         */

        int num1 = (int) (Math.random()*21)-10;

        System.out.println(num1);

        if(num1 > 0){
            System.out.println("number is POSITIVE");
        }else if(num1 < 0){
            System.out.println("number is NEGATIVE");
        }else{
            System.out.println("number is ZERO");
        }
    }
}
