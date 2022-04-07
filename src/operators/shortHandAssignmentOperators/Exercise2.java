package operators.shortHandAssignmentOperators;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your balance:");
        double balance = input.nextDouble();

        System.out.println("Enter your first transaction");
        double firstTran = input.nextDouble();
        balance -= firstTran; //balance has changed
        System.out.println("Balance after 1st transaction = $"+balance);

        System.out.println("---");

        System.out.println("Enter your second transaction");
        double secondTran = input.nextDouble();
        balance -= secondTran; //balance has changed
        System.out.println("Balance after 2nd transaction = $"+balance);

        System.out.println("---");

        System.out.println("Enter you third transaction");
        double thirdTran = input.nextDouble();
        balance -= thirdTran; //balance has changed
        System.out.println("Balance after 3rd transaction = $"+balance);



    }
}
