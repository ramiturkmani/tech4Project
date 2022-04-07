package ifElseStatements;

public class FindTheGreatestOf2Numbers {
    public static void main(String[] args){

        int num1 = (int) (Math.random()*11), num2 = (int) (Math.random()*11);

        System.out.println(num1);
        System.out.println(num2);

        //Math.max()

        System.out.println("The greatest of " + num1 + " and " + num2 + " is = " + Math.max(num1,num2));


    }
}
