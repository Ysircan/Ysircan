package List;

import java.util.ArrayList;
import java.util.List;

public class list {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //注意list按顺序。且可重复
         List list = new ArrayList();
         list.add("jack"); list.add("tom");list.add("mary");
        list.add(1,"hsp"); //指定位置插入一个元素。addAll加入多个元素融入。
        System.out.println(list);
    }
}
