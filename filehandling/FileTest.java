package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("e://hello.txt");
        file.write("happy new year".getBytes());
        file.close();
        System.out.println("success");

    }
}
