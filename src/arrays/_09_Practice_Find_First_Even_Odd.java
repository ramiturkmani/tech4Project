package arrays;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {

        int[] numbers = {0, 5, 3, 2, 4, 7, 10};

        boolean isFirstEvenFound = false;
        boolean isFirstOddFound = false;

        System.out.println("---------- First way ----------");

        int firstEven = 1;
        int firstOdd = 0;

        for(int num : numbers){
            if (num % 2 == 0 && !isFirstEvenFound) {
                isFirstEvenFound = true;
                firstEven = num;
            }
            else if (!isFirstOddFound){
                isFirstOddFound = true;
                firstOdd = num;
            }
            if (isFirstEvenFound && isFirstOddFound) break;
        }
        if(isFirstEvenFound) System.out.println(firstEven);
        else System.out.println("There is no even number in this array");

        if(isFirstOddFound) System.out.println(firstOdd);
        else System.out.println("There is no odd number in this array");


        System.out.println("---------- Second way ----------");

        boolean isFirstEvenFound2 = false;
        boolean isFirstOddFound2 = false;

        for(int num : numbers){
            if (num % 2 == 0 && !isFirstEvenFound2) {
                isFirstEvenFound2 = true;
                System.out.println(num);
            }
            else if (!isFirstOddFound2) {
                isFirstOddFound2 = true;
                System.out.println(num);
            }
            if (isFirstEvenFound2 && isFirstOddFound2) break;
        }
        if (!isFirstEvenFound2) System.out.println("There is no even number in this array");
        if (!isFirstOddFound2) System.out.println("There is no odd number in this array");

    }
}
