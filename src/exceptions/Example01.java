package exceptions;

public class Example01 {
    public static void main(String[] args) {
        String[] names = {"Alex", "John", "Max"};

        try {
            System.out.println(names[100]);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("End of the program!");
    }
}
