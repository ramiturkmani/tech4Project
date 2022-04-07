package homeworks;

import utilities.CharacterHelper;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {

        System.out.println("---------- TASK-1 ----------\n");

        int[] t1_num = new int[10];

        t1_num[2] = 23;
        t1_num[4] = 12;
        t1_num[7] = 34;
        t1_num[9] = 7;
        t1_num[6] = 15;
        t1_num[0] = 89;

        System.out.println(t1_num[3]);
        System.out.println(t1_num[0]);
        System.out.println(t1_num[9]);
        System.out.println(Arrays.toString(t1_num));



        System.out.println("\n---------- TASK-2 ----------\n");

        String[] t2_string = new String[5];

        t2_string[1] = "abc";
        t2_string[4] = "xyz";

        System.out.println(t2_string[3]);
        System.out.println(t2_string[0]);
        System.out.println(t2_string[4]);
        System.out.println(Arrays.toString(t2_string));



        System.out.println("\n---------- TASK-3 ----------\n");

        int[] t3_num = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(t3_num));
        Arrays.sort(t3_num);
        System.out.println(Arrays.toString(t3_num));



        System.out.println("\n---------- TASK-4 ----------\n");

        String[] t4_string = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(t4_string));
        Arrays.sort(t4_string);
        System.out.println(Arrays.toString(t4_string));



        System.out.println("\n---------- TASK-5 ----------\n");

        String[] t5_dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(t5_dogs));

        boolean containsPluto = false;

        for (String element : t5_dogs) {
            if(element.equalsIgnoreCase("Pluto")){
                containsPluto = true;
                break;
            }
        }
        System.out.println(containsPluto);



        System.out.println("\n---------- TASK-6 ----------\n");

        String[] t6_cats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(t6_cats);
        System.out.println(Arrays.toString(t6_cats));

        boolean containsBoth = false;

        for (String element : t6_cats) {
            if(element.equalsIgnoreCase("Garfield") && element.equalsIgnoreCase("Felix")){
                containsBoth = true;
                break;
            }
        }
        System.out.println(containsBoth);



        System.out.println("\n---------- TASK-7 ----------\n");

        double[] t7_num = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(t7_num));
        for (int i = 0; i < t7_num.length; i++) {
            System.out.println(t7_num[i]);
        }



        System.out.println("\n---------- TASK-8 ----------\n");

        char[] t8_char = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        int t8_letters = 0, t8_upper = 0, t8_digits = 0;

        for (char c : t8_char) {
            if(c >= 65 && c <= 90 || c >= 97 && c <= 122) {
                t8_letters++;
                if(c >= 65 && c <= 90) t8_upper++;
            }
            else if(c >= 48 && c <= 57) t8_digits++;
        }

        System.out.println(Arrays.toString(t8_char));
        System.out.println("Letters = " + t8_letters);
        System.out.println("Uppercase letters = " + t8_upper);
        System.out.println("Lowercase letters = " + (t8_letters - t8_upper));
        System.out.println("Digits = " + t8_digits);
        System.out.println("Special characters = " + (t8_char.length - t8_letters - t8_digits));



        System.out.println("\n---------- TASK-9 ----------\n");

        String[] t9_string = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        int t9_upper = 0, t9_BorP = 0, t9_BookOrPen = 0;


        for (String s : t9_string) {
            if(CharacterHelper.isUppercase(s.charAt(0))) t9_upper++;
            if(s.toLowerCase().startsWith("b") || s.toLowerCase().startsWith("p")) t9_BorP++;
            if(s.toLowerCase().contains("book") || s.toLowerCase().contains("pen")) t9_BookOrPen++;
        }
        System.out.println(Arrays.toString(t9_string));
        System.out.println("Elements starts with uppercase = " + t9_upper);
        System.out.println("Elements starts with lowercase = " + (t9_string.length - t9_upper));
        System.out.println("Elements starting with B or P = " + t9_BorP);
        System.out.println("Elements having \"book\" or \"pen\" = " + t9_BookOrPen);



        System.out.println("\n---------- TASK-10 ----------\n");

        int[] t10_num = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        int t10_Over10 = 0, t10_Under10 = 0;

        for (int i : t10_num) {
            if(i > 10) t10_Over10++;
            else if (i < 10) t10_Under10++;
        }
        System.out.println(Arrays.toString(t10_num));
        System.out.println("Elements that are more than 10 = " + t10_Over10);
        System.out.println("Elements that are less than 10 = " + t10_Under10);
        System.out.println("Elements that are 10 = " + (t10_num.length - t10_Over10 - t10_Under10));



        System.out.println("\n---------- TASK-11 ----------\n");

        int[] t11_Array1 = {5, 8, 13, 1 , 2};
        int[] t11_Array2 = {9, 3, 67, 1 , 0};
        int[] t11_MaxArray = new int[5];

        for(int i = 0; i < t11_Array1.length; i++){
            if(t11_Array1[i] > t11_Array2[i]) t11_MaxArray[i] = t11_Array1[i];
            else t11_MaxArray[i] = t11_Array2[i];
        }

        System.out.println("1st array is = " + Arrays.toString(t11_Array1));
        System.out.println("2nd array is = " + Arrays.toString(t11_Array2));
        System.out.println("3rd array is = " + Arrays.toString(t11_MaxArray));
    }
}