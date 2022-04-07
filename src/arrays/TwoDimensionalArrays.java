package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        String[][] studentGroups = {
                                    {"Kaly", "Guluzar", "Melda"},
                                    {"Torrie", "David"},
                                    {"Abe", "Data"}
                                    };
        System.out.println(studentGroups[0][2]); // Guluzar
        System.out.println(studentGroups[1][0]); // Torrie
        System.out.println(studentGroups[1][1]); // David

        //How to get size of the studentGroups
        System.out.println(studentGroups.length); // 3

        //How to get the size of the second group
        System.out.println(studentGroups[1].length); // 2

        //How to print third group
        System.out.println(Arrays.toString(studentGroups[2])); // [Abe, Data]

        //How to print all
        System.out.println(Arrays.deepToString(studentGroups)); //[[Kaly, Guluzar, Melda], [Torrie, David], [Abe, Data]]

        //How to print all on different lines
        System.out.println("----- First way -----");
        for (int i = 0; i < studentGroups.length; i++) {
            System.out.println(Arrays.toString(studentGroups[i]));
        }

        System.out.println("----- Second way -----");
        for(String[] group : studentGroups){
            System.out.println(Arrays.toString(group));
        }

        //How to print all names on separate lines
        System.out.println("----- First way -----");
        for (int i = 0; i < studentGroups.length; i++) {
            for (int j = 0; j < studentGroups[i].length; j++) {
                System.out.println(studentGroups[i][j]);
            }
        }

        System.out.println("----- Second way -----");
        for(String[] group : studentGroups){
            for(String memeber : group){
                System.out.println(memeber);
            }
        }






    }
}