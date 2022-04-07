package stringMethods;

import utilities.ScannerHelper;

import java.util.Locale;

public class PracticeStartsWithAndEndsWith {
    public static void main(String[] args) {

        String name = ScannerHelper.getANameFromUser();

        System.out.println((name.toLowerCase().startsWith("a")) ? "You are in club A" : "You are not in club A");


        if(name.startsWith("A") || name.startsWith("a")){
            System.out.println("You are in club A");
        }else{
            System.out.println("You are not in club A");
        }

        if(name.toUpperCase().startsWith("A")){
            System.out.println("You are in club A");
        }else{
            System.out.println("You are not in club A");
        }

        if(name.toLowerCase().startsWith("a")){
            System.out.println("You are in club A");
        }else{
            System.out.println("You are not in club A");
        }

        if(name.charAt(0) == 'A' || name.charAt(0) == 'a'){
            System.out.println("You are in club A");
        }else{
            System.out.println("You are not in club A");
        }

        if(name.charAt(0) == 65 || name.charAt(0) == 97){
            System.out.println("You are in club A");
        }else{
            System.out.println("You are not in club A");
        }




    }
}
