package collections.arrayLists;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {

        // 1. Declaring an Array vs ArrayList
        String[] namesArray = new String[5]; // [null, null, null, null, null]

        ArrayList<String> namesList = new ArrayList<>();

        // 2. How to print the size of Array vs ArrayList
        System.out.println("\n--------Printing size of Array vs ArrayList");
        System.out.println("Size of the Array = " + namesArray.length); // 5
        System.out.println("Size of the ArrayList = " + namesList.size()); // 0


        // 3. How to add elements to Array vs ArrayList
        namesArray[0] = "Abe";
        namesArray[4] = "Data";
        //namesArray[7] = "John"; // ArrayIndexOutOfBoundException Runtime error
        namesArray[4] = "Lionel";

        namesList.add("Abe"); // add method that takes object  [Abe]
        namesList.add(1,"Data"); // Add object to a specific index [Abe, Data]
        namesList.add(1, "John"); // [Abe, John, Data]
        namesList.add("Alona"); // [Abe, John, Data, Alona]
        namesList.add("Max"); // [Abe, John, Data, Alona, Max]
        namesList.add(0, "James"); // [James, Abe, John, Data, Alona, Max]

        namesList.set(3, "Lionel"); // [James, Abe, John, Lionel, Alona, Max]


        // 4. How to print Array vs ArrayList
        System.out.println(Arrays.toString(namesArray)); // [Abe, null, null, null, Lionel]
        System.out.println(namesList); // [James, Abe, John, Lionel, Alona, Max]

        System.out.println(namesList.add("Andrei")); // true
        System.out.println(namesList); // [James, Abe, John, Lionel, Alona, Max, Andrei]

        namesList.add(5, "Taylor");
        System.out.println(namesList); // [James, Abe, John, Lionel, Alona, Taylor, Max, Andrei]

        System.out.println(namesList.set(3, "Daria")); // Lionel
        System.out.println(namesList);// [James, Abe, John, Daria, Alona, Taylor, Max, Andrei]

        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add("Regina");
        namesList.add(null);
        namesList.add(null);
        namesList.add(null);
        namesList.add("Guluzar");

        System.out.println(namesList);
        System.out.println(namesList.size());

        namesList.remove(0);
        System.out.println(namesList);

        System.out.println(namesList.remove(2));
        System.out.println(namesList);


        namesList.remove("Alona");
        System.out.println(namesList);

        System.out.println(namesList.remove("John"));
        System.out.println(namesList);

        System.out.println(namesList.remove("max"));
        System.out.println(namesList.remove("Melda"));
        System.out.println(namesList);

        namesList.add(0,"Regina");
        System.out.println(namesList);
        namesList.remove("Regina"); // removes first occurrence of object given
        System.out.println(namesList);

        namesList.remove("Regina");
        namesList.remove("Regina");
        namesList.remove("Regina");

        System.out.println(namesList);



    }
}