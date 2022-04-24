package regex;

public class ReplaceAllMethod {
    public static void main(String[] args) {
        //Removing vowels
        String str = "Hello World";
        System.out.println("Before replacing all vowels: " + str);

        str = str.replaceAll("[AEIOUaeiou]", "\\$");
        System.out.println("After replacing all vowels: " + str);

        //Removing digits
        String str2 = "Hello 123 World";
        System.out.println("Before: " + str2);

        str2 = str2.replaceAll("[\\d]", "");
        System.out.println("After: " + str2);

        //Removing specials
        String str3 = "abc 123 $#^";
        System.out.println("Before: " + str3);

        str3 = str3.replaceAll("[^A-Za-z0-9]", "");
        System.out.println("After: " + str3);
    }
}
