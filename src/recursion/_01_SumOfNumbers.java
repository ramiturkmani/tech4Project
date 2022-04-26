package recursion;

public class _01_SumOfNumbers {

    public static int sum(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recursiveSum(int n){
        if (n > 0) return n + recursiveSum(n-1);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // 15
        System.out.println(sum(7)); // 28

        System.out.println(recursiveSum(5)); // 15
        System.out.println(recursiveSum(7)); // 28
    }
}
