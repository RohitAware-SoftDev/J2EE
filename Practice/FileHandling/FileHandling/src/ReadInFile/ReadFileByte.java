package ReadInFile;

import java.io.File;
import java.io.FileInputStream;

public class ReadFileByte {
    public static void main(String[] args) {
    try {
            File file= new File("hello1.txt");
                if(file.exists()){
                    FileInputStream fileInputStream= new FileInputStream(file);
                    System.out.println("Reading File From Program : "+ fileInputStream.read());
                    fileInputStream.close();
                }else{
                    System.out.println("File Not Found");
                }
            } catch (Exception e) {
                System.out.println("Invalid File Type");
        }
    }
}
