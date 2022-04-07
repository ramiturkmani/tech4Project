package arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};

        System.out.println(chars.length); // 7

        int attempt = 1;
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Element " + attempt + " = " + chars[i]);
            attempt++;
        }

        System.out.println();
        
        for (char element: chars) {
            System.out.println("Element = " + element);
        }


    }
}
