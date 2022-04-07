package homeworks;

import utilities.StringHelper;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println("---------- Task-1 ----------\n");

        String t1_str = null;
        if (t1_str.length() == 0) System.out.println("Length is zero");
        else{
            System.out.println("Length is = " + t1_str.length());
            System.out.println("First char is = " + t1_str.charAt(0));
            System.out.println("Last char is = " + t1_str.charAt(t1_str.length()-1));
            if(t1_str.contains("a") || t1_str.contains("A") || t1_str.contains("e") || t1_str.contains("E") ||
            t1_str.contains("i") || t1_str.contains("I") || t1_str.contains("o") || t1_str.contains("O") ||
            t1_str.contains("u") || t1_str.contains("U")){
                System.out.println("This String has vowel");
            }
            else System.out.println("This String does not have vowel");
        }



        System.out.println("\n---------- Task-2 ----------\n");

        String t2_str = null;

        if (t2_str.length() < 3) System.out.println("Length is less than 3");
        else{
            System.out.println(StringHelper.getMiddle(t2_str));
        }



        System.out.println("\n---------- Task-3 ----------\n");

        String t3_str = null;
        if (t3_str.length() < 4) System.out.println("INVALID INPUT");
        else{
            System.out.println("First 2 characters are = " + t3_str.substring(0,2));
            System.out.println("Last 2 characters are = " + t3_str.substring(t3_str.length()-2));
            System.out.println("The other characters are = " + t3_str.substring(2,t3_str.length()-2));
        }



        System.out.println("\n---------- Task-4 ----------\n");

        String t4_str = null;
        if(t4_str.length() < 2) System.out.println("Length is less than 2");
        else{
            boolean b = t4_str.substring(0, 2) == t4_str.substring(t4_str.length() - 2);
            System.out.println(b);
        }



        System.out.println("\n---------- Task-5 ----------\n");

        String t5_str1 = null;
        String t5_str2 = null;

        if(t5_str1.length() < 2 || t5_str2.length() <2) System.out.println("Invalid input!");
        else{
            System.out.println(t5_str1.substring(1,t5_str1.length()-1)+t5_str2.substring(1,t5_str2.length()-1));
        }



        System.out.println("\n---------- Task-6 ----------\n");

        String t6_str = null;

        if(t6_str.length()<4) System.out.println("INVALID INPUT");
        else{
            boolean b = t6_str.startsWith("xx") && t6_str.endsWith("xx");
            System.out.println(b);
        }

        System.out.println("\nEnd of the program!");
    }
}
