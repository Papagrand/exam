package Билет8;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class task8 {
    public static void mystery(Map<String, String> map){
        Map<String, String> result = new TreeMap<String, String>();
        for (String key : map.keySet()) {
            if (key.compareTo(map.get(key)) < 0){
                result.put(key, map.get(key));
            } else {
                result.put(map.get(key), key);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        map.put("two", "deux");
//        map.put("five", "cinq");
//        map.put("three", "trois");
//        map.put("four", "quatre");
        // --------------------
//        map.put("skate", "board");
//        map.put("drive", "drive");
//        map.put("program", "computer");
//        map.put("play", "computer");
        // --------------------
//        map.put("siskel", "ebert");
//        map.put("girl", "boy");
//        map.put("heads", "tails");
//        map.put("ready", "begin");
//        map.put("first", "last");
//        map.put("begin", "end");
        // --------------------
        map.put("cotton", "shirt");
        map.put("tree", "violin");
        map.put("seed", "tree");
        map.put("light", "tree");
        map.put("rain", "cotton");
        mystery(map);

    }


}
