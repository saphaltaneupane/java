package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectTest {
    //deserialization
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream file= new ObjectInputStream(new FileInputStream("e://objectFile.txt"));
        user u =(user) file.readObject();
        System.out.println(u);
    }
}
