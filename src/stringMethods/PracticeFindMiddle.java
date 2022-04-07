package stringMethods;

import utilities.StringHelper;

public class PracticeFindMiddle {
    public static void main(String[] args) {
        String name1 = "Taylor";
        char first = name1.charAt(0);
        char last = name1.charAt(name1.length()-1);

        String name2 = "Alona";

        System.out.println("" + name1.charAt(name1.length()/2-1) + name1.charAt(name1.length()/2));

        System.out.println(StringHelper.getMiddle(name1));
        System.out.println(StringHelper.getMiddle(name2));
        System.out.println(StringHelper.getMiddle("Rami"));
        System.out.println(StringHelper.getMiddle("Guluzar"));
        System.out.println(StringHelper.getMiddle("Alexandr"));

    }
}
