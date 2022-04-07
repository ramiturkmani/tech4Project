package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("---------- TASK-1 ----------\n");

        int[] t1_numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        boolean t1_duplicate = false;

        for (int element : t1_numbers) {
            for (int i = 1; i < t1_numbers.length; i++) {
                if (element == t1_numbers[i] && !t1_duplicate){
                    System.out.println(element);
                    t1_duplicate = true;
                }
            }
        }
        if (!t1_duplicate) System.out.println("There is no duplicates");


        System.out.println("\n---------- TASK-2 ----------\n");

        String[] t2_words = {"Z", "abc", "z", "123", "#"};
        boolean t2_duplicate = false;

        for (String element : t2_words) {
            for (int i = 1; i < t2_words.length; i++) {
                if (element.equalsIgnoreCase(t2_words[i]) && !t2_duplicate ){
                    System.out.println(element);
                    t2_duplicate = true;
                }
            }
        }
        if (!t2_duplicate) System.out.println("There is no duplicates");


        System.out.println("\n---------- TASK-3 ----------\n");

        int[] t3_numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        List<Integer> t3_duplicates = new ArrayList<>();

        for (int i = 0; i < t3_numbers.length; i++) {
            for (int j = i + 1; j < t3_numbers.length; j++) {
                if (t3_numbers[i] == t3_numbers[j] && !t3_duplicates.contains(t3_numbers[i])){
                    System.out.println(t3_numbers[i]);
                    t3_duplicates.add(t3_numbers[i]);
                }
            }
        }
        if (t3_duplicates.isEmpty()) System.out.println("There is no duplicates");


        System.out.println("\n---------- TASK-4 ----------\n");

        String[] t4_words = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
        List<String> t4_duplicates = new ArrayList<>();

        for (int i = 0; i < t4_words.length; i++) {
            for (int j = i + 1; j < t4_words.length; j++) {
                if (t4_words[i].equalsIgnoreCase(t4_words[j]) && !t4_duplicates.contains(t4_words[i].toLowerCase())){
                    System.out.println(t4_words[i]);
                    t4_duplicates.add(t4_words[i].toLowerCase());
                }
            }
        }
        if (t4_duplicates.isEmpty()) System.out.println("There is no duplicates");


        System.out.println("\n---------- TASK-5 ----------\n");

        String[] t5_words = {"abc", "foo", "bar"};
        List<String> t5_reverse = new ArrayList<>();

        for (String element : t5_words) {
            t5_reverse.add(0, element);
        }
        System.out.println(t5_reverse);


        System.out.println("\n---------- TASK-6 ----------\n");

        String t6_str = "Java is fun";
        String[] t6_split = t6_str.split(" ");
        String t6_newString = "";

        for (String s : t6_split) {
            String tempString = "";
            for (int i = s.length()-1; i >= 0; i--) {
                tempString += s.charAt(i);
            }
            t6_newString += tempString + " ";
        }
        System.out.println(t6_newString.trim());


        System.out.println("\n\nEnd of the program!");
    }
}
