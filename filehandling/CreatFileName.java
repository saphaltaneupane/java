package filehandling;
//File OutputStream :file write
//File Input Stream :file read

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatFileName {
    public static void main(String[] args) throws IOException {
        FileOutputStream file =new FileOutputStream("d://3pm.txt");
        file.write("hello guys".getBytes());
        file.close();
        System.out.println("file created");
    }
}
