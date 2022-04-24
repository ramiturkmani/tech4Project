package collectionsFramework;

import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);

        System.out.println(numbers);
    }
}