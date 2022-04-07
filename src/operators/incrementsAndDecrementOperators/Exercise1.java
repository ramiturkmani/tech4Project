package operators.incrementsAndDecrementOperators;

public class Exercise1 {
    public static void main(String[] args) {

        int i = 5;

        int age = 10 * (i++);
        System.out.println(age); //50

        age = 10 * (i);
        System.out.println(age); //60

        age = 10 * (++i);
        System.out.println(age); //70

        age = 10 * (i++);
        System.out.println(age); //70

        age = 10 * (i);
        System.out.println(age); //80

        age = 10 * (++i);
        System.out.println(age); //90

        age = 10 * (i++);
        System.out.println(age); //90

        age = 10 * (i);
        System.out.println(age); //100

        age = 10 * (++i);
        System.out.println(age); //110

    }
}
