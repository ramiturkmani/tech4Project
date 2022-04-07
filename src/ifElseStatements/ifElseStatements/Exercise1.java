package ifElseStatements.ifElseStatements;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        Write a program that is gonna create 3 random numbers
        between 45-90. Print out the all the numbers max, min,
        and the middle.

        56, 78, 63

        output:

        num1= 56
        num2= 78
        num3= 63
        max= 78
        min= 56
        middle= 63
         */

        int random1 = (int) (Math.random() * 46) + 45;
        int random2 = (int) (Math.random() * 46) + 45;
        int random3 = (int) (Math.random() * 46) + 45;

        int max = Math.max(Math.max(random1, random2), random3);
        int min = Math.min(Math.min(random1, random2), random3);
        int mid;

        if (random1 != max && random1 != min){
            mid = random1;
        }else if(random2 != max && random2 != min){
            mid = random2;
        }else{
            mid = random3;
        }

//        if (random2 != max && random2 != min){
//            mid = random2;
//        }
//        if (random3 != max && random3 != min){
//            mid = random3;
//        }
        System.out.println("num1= "+random1);
        System.out.println("num2= "+random2);
        System.out.println("num3= "+random3);
        System.out.println("max= "+max);
        System.out.println("min= "+min);
        System.out.println("mid= "+mid);
    }
}
