package loops;

public class UnderstandingLoops {
    public static void main(String[] args) {
        /*
        Write a Java program to print "Hello" 5 times

        Expected:
        Hello
        Hello
        Hello
        Hello
        Hello
         */

        /*
        SYNTAX:
        for(start; termination; update){
            //Block of code to execute
        }
         */

        for(int count = 1; count <= 5; count ++){ //post-increment
            System.out.println("Hello");
        }


        System.out.println("\nEnd of the program!");
    }
}
