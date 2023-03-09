package createFile;
import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
       File file =new File("hello.txt");

       if(file.exists()){
            System.out.println("File Already Exist");
       }else{
            try {
                file.createNewFile();
                System.out.println("File Created Successfully");
            } catch (IOException e) {
                System.out.println("File Not Created");
                e.printStackTrace();
            }
       }
    }
}
