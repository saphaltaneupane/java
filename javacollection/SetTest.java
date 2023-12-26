package javacollection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class SetTest {
    public static void main(String[] args) {
       // Set<String> set = new HashSet<>();
      // Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();
        set.add("java");
        set.add("java");
        set.add("sql");
        for(String s:set){
            System.out.println(s);
        }
        // a>student set
        //b>Dog set
    }
}
