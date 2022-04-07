package loops.nestedLoops;

public class PrintAllLetters {
    public static void main(String[] args) {

//        for (int i = 1; i <= 2 ; i++) {
//            if (i == 1){
//                System.out.println("Uppercase Letters");
//                for (int j = 65; j <= 90 ; j++) {
//                    System.out.print((char) j + " ");
//                }
//            }
//            else{
//                System.out.println("\n\nLowercase Letters");
//                for (int k = 97; k <= 122; k++) {
//                    System.out.print((char) k + " ");
//                }
//            }
//        }

        for (int i = 1; i <= 2 ; i++) {
            int start = 97;
            if (i == 1){
                System.out.println("Lowercase Letters");
            }
            else{
                System.out.println("\n\nUppercase Letters");
                start = 65;
            }
            for (int j = start; j <= start+25 ; j++) {
                System.out.print((char) j + " ");
            }
        }


        System.out.println("End of the program!");
    }
}
