package loops.forLoop;

import utilities.ScannerHelper;

public class PrintOddNumbersUsingScanner {
    public static void main(String[] args) {

        int num = ScannerHelper.getNumberFromUser();

        for (int i = 0; i <= num; i++){
            if(i%2 != 0) System.out.println(i);;
        }

        
    }
}
