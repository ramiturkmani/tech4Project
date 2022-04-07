package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {


        String[] cities = {"Berlin", "Chicago", "Dallas", "Miami", "Brugge", "Kiev"};

        List<String> cities1 = new LinkedList<>(Arrays.asList(cities));

        System.out.println(cities1);

        cities1.remove("Dallas");
        cities1.remove("Miami");

        System.out.println(cities1);




    }
}
