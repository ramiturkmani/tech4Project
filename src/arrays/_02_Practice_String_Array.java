package arrays;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {

        /*
        TASK-1
        Create a String array and store below data
        Name of the array will be students

        Alex
        Tom
        John
        James
        Jordan
        Lionel
        Adam

        1. Print the array
        2. Sort the array and print it again

        EXPECTED:
        Unsorted array = [Alex, Tom, John, James, Jordan, Lionel, Adam]
        Sorted array = [Adam, Alex, James, John, Jordan, Lionel, Tom]
         */

        System.out.println("---------- TASK-1 ----------\n");

        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};

        System.out.println("Unsorted array = " + Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("Sorted array = " + Arrays.toString(students));


        System.out.println("\n---------- TASK-2 ----------\n");

        System.out.println("First name is = " + students[0]);

        System.out.println("Last name is = " + students[students.length-1]);


        System.out.println("\n---------- TASK-3 for-each ----------\n");

        int count = 0;
        for (String element:students) {
            if (element.startsWith("A")) count++;
        }
        System.out.println(count);

        System.out.println("\n---------- TASK-3 fori ----------\n");

        int count2 = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].charAt(0) == 'A') count2++;
        }
        System.out.println(count2);


        System.out.println("\n---------- TASK-4 ----------\n");

        int countAorE = 0;

        for (String student : students) {
            student=student.toLowerCase();
            if(student.contains("a") || student.contains("e")) countAorE++;
        }
        System.out.println(countAorE);

        int countAorE2 = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].toUpperCase().contains("A") || students[i].toUpperCase().contains("E")) countAorE2++;
        }
        System.out.println(countAorE2);

        /*
        TASK-5
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Count how many names has at least 5 characters 5,6,7,8,9,.....

        EXPECTED:
        3
         */

        System.out.println("\n---------- TASK-5 ----------\n");

        int name5orMore = 0;

        for (String student : students) {
            if(student.length() >= 5) name5orMore++;
        }
        System.out.println(name5orMore);


        /*
        TASK-6
        [Adam, Alex, James, John, Jordan, Lionel, Tom]

        Check if this array has an element that is equal to "Jennifer"
        if it has it, print true
        Otherwise, print false

        EXPECTED:
        false
         */

        System.out.println("\n---------- TASK-6 ----------\n");

        boolean containsJennifer = false;

        for (String element : students) {
            if (element.equalsIgnoreCase("Jennifer")) {
                containsJennifer = true;
                break;
            }
        }

        System.out.println(containsJennifer);



        /*
        MORE PRACTICE
        Count how many names starts with J or j
        Count how many names starts or ends with S-s
        Count names has O-o
        Count names has even length
        Count names that has odd length
        Count names that starts with a vowel letter
         */

    }
}
