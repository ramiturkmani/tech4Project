package stringMethods;

import utilities.ScannerHelper;

public class _12_contains {
    public static void main(String[] args) {

        String s = "Good Morning!";

        System.out.println(s.contains("Good")); //true
        System.out.println(s.contains("")); //true
        System.out.println(s.contains("123")); //false
        System.out.println(s.contains(s)); //true


        String address = ScannerHelper.getAStringFromUser();

        System.out.println((address.toLowerCase().contains("chicago")) ? "You are in the club" : "You are not in the club");

        if(address.toLowerCase().contains("chicago")){
            System.out.println("You are in the club");
        }else{
            System.out.println("You are not in the club");
        }


    }
}
