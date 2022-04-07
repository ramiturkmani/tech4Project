package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

        System.out.println("----- Generic Way -----\n");

        List<String> countries1 = new LinkedList<>();

        countries1.add("USA");
        countries1.add("Brasilia");
        countries1.add("Argentina");
        countries1.add("France");
        countries1.add("Belgium");
        countries1.add("Germany");
        countries1.add("Portugal");

        System.out.println(countries1);


        String[] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};


        System.out.println("\n----- First Way -----\n");

        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));

        System.out.println(countries2);


        System.out.println("\n----- Second Way -----\n");

        List<String> countries3 = new ArrayList<>();
        Collections.addAll(countries3,countries);
        System.out.println(countries3);


        System.out.println("\n----- Third Way -----\n");

        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new LinkedList<>(); // or ArrayList

        for (int integer : numbers) {
            numbersList.add(integer);
        }

        System.out.println(numbersList);



    }
}
