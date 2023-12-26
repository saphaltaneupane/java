package javacollection;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
public class CollectionTest {
    public static void main(String[] args) {
     List<Integer>  list = Arrays.asList(9,87,9,3,34,34,222,37) ;
     Collections.sort(list);
        System.out.println(list);
     Collections.reverse(list) ;
        System.out.println(list);
        Collections.fill(list,99);
        System.out.println(list);
     List<Integer>   l1 = List.of(34,56,49,45,456,455);


        System.out.println(Set.of(34,54,65,76,87,67,66,56)); // set nai banayera dina parxa
        System.out.println(Map.of("AA",89,"BB",77));
    }
}
