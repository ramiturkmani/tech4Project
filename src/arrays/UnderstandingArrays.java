package arrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        String name;

        name = "John";

        int age = 45;

        System.out.println("Name is = " + name);
        System.out.println("Age is = " + age);

//        String studentsName = "Alex, Abe, Yakeen";
//        String ages = "20, 21, 22";

        String[] names = {"Alex", "Abe", "Yakeen"};
        int[] ages = {20,21,22};
        char[] favCharacters = {'a','%','G'};
        double[] balances = {5.6, 15, 23.6};
        boolean[] doTheyLikeJava = {false, true, true};

        // HOW TO PRINT ARRAY
        System.out.println(names); // [Ljava.lang.String;@1540e19d

        String namesToString = Arrays.toString(names);
        System.out.println(namesToString); // [Alex, Abe, Yakeen]



        // HOW TO GET A SINGLE ELEMENT FROM ARRAY
        System.out.println(names[2]); // Yakeen
        System.out.println(names[1]); // Abe
        //System.out.println(names[5]); // ArrayIndexOutOfBounds

        // HOW TO UPDATE AN ELEMENT -> Abe -> Abraham
        names[1] = "Abraham";
        System.out.println(Arrays.toString(names)); //[Alex, Abraham, Yakeen]

        // Alex's age is 20 and his fav char is A. His balance is 5.6, and he likes java is false.
//        System.out.println(names[0] + "'s age is " + ages[0] + " and his fav char is " + favCharacters[0] + ".");
//        System.out.println(names[1] + "'s age is " + ages[1] + " and his fav char is " + favCharacters[1] + ".");
//        System.out.println(names[2] + "'s age is " + ages[2] + " and his fav char is " + favCharacters[2] + ".");

        for (int i = 0; i <= 2; i++) {
            System.out.println(names[i] + "'s age is " + ages[i] + " and his fav char is " + favCharacters[i] + ".");
        }




    }
}
