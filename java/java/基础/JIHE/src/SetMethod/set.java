package SetMethod;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
       Set set  = new HashSet();
       set.add("j"); set.add("w");set.add(null);set.add(null);set.add("w");set.add(1);
        System.out.println(set);//取出与放入顺序不一致；不含重复的值；且只能有一个空。
        //两种遍历set类集合： 迭代器    增强for
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //增强for循环
        for (Object o :set) {
            System.out.println("o="+o);
        }


    }
        }


