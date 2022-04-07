package operators.shortHandAssignmentOperators;

public class Exercise1 {
    public static void main(String[] args){

        int a = 8;
        int b = 3;

//        a+=b; // 11
//        a-=b; // 8
//        a*=b; // 24
//        a/=b; //8
//        a%=b; //2

        System.out.println("a +=b -> "+ (a+=b));
        System.out.println("a -=b -> "+ (a-=b));
        System.out.println("a *=b -> "+ (a*=b));
        System.out.println("a /=b -> "+ (a/=b));
        System.out.println("a %=b -> "+ (a%=b));

    }
}
