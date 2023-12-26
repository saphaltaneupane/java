package javacollection;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.HashMap;
public class MapTest {
    public static void main(String[] args) {
        //subject_name - marks
//        Map<String,Integer> map = new HashMap<>();
//        Map<String,Integer> map = new TreeMap<>();
        Map<String,Integer> map = new LinkedHashMap<>();
        map.put("nepali",90);
        map.put("english",80);
        map.put("math",89);
        map.put("computer",88);
        for(String key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
    }
}
