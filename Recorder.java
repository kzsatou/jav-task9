import java.util.HashMap;
import java.util.Map;

public class Recorder {
    private Map<String, String> map = new HashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
        System.out.println(key + "=" + value);
    }

    public void get(String key) {
        // keyが存在するか判定する
        boolean b1 = map.containsKey(key);
        if (b1) {
            System.out.println(map.get(key));
        } else {
            // keyが存在しない場合例外を投げる
            throw new IllegalArgumentException();
        }
    }

    public void delete(String key) {
        // keyが存在するか判定する
        boolean b2 = map.containsKey(key);
        if (b2) {
            // keyとvalueをmapから削除
            map.remove(key);
            System.out.println("deleted: " + key);
        } else {
            // keyが存在しない場合例外を投げる
            throw new IllegalArgumentException();
        }
    }

    public void delete() {
        // mapを全削除
        map.clear();
        System.out.println("delete all");
    }

}