package Map;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map  =new HashMap();
        map.put("n1","hsp");   map.put("n2","zwj"); map.put("n3","zwj");
        System.out.println(map);  //无序。注意K出现相同的，后出现的会替换原来的。但V可以出现相同的
        //⚠️k，v都可以为null，但是V中null可以多个重复。可以通过k找到对应一个V，但V可能对应多个K。
        System.out.println(map.get("n1"));

    }
}
