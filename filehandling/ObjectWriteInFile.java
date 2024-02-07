package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteInFile {
//    a> ObjectOutputStream :write object
//     b> ObjectInputStream :read object
    // serialization encrypt garera pathauxa
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objFile = new ObjectOutputStream(new FileOutputStream("e://objectFile.txt"));
        user u = new user(3434,"roman","yadav");
        objFile.writeObject(u);
        objFile.close();
        System.out.println("sucess");
    }

}
