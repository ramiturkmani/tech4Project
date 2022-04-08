package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project08 {

    // ---------- TASK-1 ----------
    public static int countMultipleWords(String[] str){
        int count = 0;
        for (String s : str) {
            if(s.trim().contains(" ")) count++;
        }
        return count;
    }

    // ---------- TASK-2 ----------
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> arr){
        arr.removeIf(integer -> integer < 0);
        return arr;
    }

    // ---------- TASK-3 ----------
    public static boolean validatePassword(String password){
        boolean digit = false, upper = false, lower = false, special = false;

        if(password.length() >= 8 && password.length() <= 16 && !password.contains(" ")){
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if(Character.isDigit(c) && !digit) digit = true;
                else if(Character.isUpperCase(c) && !upper) upper = true;
                else if(Character.isLowerCase(c) && !lower) lower = true;
                else if(!Character.isLetterOrDigit(c) && !special) special = true;
            }
        }
        return digit && upper && lower && special;
    }

    // ---------- TASK-4 ----------
    public static boolean validateEmailAddress(String email){
        int countAt = 0;
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@') countAt++;
        }
        boolean properLengths = false;
        if(!email.contains(" ") && countAt == 1){
            int at = email.indexOf('@'), dot = email.lastIndexOf('.');
            if(email.substring(0,at).length() >= 2 &&
                    email.substring(at,dot).length() >= 3 &&
                    email.substring(dot).length() >= 3) properLengths = true;
        }
        return properLengths;
    }



    // ----- TESTING METHODS -----
    public static void main(String[] args) {
        System.out.println("---------- TASK-1 ----------\n");

        String[] t1_arr = {"foo", "", " ", "foo bar", "java is fun", " ruby "};
        System.out.println(Project08.countMultipleWords(t1_arr));


        System.out.println("\n---------- TASK-2 ----------\n");

        ArrayList<Integer> t2_nums = new ArrayList<>();
        t2_nums.add(2);
        t2_nums.add(-5);
        t2_nums.add(6);
        t2_nums.add(7);
        t2_nums.add(-10);
        t2_nums.add(-78);
        t2_nums.add(0);
        t2_nums.add(15);
        System.out.println(Project08.removeNegatives(t2_nums));


        System.out.println("\n---------- TASK-3 ----------\n");

        String t3_password = "Abcd@12.34!";
        System.out.println(Project08.validatePassword(t3_password));


        System.out.println("\n---------- TASK-4 ----------\n");

        String t4_email = "ab@gm.co";
        System.out.println(Project08.validateEmailAddress(t4_email));
    }
}
