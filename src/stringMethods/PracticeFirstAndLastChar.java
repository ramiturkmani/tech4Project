package stringMethods;

import utilities.ScannerHelper;

public class PracticeFirstAndLastChar {
    public static void main(String[] args) {

        String userName = ScannerHelper.getANameFromUser();

        System.out.println("First character of \"" + userName + "\" is = " + userName.charAt(0));
        System.out.println("Last character of \"" + userName + "\" is = " + userName.charAt(userName.length()-1));
    }
}
