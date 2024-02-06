package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDocFile {
    // image na bako read garnu paryo baney use hunxa
    // FileWriter:write file
    //file reader: read file
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("d://employeee.txt",true);
        file.write("id=1\n");
        file.write("name=hi\n");
        file.write("city= lathmandu\n");
        file.write("company: gooogle");
        file.close();
        System.out.println("sucess");
    }
}
