package homeworks;

import utilities.CharacterHelper;

public class FaveStudentTask {

    // TASK-1
    public static void task1(int num){
        if(num == 9) System.out.println("You have hit the lucky number!");
        else if(num == -11) System.out.println("You have hit the unlucky number!");
        else if(num > -50 && num < 0) System.out.println("The number is negative and more than -50");
        else if(num > 0 && num < 50) System.out.println("The number is positive and less than 50");
        else if(num == 0) System.out.println("The number is zero!");
    }


    // TASK-2
    public static void task2(int age, String name){
        if(age > 30 && CharacterHelper.isUppercase(name.charAt(0))){
            System.out.println("Age and letter checks out");
        }
        else if(age > 30 && !(CharacterHelper.isUppercase(name.charAt(0)))){
            System.out.println("Age checks out but letter doesn't");
        }
        else if(age <= 30 && CharacterHelper.isUppercase(name.charAt(0))){
            System.out.println("Age doesn't check out but letter does");
        }
        else if(age <= 30 && !(CharacterHelper.isUppercase(name.charAt(0)))){
            System.out.println("Nothing checks out");
        }
    }




}
