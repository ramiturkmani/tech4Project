package homeworks;

public class Homework21 {
    //TASK-1
    public static void fizzBuzz1(int num){
        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
                continue;
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
                continue;
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
                continue;
            }
            else System.out.println(i);
        }
    }

    //TASK-2
    public static String fizzBuzz2(int num){
        if (num % 15 == 0) return "FizzBuzz";
        else if (num % 5 == 0) return "Buzz";
        else if (num % 3 == 0) return "Fizz";
        else return String.valueOf(num);
    }

    //TASK-3
    public static int findSumNumbers(String s){
        int sum = 0;
        for (String element : s.split("[^0-9]")) {
            if (!element.isEmpty()) sum += Integer.parseInt(element);
        }
        return sum;

    }

    //TASK-4
    public static int findBiggestNumber(String s){
        int max = 0;
        for (String element : s.split("[\\D]")) {
            if (!element.isEmpty() && Integer.parseInt(element) > max) max = Integer.parseInt(element);
        }
        return max;
    }

    //TASK-5
    public static String countSequenceOfCharacters(String s){
        StringBuilder str = new StringBuilder();
        if (s.length() == 0) return "";
        else{
            for (int i = 0; i < s.length() - 1; i++) {
                int count = 1;
                if (s.charAt(i) == s.charAt(i + 1)){
                    count ++;
                    i = i + count - 1;
                }
                str.append(String.valueOf(count)).append(s.charAt(i));
            }
            if (!(s.charAt(s.length() - 2) == s.charAt(s.length() - 1))) str.append("1").append(s.charAt(s.length() - 1));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        fizzBuzz1(19);
        System.out.println(fizzBuzz2(5));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(countSequenceOfCharacters("aaAAa"));
    }
}
