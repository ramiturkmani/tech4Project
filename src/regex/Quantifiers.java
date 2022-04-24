package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]+", "hello")); //true
        System.out.println(Pattern.matches("[a-zA-Z]{3,}", "hello class")); //false because string contains space
        System.out.println(Pattern.matches("[a-zA-Z0-9_-]{8,15}", "hello_-class4")); //true
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}", "(708)-400-1480")); //true

    }
}
