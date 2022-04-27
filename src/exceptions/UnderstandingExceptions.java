package exceptions;

public class UnderstandingExceptions {
    public static void main(String[] args) {

        String name = "John";

        try {
            System.out.println(name.charAt(2));
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("An exception is here!!!!!");
        }

        System.out.println("End of the program!");
    }
}
