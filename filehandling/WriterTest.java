package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    //FileWrite: write txt format only
    //FileReader: read
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("e://product.txt",true); // true is kept to show old data and new too
        file.write("id=4224\n");
        file.close();
        System.out.println("success");
    }
}
