package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework20 {
    //Task-1
    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }

    //Task-2
    public static ArrayList<Integer> noZero(ArrayList<Integer> arr){
        ArrayList<Integer> newArr = new ArrayList<>();
        for (Integer integer : arr) {
            if (integer != 0) newArr.add(integer);
        }
        return newArr;
    }

    //Task-3
    public static int[][] numberAndSquare(int[] arr){
        int[][] newArr = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i][0] = arr[i];
            newArr[i][1] = arr[i]*arr[i];
        }
        return newArr;
    }

    //Task-4
    public static boolean containsValue(String[] arr, String str){
        for (String s : arr) {
            if (s.equals(str)) return true;
        }
        return false;
    }

    //Task-5
    public static String reverseSentence(String str){
        String newStr = "";
        if (str.trim().contains(" ")) {
            String[] strArr = str.trim().split(" ");
            for (int i = strArr.length - 1; i >= 0; i--) {
                newStr += strArr[i] + " ";
            }
        }
        else newStr = "There is not enough words!";
        return newStr.substring(0,1).toUpperCase() + newStr.substring(1).toLowerCase().trim();
    }

    //Task-6
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^A-Z a-z]", "");
    }

    //Task-7
    public static String[] removeArraySpecialsDigits(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^A-Z a-z]", "");
        }
        return arr;
    }

    //Task-8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){
        ArrayList<String> newArr = new ArrayList<>();
        for (String element : arr1) {
            for (String element2 : arr2) {
                if (element.equals(element2) && !newArr.contains(element)) newArr.add(element);
            }
        }
        return newArr;
    }

    //Task-9
    public static ArrayList<String> noXInVariables(ArrayList<String> arr) {
        ArrayList<String> newArr = new ArrayList<>();
        for (String s : arr) {
            newArr.add(s.replaceAll("[Xx]", ""));
        }
        newArr.removeIf(String::isEmpty);
        return newArr;
    }

    public static void main(String[] args) {

        System.out.println(hasLowerCase("HELLO"));

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(3);
        arr.add(0);
        arr.add(0);
        arr.add(5);
        System.out.println(noZero(arr));

        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1,4})));

        System.out.println(containsValue(new String[]{"Hello", "abc", "123"}, "Abc"));

        System.out.println(reverseSentence("Hello World how are you"));

        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));

        ArrayList<String> strArr = new ArrayList<>();
        strArr.add("Java");
        strArr.add("is");
        strArr.add("fun");
        strArr.add("fun");
        ArrayList<String> strArr2 = new ArrayList<>();
        strArr2.add("fun");
        strArr2.add("abc");
        strArr2.add("lol");
        System.out.println(removeAndReturnCommons(strArr, strArr2));

        ArrayList<String> strArr3 = new ArrayList<>();
        strArr.add("Jaxva");
        strArr.add("fun");
        strArr.add("xXxX");
        strArr.add("fun");

        System.out.println(noXInVariables(strArr3));


    }
}
