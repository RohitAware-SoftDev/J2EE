package writeInFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        File file= new File("hello.txt");

        if(file.exists()){
            System.out.println("File already present");
        }else{
            try {
                file.createNewFile();
                System.out.println("File Successfully Created");
            } catch (IOException e) {
                System.out.println("File Not Found");
                e.printStackTrace();
            }
        }
        try {
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write("This Text Written Using java ");
                System.out.println("File Successfully Written");
                fileWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
