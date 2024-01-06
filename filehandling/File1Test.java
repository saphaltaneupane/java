package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class File1Test {
    public static void main(String[] args) throws IOException {
        File file= new File("e://nepal.txt");
        System.out.println(file.isDirectory());//is given folder or not
        System.out.println(file.isFile());//file xa baney matrai true dinxa
        System.out.println(file.exists());
        File folder = new File("e://year_2024");
        folder.mkdir();
        //get all files names from folder
        String[] fileNames= folder.list();

        System.out.println(Arrays.asList(fileNames));
        //get all files
        File[] files = folder.listFiles();
        for(File f1:files){
            Files.readString(Path.of(f1.getAbsolutePath()));
            System.out.println(Files.readString(Path.of(f1.getAbsolutePath())));
        }
    }
}
