package operators.arithmeticOperators;

public class Exercise3 {
    public static void main(String[] args){

        /*
        1) Create the variables
        2) Do the equation
        3) Print them out
         */

        double avgSalary = 90_000; // 90000.00

        double monthlySalary = avgSalary / 12;
        double biWeeklySalary = avgSalary / 26;
        double weeklySalary = avgSalary / 52;

        System.out.println("Monthly Salary = "+monthlySalary);
        System.out.println("Bi-Weekly Salary = "+biWeeklySalary);
        System.out.println("Weekly Salary = "+weeklySalary);

    }
}
