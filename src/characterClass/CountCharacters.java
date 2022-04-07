package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {
        /*
        TASK-1
        Write a program that counts spaces for below String
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */

        System.out.println("---TASK-1---\n");
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int count1 = 0;

        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == ' ') {
                count1++;
            }
        }
        System.out.println(count1);

           /*
        TASK-2
        Write a program that counts letters for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        25
         */
        System.out.println("\n---TASK-2---\n");

        int count2 = 0;

        for (int i = 0; i < address.length(); i++) {
            if (Character.isLetter(address.charAt(i))) {
                count2++;
            }
        }
        System.out.println(count2);

        /*
        TASK-3
        Write a program that counts uppercase and lowercase letters for below String.
        Then, find the difference between lowercase letters and uppercase letters
        Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */
        System.out.println("\n---TASK-3---\n");

        int upperCount = 0, lowerCount = 0;

        for (int i = 0; i < address.length(); i++) {
            if(Character.isUpperCase(address.charAt(i))){
                upperCount++;
            }
            else if (Character.isLowerCase(address.charAt(i))) {
                lowerCount++;
            }
        }
        System.out.println(Math.abs(lowerCount-upperCount));

        System.out.println("\n---TASK-3 - Second Way---\n");

        int count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            if(Character.isUpperCase(address.charAt(i))){
                count3--;
            }
            else if (Character.isLowerCase(address.charAt(i))) {
                count3++;
            }
        }
        System.out.println(Math.abs(count3));

        System.out.println("\n---TASK-3 - Third Way---\n");

        count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if (Character.isLetter(c)){
                if (Character.isUpperCase(c)) count3++;
                else count3--;
            }
        }
        System.out.println(Math.abs(count3));

        /*
        TASK-4
        Write a program that counts vowel and consonants letters for below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Vowels = 10
        Consonants = 15
         */

        System.out.println("\n---TASK-4---\n");

        int count4Vowel = 0;
        int count4Consonant = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if (Character.isLetter(c)){
                if (CharacterHelper.isConsonant(c)) count4Consonant++;
                else count4Vowel++;
            }
        }
        System.out.println("Vowels = " + count4Vowel);
        System.out.println("Consonant = " + count4Consonant);

        /*
        TASK-5 - Putting all together
        Write a program that characters from the below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Letters = 25
        Lowercases = 17
        Uppercases = 8
        Vowels = 10
        Consonants = 15
        Digits = 12
        Even digit = 9
        Odd digit = 3
        Spaces = 9
        Specials = 2
         */

        System.out.println("\n---TASK-5---\n");

        int count5Letter = 0;
        int count5Lower = 0;
        int count5Upper = 0;
        int count5Vowel = 0;
        int count5Consonant = 0;
        int count5Digit = 0;
        int count5EvenDigit = 0;
        int count5OddDigit = 0;
        int count5Spaces = 0;
        int count5Specials = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if (Character.isLetter(c)) { count5Letter++;
                if (CharacterHelper.isConsonant(c)) count5Consonant++;
                else count5Vowel++;
                if(Character.isUpperCase(c)) count5Upper++;
                else count5Lower++;
            }
            else if (Character.isDigit(c)) { count5Digit++;
                if (Integer.parseInt("" + c) % 2 == 0) count5EvenDigit++;
                else count5OddDigit++;
            }
            else if (Character.isWhitespace(c)) count5Spaces++;
            else count5Specials++;
        }
        System.out.println("Letter = " + count5Letter);
        System.out.println("Lower = " + count5Lower);
        System.out.println("Upper = " + count5Upper);
        System.out.println("Vowels = " + count5Vowel);
        System.out.println("Consonant = " + count5Consonant);
        System.out.println("Digits = " + count5Digit);
        System.out.println("Even Digits = " + count5EvenDigit);
        System.out.println("Odd Digits = " + count5OddDigit);
        System.out.println("Spaces = " + count5Spaces);
        System.out.println("Specials = " + count5Specials);

        System.out.println("\n---TASK-5 - Second Way---\n");

        int count5Letter2 = 0, count5Lower2 = 0, count5Consonant2 = 0, count5Digit2 = 0, count5EvenDigit2 = 0, count5Spaces2 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if (Character.isLetter(c)) { count5Letter2++;
                if (CharacterHelper.isConsonant(c)) count5Consonant2++;
                if(Character.isLowerCase(c)) count5Lower2++;
            }
            else if (Character.isDigit(c)) { count5Digit2++;
                if (Integer.parseInt("" + c) % 2 == 0) count5EvenDigit2++;
                else count5OddDigit++;
            }
            else if (Character.isWhitespace(c)) count5Spaces2++;
            else count5Specials++;
        }
        System.out.println("Letter = " + count5Letter2);
        System.out.println("Lower = " + count5Lower2);
        System.out.println("Upper = " + (count5Letter2-count5Lower2));
        System.out.println("Vowels = " + (count5Letter2-count5Consonant2));
        System.out.println("Consonant = " + count5Consonant2);
        System.out.println("Digits = " + count5Digit2);
        System.out.println("Even Digits = " + count5EvenDigit2);
        System.out.println("Odd Digits = " + (count5Digit2 - count5EvenDigit2));
        System.out.println("Spaces = " + count5Spaces2);
        System.out.println("Specials = " + (address.length()-count5Letter2-count5Digit2-count5Spaces2));

        System.out.println("\nExtra Task\n");

        String s = "ab1x2y3cd3dsjfhw43";
        //1+2+3+3+4+3 = 16;
        //Without parseInt: 49+50+51+51+52+51 = 304;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        System.out.println(sum);


    }
}
