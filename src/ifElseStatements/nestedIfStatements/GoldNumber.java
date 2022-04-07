package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args){

        /*
        Write a program that generates a random number bt -50 and 50
        if number is positive, then we will win 10 points
        if number is more than 25, then we will win extra 10 points
        if number is -7, then we will win extra 10 points
        lastly, if number is 7 (GOLD NUMBER), then will win extra 100 points
        */

        int n = (int)(Math.random()*101)-50;

        System.out.println("Random # = "+n);

//        if(n>0){
//            System.out.println("You win 10 points");
//            if(n>25){
//                System.out.println("You win an additional 10 points");
//            }else if(n==7){
//                System.out.println("LUCKY NUMBER 7!!! You win 100 points!");
//            }
//        }else if(n==-7){
//            System.out.println("You win an extra 10 points");
//        }else{
//            System.out.println("Sorry no points");
//        }

        int point = 0;

        // if they CANNOT be present at the SAME time, use "else if" (use if elseif else)

        if (n > 0){
            point += 10;
            if (n > 25){
                point += 10;
            }else if(n == 7){
                point += 100;
            }
        }else if(n < 0){
            if (n < -25){
                point += 0;
            }else if(n == -7){
                point += 10;
            }
        }else{
            point += 0;
        }
        System.out.println("Points = "+point);
    }
}
