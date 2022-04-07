package arrays;

import java.util.Arrays;

public class FruitsCollections {
    public static void main(String[] args) {

        String[] fruits = new String[4];
        System.out.println(Arrays.toString(fruits));

        fruits[0] = "Orange";
        fruits[3] = "Apple";

        System.out.println(Arrays.toString(fruits));

        System.out.println(fruits.length);

        System.out.println(fruits[0] + ", " + fruits[3]);

        System.out.println(fruits[0].toUpperCase()); // ORANGE
        System.out.println(fruits[0].charAt(0)); // O
        System.out.println(fruits[3].length()); // 5
        System.out.println(fruits[3].startsWith("A")); // true

        //System.out.println(fruits[1].length()); // NullPointerException

    }
}
