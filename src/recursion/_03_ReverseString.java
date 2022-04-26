package recursion;

public class _03_ReverseString {

//    public static String reverseString(String str){
//        String reverse = "";
//        do{
//            reverse += str.charAt(str.length()-1);
//        } while (str.length() != reverse.length());
//        return reverse;
//    }

    public static String reverseString(String str){
        if (str.length() <= 1) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Apple"));
    }
}
