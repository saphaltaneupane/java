package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader file= new FileReader("e://product.txt");
        BufferedReader br = new BufferedReader(file); // processor near , line reading
        String line;
        br.readLine();// heading remove
        while((line= br.readLine())!=null){

            System.out.println(line);
            String[] data= line.split(",");
            System.out.println(data[1]);
            //connect db
            // create user table
            //write sql and execute

        }


    }
}
