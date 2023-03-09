package createFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateByte {
    public static void main(String[] args) {
        try { File file= new File("hello1.txt");
                if(file.exists()){
                    System.out.println("File Already Existed");
                }else{
                    file.createNewFile();
                    System.out.println("File Successfully Created");
                }
                FileOutputStream fileOutputStream= new FileOutputStream(file);
                System.out.println("Writing On FILE");
                fileOutputStream.write(1234);
                fileOutputStream.close();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
