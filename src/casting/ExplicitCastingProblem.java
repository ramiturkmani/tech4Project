package casting;

public class ExplicitCastingProblem {
    public static void main(String[] args){

        int num = 150;
        byte b = (byte) num;

        System.out.println(b);
        /*
        Answer: -106 because when byte ranges from -128 to 127 so when you surpass 127,
        you start back over at the beginning which is -128.
        Ex) Value of 130 will result in -126.
        */

    }
}
