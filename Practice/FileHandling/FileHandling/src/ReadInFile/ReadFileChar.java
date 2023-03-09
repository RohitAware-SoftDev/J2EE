package ReadInFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileChar {
    public static void main(String[] args) {
        File file= new File("hello.txt");

        if(file.exists()){
            try (FileReader fileReader = new FileReader(file)) {
                System.out.println("Reading File Using FileReader");
                // System.out.println("Read Method : \n"+fileReader.read());
                fileReader.close();
                Scanner sc= new Scanner(file);
                while(sc.hasNextLine()){
                    System.out.println(sc.nextLine());
                }
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("File Not Found");
        }
    }
}
