package loops.forLoop;

public class CountCharacterInAString {
    public static void main(String[] args) {

        String str = "TechGlobal School";

        int o = 0;

        for (int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) == 'o') o++;
        }

        System.out.println(o);


    }
}
