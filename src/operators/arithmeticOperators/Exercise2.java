package operators.arithmeticOperators;

public class Exercise2 {
    public static void main(String[] args){

        /*
        Create the variables
        Find the area with multiplying
        Find the perimeter with formula (2*(a+b))
        Print them out
         */

        int a = 4;
        int b = 6;

        int area = a * b;
        // a = a * b; a=4, b=6
        int perimeter = 2 * (a + b);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);


    }
}
