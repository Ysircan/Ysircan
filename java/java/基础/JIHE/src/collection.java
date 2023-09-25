import java.util.ArrayList;
import java.util.Collection;

public class collection{
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection list = new ArrayList(); //collection无法直接new，通过实现方法对接口类完成。
        list.add("w"); list.add(1);
        System.out.println(list);

        Collection list01 = new ArrayList();
        list01.add("a"); list01.add("b");list01.add("w");
        list.addAll(list01);  //把list01的集合融入了list集合。而不是简单拼接
        System.out.println(list);

        list.size();  //用来查询list的个数
        System.out.println(list.size());

        list.removeAll(list01);  //括号里的为基准去重。 相反retainall保留交集。
        System.out.println(list);

    }
}
