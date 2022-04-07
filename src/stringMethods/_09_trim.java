package stringMethods;

public class _09_trim {
    public static void main(String[] args) {

        String str = "    Hello   ";

        System.out.println(str); //     Hello
        System.out.println(str.length()); // 12
        System.out.println(str.trim()); // Hello
        System.out.println(str.trim().length()); // 5

        String str2 = "   Good      Morning     ";
        String str3 = str2.trim();

        System.out.println(str3); // Good      Morning
    }
}
