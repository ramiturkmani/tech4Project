package loops.controlStatements;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        /*

         */

//        int i = 1;

//        while(i < 26){
//            if(i % 10 != 0) System.out.println(i);
//            i++;
//        }


        for (int i = 1; i < 26; i++) {
            if(i % 10 == 0) continue;
            else System.out.println(i);
            if(i == 15) break;
        }






    }
}
