package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaddocTest {
    public static <BufferReader> void main(String[] args) throws IOException {
        FileReader file = new FileReader("d://employeee.txt");
        BufferReader br = (BufferReader) new BufferedReader(file);
       //br.readLine();
        String line;
        //while((line = br.readLine())!=null){
          //  System.out.println(line);
       // }
    }
}
