package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {
    public static void main(String[] args) {
        File myFile = new File("studentlist.txt");

        try{
            myFile.createNewFile();
            Thread.sleep(5000);

            //Write some info to file
            FileWriter fileWriter = new FileWriter("studentlist.txt");
            fileWriter.write("Abe\n");
            fileWriter.write("Vite\n");
            fileWriter.write("Torrie\n");
            fileWriter.write("Taylor");
            fileWriter.close(); // saves file

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            myFile.delete();
        }

        System.out.println("End of the program!");
    }
}
