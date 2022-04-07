package collections.arrayLists;

import java.util.Iterator;
import java.util.LinkedList;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {

        LinkedList<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");

        languages.remove("Python");

        System.out.println(languages);

//        First way
//        LinkedList<String> jWords = new LinkedList<>();
//
//        for (String language : languages) {
//            if (language.toLowerCase().startsWith("j")) jWords.add(language);
//        }
//
//        languages.removeAll(jWords);
//        System.out.println(languages);

//        Second way
//        languages.removeIf(x -> x.toLowerCase().startsWith("j"));
//        System.out.println(languages);

        //USING ITERATOR

        Iterator<String> iterator = languages.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            if(element.toLowerCase().startsWith("j")) {
                iterator.remove();
            }
        }


    }
}
