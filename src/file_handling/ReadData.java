package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) {
        File file = new File("shoppingList.txt");

        try{
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("shoppingList.txt");
            fileWriter.write("Ice-cream");
            fileWriter.write("Fruits");
            fileWriter.write("Pen");
            fileWriter.write("Paper");
            fileWriter.write("Milk");
            fileWriter.close();
            Thread.sleep(10000);

            Scanner scanner = new Scanner(file);

            int index = 1;
            while (scanner.hasNextLine()){
                System.out.println("Item " + index++ + " = " + scanner.nextLine());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            file.delete();
        }

        System.out.println("End of the program!");
    }
}
