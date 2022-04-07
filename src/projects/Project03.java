package projects;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("---------- Task-1 ----------\n");

        String s1 = "24", s2 = "5";
        int t1_num1 = Integer.parseInt(s1), t1_Num2 = Integer.parseInt(s2);

        System.out.println("The sum of " + t1_num1 + " and " + t1_Num2 + " = " + (t1_num1+t1_Num2));
        System.out.println("The subtraction of " + t1_num1 + " and " + t1_Num2 + " = " + (t1_num1-t1_Num2));
        System.out.println("The division of " + t1_num1 + " and " + t1_Num2 + " = " + ((double)t1_num1/(double)t1_Num2));
        System.out.println("The multiplication of " + t1_num1 + " and " + t1_Num2 + " = " + (t1_num1*t1_Num2));
        System.out.println("The remainder of " + t1_num1 + " and " + t1_Num2 + " = " + (t1_num1%t1_Num2));



        System.out.println("\n---------- Task-2 ----------\n");

        int t2_num1 = (int)((Math.random()*35)+1);

        System.out.println("Random number = " + t2_num1);
        System.out.println();

        if(t2_num1==2 || t2_num1==3 || t2_num1==5 || t2_num1==7 || t2_num1==11 || t2_num1==13 ||
                t2_num1==17 || t2_num1==19 || t2_num1==23 || t2_num1==29 || t2_num1==31){
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        }else System.out.println("THE NUMBER IS NOT A PRIME NUMBER");



        System.out.println("\n---------- Task-3 ----------\n");

        int t3_num1 = (int)((Math.random()*50)+1);
        int t3_num2 = (int)((Math.random()*50)+1);
        int t3_num3 = (int)((Math.random()*50)+1);

        System.out.println("Random number 1 = " + t3_num1);
        System.out.println("Random number 2 = " + t3_num2);
        System.out.println("Random number 3 = " + t3_num3);
        System.out.println();

        int lowest = 0;

        if(t3_num1<t3_num2 && t3_num1<t3_num3) lowest = t3_num1;
        else if(t3_num2<t3_num1 && t3_num2<t3_num3) lowest = t3_num2;
        else if(t3_num3<t3_num1 && t3_num3<t3_num2) lowest = t3_num3;

        System.out.println("Lowest number = " + lowest);

        int middle = 0;

        if((t3_num1>t3_num2 && t3_num1<t3_num3) || (t3_num1<t3_num2 && t3_num1>t3_num3)) middle = t3_num1;
        else if((t3_num2>t3_num1 && t3_num2<t3_num3) || (t3_num2<t3_num1 && t3_num2>t3_num3)) middle = t3_num2;
        else if((t3_num3>t3_num1 && t3_num3<t3_num2) || (t3_num3<t3_num1 && t3_num3>t3_num2)) middle = t3_num3;

        System.out.println("Middle number = " + middle);

        int greatest = 0;

        if(t3_num1>t3_num2 && t3_num1>t3_num3) greatest = t3_num1;
        else if(t3_num2>t3_num1 && t3_num2>t3_num3) greatest = t3_num2;
        else if(t3_num3>t3_num1 && t3_num3>t3_num2) greatest = t3_num3;

        System.out.println("Greatest number = " + greatest);



        System.out.println("\n---------- Task-4 ----------\n");

        char t4_char1 = 'R';
        int t4_c1 = t4_char1;
        //We cast char into an int so the computer has the ASCII value for that character

        if(t4_c1>=65 && t4_c1<=90){
            System.out.println("The letter is uppercase");
        }else if(t4_c1>=97 && t4_c1<=122){
            System.out.println("The letter is lowercase");
        }else{
            System.out.println("Invalid character detected!!!");
        }



        System.out.println("\n---------- Task-5 ----------\n");

        char t5_char1 = 'T';
        int t5_c1 = t5_char1;

        if(t5_c1==65 || t5_c1==69 || t5_c1==73 || t5_c1==79 || t5_c1==85 ||
                t5_c1==97 || t5_c1==101 || t5_c1==105 || t5_c1==111 || t5_c1==117){
            System.out.println("The letter is vowel");
        }else if((t5_c1>=65 && t5_c1<=90) || (t5_c1>=97 && t5_c1<=122)){
            System.out.println("The letter is consonant");
        }else{
            System.out.println("Invalid character detected!!!");
        }



        System.out.println("\n---------- Task-6 ----------\n");

        char t6_char1 = '!';
        int t6_c1 = t6_char1;

        if(t6_c1>=33 && t6_c1<=47 || t6_c1>=58 && t6_c1<=64 || t6_c1>=91 && t6_c1<=96 || t6_c1>=123 && t6_c1<=126){
            System.out.println("Special character is = " + t6_char1);
        }else{
            System.out.println("Invalid character detected!!!");
        }



        System.out.println("\n---------- Task-7 ----------\n");

        char t7_char1 = '9';
        int t7_c1 = t7_char1;

        if((t7_c1>=65 && t7_c1<=90) || (t7_c1>=97 && t7_c1<=122)){
            System.out.println("Character is a letter");
        }else if(t7_c1>=48 && t7_c1<=57){
            System.out.println("Character is a digit");
        }else{
            System.out.println("Character is a special character");
        }       //I chose to use 'else' instead of 'else if' because the instructions say "Otherwise"

        System.out.println("\nEnd of the program!");
    }
}