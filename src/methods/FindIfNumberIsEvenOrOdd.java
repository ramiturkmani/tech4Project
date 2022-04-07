package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindIfNumberIsEvenOrOdd {
    public static void main(String[] args) {

        int random = RandomNumberGenerator.getRandomNumber(17,33);

        System.out.println("The number generated is = " + random);

        if(MathHelper.isEven(random)) System.out.println("The number generated is EVEN");
        else System.out.println("The number generated is ODD");

    }
}
