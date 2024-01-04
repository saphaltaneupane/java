package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    //FileWrite: write txt format only
    //FileReader: read
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("e://product.txt");
        file.write("id=4444\n");
        file.close();

    }
}
