package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {
        String name = ScannerHelper.getANameFromUser();

        String reversed = "";

        for(int i = name.length()-1; i >= 0; i--){
            reversed += name.charAt(i);
        }
        System.out.println("The reversed name = "+reversed);
        System.out.println("The reversed name to uppercase = " + reversed.toUpperCase());

    }
}
