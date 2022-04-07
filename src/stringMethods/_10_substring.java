package stringMethods;

public class _10_substring {
    public static void main(String[] args) {

        String result = "About 3,520,000,000 results (0.82 seconds)";

        String num = result.substring(6,19);

        System.out.println(num);

        System.out.println(result.substring(28,42));
        System.out.println(result.substring(28, result.length()));
        System.out.println(result.substring(28)); // Best method if you can count

        // CREATIVE WAYS
        System.out.println(result.substring(result.indexOf('('))); // Best method if you can't count (ex. whiteboard)
        System.out.println(result.substring(result.lastIndexOf('0')-1));
        System.out.println(result.substring(result.length()-14));
        System.out.println(result.substring(result.indexOf("results")+8));

    }
}
