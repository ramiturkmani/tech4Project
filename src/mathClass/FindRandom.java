package mathClass;

public class FindRandom {
    public static void main(String[] args){

        double random = Math.random(); //numbers from 0.0--->0.9999

        int random0And10Included = (int) (Math.random() * 11); //0-10

        System.out.println(random);
        System.out.println(random0And10Included);

        int random0And20Included = (int) (Math.random() * 21); //0-20

        System.out.println(random0And20Included);

        int random10And20Included = (int) (Math.random() * 11) + 10; //10-20

        System.out.println(random10And20Included);

        //random * (end point - start point +1) + start point

        int random103And346Included = (int) (Math.random() * 244) + 103; //103--->346

        System.out.println(random103And346Included);

        int random_50And50Included = (int) (Math.random() * 101) - 50; //-50--->50

        System.out.println(random_50And50Included);






















    }
}
