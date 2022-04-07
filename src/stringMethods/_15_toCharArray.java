package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {

        String s = "Java";

        char[] chars = s.toCharArray();

        System.out.println(Arrays.toString(s.toCharArray()));

        int countA = 0;

        for(char element : chars) {
            if (element == 'a') countA++;
        }

        System.out.println(countA);

        System.out.println(Arrays.toString("Hello".toCharArray()));


    }
}
