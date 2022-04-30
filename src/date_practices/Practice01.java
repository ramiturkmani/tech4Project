package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
        System.out.println("Hey please enter your year of birth");
//        int YOB = scan.nextInt();

//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
//
//
//        System.out.println("You are " + (Integer.parseInt(dateFormat.format(date)) - YOB) + " years old!");

        System.out.println("You are " + (Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) - new Scanner(System.in).nextInt()) + " years old!");

    }
}
