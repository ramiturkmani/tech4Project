package stringMethods;

public class _07_indexOf_lastIndexOf {
    public static void main(String[] args) {

        String sentence = "I like Chicago and Miami more than any other cities";

        System.out.println(sentence.indexOf('C')); // 7
        System.out.println(sentence.indexOf('c')); // 10
        System.out.println(sentence.lastIndexOf('c')); // 45

        sentence.indexOf("Chicago"); // 7
        sentence.indexOf("Miami"); // 19

        sentence.indexOf("chicago"); // doesn't exist so it is -1
        sentence.indexOf('x'); // doesn't exist so it is -1
        sentence.indexOf("");

    }
}
