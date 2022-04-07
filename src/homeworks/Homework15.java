package homeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework15 {
    public static void main(String[] args) {

        System.out.println("---------- TASK-1 ----------\n");

        List<Integer> t1_num = new ArrayList<>();
        t1_num.add(10);
        t1_num.add(23);
        t1_num.add(67);
        t1_num.add(23);
        t1_num.add(78);
        System.out.println(t1_num.get(3));
        System.out.println(t1_num.get(0));
        System.out.println(t1_num.get(2));
        System.out.println(t1_num);


        System.out.println("\n---------- TASK-2 ----------\n");

        List<String> t2_colors = new ArrayList<>();
        t2_colors.add("Blue");
        t2_colors.add("Brown");
        t2_colors.add("Red");
        t2_colors.add("White");
        t2_colors.add("Black");
        t2_colors.add("Purple");
        System.out.println(t2_colors.get(1));
        System.out.println(t2_colors.get(3));
        System.out.println(t2_colors.get(5));
        System.out.println(t2_colors);


        System.out.println("\n---------- TASK-3 ----------\n");

        List<Integer> t3_nums = new ArrayList<>();
        t3_nums.add(23);
        t3_nums.add(-34);
        t3_nums.add(-56);
        t3_nums.add(0);
        t3_nums.add(89);
        t3_nums.add(100);
        System.out.println(t3_nums);
        Collections.sort(t3_nums);
        System.out.println(t3_nums);


        System.out.println("\n---------- TASK-4 ----------\n");

        List<String> t4_cities = new ArrayList<>();
        t4_cities.add("Istanbul");
        t4_cities.add("Berlin");
        t4_cities.add("Madrid");
        t4_cities.add("Paris");
        System.out.println(t4_cities);
        Collections.sort(t4_cities);
        System.out.println(t4_cities);


        System.out.println("\n---------- TASK-5 ----------\n");

        List<String> t5_marvel = new ArrayList<>();
        t5_marvel.add("Spider Man");
        t5_marvel.add("Iron Man");
        t5_marvel.add("Black Panter");
        t5_marvel.add("Deadpool");
        t5_marvel.add("Captain America");
        System.out.println(t5_marvel);

        boolean containsWol = false;

        for (String character : t5_marvel) {
            if (character.equalsIgnoreCase("Wolwerine")) containsWol = true;
        }
        System.out.println(containsWol);


        System.out.println("\n---------- TASK-6 ----------\n");

        List<String> t6_avenger = new ArrayList<>();
        t6_avenger.add("Hulk");
        t6_avenger.add("Black Widow");
        t6_avenger.add("Captain America");
        t6_avenger.add("Iron Man");
        Collections.sort(t6_avenger);
        System.out.println(t6_avenger);

        boolean containsHulk = false;
        boolean containsIron = false;
        boolean containsBoth = false;

        for (String character : t6_avenger) {
            if(character.equalsIgnoreCase("Hulk")) containsHulk = true;
            if(character.equalsIgnoreCase("Iron Man")) containsIron = true;
        }
        if (containsHulk && containsIron) containsBoth = true;
        System.out.println(containsBoth);


        System.out.println("\n---------- TASK-7 ----------\n");

        List<Character> t7_chars = new ArrayList<>();
        t7_chars.add('A');
        t7_chars.add('x');
        t7_chars.add('$');
        t7_chars.add('%');
        t7_chars.add('9');
        t7_chars.add('*');
        t7_chars.add('+');
        t7_chars.add('F');
        t7_chars.add('G');
        System.out.println(t7_chars);

        for (Character t7_char : t7_chars) {
            System.out.println(t7_char);
        }


        System.out.println("\n---------- TASK-8 ----------\n");

        List<String> t8_objects = new ArrayList<>();
        t8_objects.add("Desk");
        t8_objects.add("Laptop");
        t8_objects.add("Mouse");
        t8_objects.add("Monitor");
        t8_objects.add("Mouse-Pad");
        t8_objects.add("Adapter");
        System.out.println(t8_objects);
        Collections.sort(t8_objects);
        System.out.println(t8_objects);

        int countM = 0;
        int countNoAorE = 0;

        for (String t8_object : t8_objects) {
            if (t8_object.toLowerCase().startsWith("m")) countM++;
            if (!t8_object.toLowerCase().contains("a") && !t8_object.toLowerCase().contains("e")) countNoAorE++;
        }
        System.out.println(countM);
        System.out.println(countNoAorE);


        System.out.println("\n---------- TASK-9 ----------\n");

        List<String> t9_kitchen = new ArrayList<>();
        t9_kitchen.add("Plate");
        t9_kitchen.add("spoon");
        t9_kitchen.add("fork");
        t9_kitchen.add("Knife");
        t9_kitchen.add("cup");
        t9_kitchen.add("Mixer");
        System.out.println(t9_kitchen);

        int upper = 0;
        int hasP = 0;
        int startsOrEndsP = 0;

        for (String object : t9_kitchen) {
            //if (object.charAt(0) == object.toUpperCase().charAt(0)) upper++;
            if (Character.isUpperCase(object.charAt(0))) upper++;
            if (object.toLowerCase().contains("p")) {
                hasP++;
                if (object.toLowerCase().startsWith("p") || object.toLowerCase().endsWith("p")) startsOrEndsP++;
            }
        }
        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase = " + (t9_kitchen.size()-upper));
        System.out.println("Elements having P or p = " + hasP);
        System.out.println("Elements starting or ending with P or p = " + startsOrEndsP);


        System.out.println("\n---------- TASK-10 ----------\n");

        List<Integer> t10_nums = new ArrayList<>();
        t10_nums.add(3);
        t10_nums.add(5);
        t10_nums.add(7);
        t10_nums.add(10);
        t10_nums.add(0);
        t10_nums.add(20);
        t10_nums.add(17);
        t10_nums.add(10);
        t10_nums.add(23);
        t10_nums.add(56);
        t10_nums.add(78);
        System.out.println(t10_nums);

        int divide10 = 0;
        int evenGreater15 = 0;
        int oddLess20 = 0;
        int less15Greater50 = 0;

        for (Integer num : t10_nums) {
            if (num%10 == 0) divide10++;
            if (num%2 == 0 && num > 15) evenGreater15++;
            if (num%2 != 0 && num < 20) oddLess20++;
            if (num < 15 || num > 50) less15Greater50++;
        }
        System.out.println("Elements that can be divided by 10 = " + divide10);
        System.out.println("Elements that are even and greater than 15 = " + evenGreater15);
        System.out.println("Elements that are odd and less than 20 = " + oddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Greater50);

        System.out.println("\nEnd of the program!");
    }
}