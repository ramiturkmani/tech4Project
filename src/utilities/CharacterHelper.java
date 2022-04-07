package utilities;

public class CharacterHelper {

    public static boolean isSpace(char character){
        return character == 32;
    }

    public static boolean isDigit(char digit){
        return digit >= 48 && digit <= 57;
    }

    public static boolean isUppercase(char upper){
        return upper >= 65 && upper <= 90;
    }

    public static boolean isLowercase(char lower){
        return lower >= 97 && lower <= 122;
    }

    public static boolean isLetter(char letter){
        //return (letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122);
        return isUppercase(letter) || isLowercase(letter);
    }

    public static boolean isVowel(char vowel){
        return vowel == 65 || vowel == 69 || vowel == 73 || vowel == 79 || vowel == 85 ||
                vowel == 97 || vowel == 101 || vowel == 105 || vowel == 111 || vowel == 117;
        //return !(isConsonant(vowel));
    }

    public static boolean isConsonant(char consonant){
        //return (consonant >= 65 && consonant <= 90) || (consonant >= 97 && consonant <= 122) &&
        //        consonant != 65 && consonant != 69 && consonant != 73 && consonant != 79 && consonant != 85 &&
        //        consonant != 97 && consonant != 101 && consonant != 105 && consonant != 111 && consonant != 117;
        return isLetter(consonant) && !(isVowel(consonant));
    }


}
