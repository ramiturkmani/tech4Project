package operators.arithmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args){

        int number1 = 9;
        int number2 = 3;

        number1 = 5;

        //addition
        int sum = number1 + number2; // 8

        //subtraction
        int sub = number1 - number2; // 2

        //multiplication
        int times = number1 * number2; // 15

        //division
        int div = number1 / number2;

        //remainder
        int remainder = number1 % number2; // 5 - (3 * 1) = 2

        System.out.println("Addition is = "+sum);
        System.out.println("Subtraction is = "+sub);
        System.out.println("Multiplication is = "+times);
        System.out.println("Division is = "+div);
        System.out.println("Remainder is = "+remainder);

    }
}
