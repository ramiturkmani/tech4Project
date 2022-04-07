package collections.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class _02_Practice_Remove_Duplicates {
    public static void main(String[] args) {

        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");

        /*
        TASK-1
        Find unique elements in this and print them

        RESULT:
        [Cup, Book, Pen, Pencil]
         */

        List<String> uniques = new ArrayList<>();

        for (String object : objects) {
            if(!uniques.contains(object)) uniques.add(object);
        }

        System.out.println(uniques);

//        --- This method works but prints out of order ---
//        for (int i = 0; i < objects.size(); i++) {
//            for (int j = i + 1; j < objects.size() ; j++) {
//                if(objects.get(i).equals(objects.get(j))){
//                    objects.remove(objects.get(j));
//                }
//            }
//        }
//        System.out.println(objects);





    }
}
