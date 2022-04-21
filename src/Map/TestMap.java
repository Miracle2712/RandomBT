package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new TreeMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Set<String> keys = hashMap.keySet();
        for (String key: keys){
            System.out.println("Key: " + key + ": " + hashMap.get(key));
        }
    }

}
