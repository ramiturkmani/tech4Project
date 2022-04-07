package arrays;

public class _08_Practice_Count_Words {
    public static void main(String[] args) {

        System.out.println("---------- TASK-1 ----------\n");

        String s1 = "Today is Tuesday";

//        String[] sCountWords = s1.split(" ");
//        System.out.println(sCountWords.length);

        System.out.println(s1.split(" ").length);



        System.out.println("\n---------- TASK-2 ----------\n");

        String s2 = "Some countries I visited were Argentina, Belgium, and Malta";

        //String[] startsWithA = s2.split(" ");

        int countA = 0;
        for (String s : s2.split(" ")) {
            if(s.toLowerCase().startsWith("a")) countA++;
        }
        System.out.println(countA);

    }
}
