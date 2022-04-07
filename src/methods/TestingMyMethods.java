package methods;

import projects.Project07;
import utilities.CharacterHelper;
import utilities.MathHelper;

public class TestingMyMethods {
    public static void main(String[] args) {

//        boolean b = MathHelper.isEven(5);
//
//        System.out.println(b);

        System.out.println(CharacterHelper.isSpace('d'));

        System.out.println(CharacterHelper.isDigit('a'));

        System.out.println(CharacterHelper.isVowel('A'));

        System.out.println(CharacterHelper.isConsonant('c'));



        System.out.println("\n TASK 1 \n");


        int[] num = {10,7,7,10,-3,10,-3};

        Project07.findGreatestAndSmallestWithSort(num);


        System.out.println("\n TASK 2 \n");

        Project07.findGreatestAndSmallest(num);


        System.out.println("\n TASK 3 \n");

        int[] num2 = {10,5,6,7,8,5,15,15};

        Project07.findSecondGreatestAndSmallestWithSort(num2);

        System.out.println("\n TASK 4 \n");

        Project07.findSecondGreatestAndSmallest(num2);

        System.out.println("\n TASK 5 \n");

        String[] words = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};

        Project07.findDuplicatedElementsInAnArray(words);

        System.out.println("\n TASK 6 \n");

        String[] words2 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};

        Project07.findMostRepeatedElementInAnArray(words2);





    }
}
