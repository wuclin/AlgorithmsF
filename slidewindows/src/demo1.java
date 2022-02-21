import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public String minWindow(String s, String t) {
        int left = 0, right = 0;

        Map<Character, Integer> hashmapT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (hashmapT.containsKey(c))
                hashmapT.put(c, hashmapT.get(c)+1);
            else
                hashmapT.put(c, 1);
        }//把字符串t保存在哈希表内

        return null;
    }

}
