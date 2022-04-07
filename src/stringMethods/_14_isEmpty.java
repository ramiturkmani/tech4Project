package stringMethods;

public class _14_isEmpty {
    public static void main(String[] args) {
        String name = "John";

        System.out.println(name.isEmpty()); //false
        System.out.println(name.replace("John", "").isEmpty()); //true
        System.out.println("Hello".toLowerCase().replace("hello", "").isEmpty()); // true
        System.out.println(" ".isEmpty()); // false

    }
}
