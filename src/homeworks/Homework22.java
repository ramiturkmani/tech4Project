package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework22 {
    //TASK-1
    public static int[] fibonacciSeries1(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) arr[i] = 0;
            else if (i == 1) arr[i] = 1;
            else arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr;
    }

    //TASK-2
    public static int fibonacciSeries2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) arr[i] = 0;
            else if (i == 1) arr[i] = 1;
            else arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n - 1];
    }

    //TASK-3
    public static int[] findUniques(int[] arr1, int[] arr2) {
        ArrayList<Integer> unique = new ArrayList<>();
        ArrayList<Integer> notUnique = new ArrayList<>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) notUnique.add(i);
            }
            if (!notUnique.contains(i) && !unique.contains(i)) unique.add(i);
        }
        for (int i : arr2) if (!notUnique.contains(i) && !unique.contains(i)) unique.add(i);
        int[] newArr = new int[unique.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = unique.get(i);
        }
        return newArr;
    }

    //TASK-4
    public static boolean isPowerOf3(int num){
        while(num % 3 == 0){
            num /= 3;
        }
        return num == 1;
    }

    //TASK-5
    public static int firstDuplicate(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[j];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciSeries1(7)));
        System.out.println(fibonacciSeries2(8));
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 5};
        System.out.println(Arrays.toString(findUniques(arr1, arr2)));
        System.out.println(isPowerOf3(15));
        System.out.println(firstDuplicate(new int[] {1, 1, 2, 3, 3, 4}));
    }
}
