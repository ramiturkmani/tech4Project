package methods;

import utilities.MathHelper;

public class FindGreatestOrSmallestOf3Numbers {
    public static void main(String[] args) {


        int max = MathHelper.maxOfThree(3,5,7);

        System.out.println("Max of three numbers = " + max);

        MathHelper.maxOfThree(1.1, 2.6, 10.78);

        byte b1 = (byte) (Math.random()*10);
        byte b2 = (byte) (Math.random()*10);
        byte b3 = (byte) (Math.random()*10);

        System.out.println("Random 1 = " + b1);
        System.out.println("Random 2 = " + b2);
        System.out.println("Random 3 = " + b3);

        System.out.println(MathHelper.minOfThree(b1,b2,b3));

    }
}
