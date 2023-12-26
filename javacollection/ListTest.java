package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //  eutai type ko banauna
     //  List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>(); // list baney interface ho interface  ko direct object banauna mildena
        // LinkedList baney class le implement gareko xa list laye
        // tei bata object banako
        list.add("nepal");
        list.add("china");
        list.add("korea");
        list.remove(2);
        list.remove("china");
        System.out.println(list.contains("canada"));
        for(String s:list){
            System.out.println(s);
            // employee
            //book
        }
    }
}
