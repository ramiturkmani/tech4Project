package stringMethods;

public class _06_charAt {
    public static void main(String[] args) {
        String name = "Alex";

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(4));


        char firstChar = name.charAt(0);

        if(firstChar == 65 || firstChar == 97){
            System.out.println("This name starts with A");
        }else{
            System.out.println("The name is not starting with A");
        }
    }
}
