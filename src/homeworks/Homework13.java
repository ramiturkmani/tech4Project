package homeworks;

import utilities.RandomNumberGenerator;

public class Homework13 {
    public static void main(String[] args) {

        System.out.println("---------- TASK-1 ----------\n");

        for (int i = 1; i <= 10; i++){
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);;
        }


        System.out.println("\n---------- TASK-2 ----------\n");

        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean isPositive = false;
        boolean isNegative = false;
        int firstPositive = -1, firstNegative = 1;

        for (int num : numbers){
            if(isPositive && isNegative) break;
            if (num > 0 && !isPositive) {
                firstPositive = num;
                isPositive = true;
            }
            else if (num < 0 && !isNegative) {
                firstNegative = num;
                isNegative = true;
            }
            if (isPositive && isNegative) break;
        }
        System.out.println("First positive number is: " + firstPositive);
        System.out.println("First negative number is: " + firstNegative);


        System.out.println("\n---------- TASK-3 ----------\n");

        int[] random = new int[5];

        for (int i = 0; i < random.length; i++) {
            random[i] = RandomNumberGenerator.getRandomNumber(1,10);
        }

        boolean contains2or3 = false;

        for (int rand : random) {
            if(rand == 2 || rand == 3) {
                contains2or3 = true;
                break;
            }
        }
        System.out.println(contains2or3);


        System.out.println("\n---------- TASK-4 ----------\n");

        String[] strings = {"Banana", "Orange", "Apple"};

        boolean containsApple = false;

        for (String element : strings){
            if(element.equalsIgnoreCase("apple")) {
                containsApple = true;
                break;
            }
        }
        System.out.println(containsApple);


        System.out.println("\n---------- TASK-5 ----------\n");

        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};

        boolean noMatch = false;
        for (int i1 : numbers1) {
            for (int i2 : numbers2) {
                if(i1 == i2) {
                    System.out.println(i1);
                    noMatch = true;
                }
            }
        }
        if (!noMatch) System.out.println("There is no matching elements");


        System.out.println("\n---------- TASK-6 ----------\n");

        String str = "baNana";

        String[] chars = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            chars[i] = String.valueOf(str.charAt(i));
        }

        String repeated = "";

        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i].equalsIgnoreCase(chars[j]) && !repeated.contains(chars[i])) {
                    System.out.println(chars[i]);
                    repeated += chars[i];
                }
            }
        }


        System.out.println("\nEnd of the program!");
    }
}