package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class CheckingIfListContainsMutlipleElements {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(50);
        numbers.add(55);
        numbers.add(40);
        numbers.add(45);
        numbers.add(30);

        System.out.println(numbers.contains(5));


        System.out.println(numbers.contains(20) && numbers.contains(30));

        List<Integer> elementsToBeChecked = new ArrayList<>();
        elementsToBeChecked.add(30);
        elementsToBeChecked.add(35);
        elementsToBeChecked.add(40);
        elementsToBeChecked.add(45);
        elementsToBeChecked.add(50);

        System.out.println(numbers.containsAll(elementsToBeChecked));







    }
}
