import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class cs {
    @SuppressWarnings({"all"})
    //遍历集合的工具；迭代器--本质是接口
    public static void main(String[] args) {
       /* Collection list = new ArrayList(); //collection无法直接new，通过实现方法对接口类完成。
        list.add("w");
        list.add(1);
        //遍历集合的方法：调用.iterator();
        Iterator iterator = list.iterator();
       // 左边是一个接口，右边的调用方法实现了左边接口的方法。具体谁调用要看集合类型。
        while (iterator.hasNext()) {  //这是查询集合内部是否有元素可以迭代
            System.out.println(iterator.next()); //这是用来将遍历的元素取出来。

        }
    }
       }

        */
           Dog   s1  = new Dog("来福",3);
           Dog   s2  = new Dog("旺财",1);
           Dog   s3  = new Dog("阿狗",4);
            Collection list = new ArrayList();
            //把dog添加进入集合list当中。
            list.add(s1); list.add(s2); list.add(s3);
             //三种遍历集合的方法：迭代器iterator  增强for循环  普通for
        for (Object dog:list) {  //全部都是Dog可以用dog代替object
            System.out.println("dog="+dog);
        }   //for完成遍历。
        Iterator iterator = list.iterator();  //使用while循环和hasNext语句来完成。
        while(iterator.hasNext()){
            System.out.println(iterator.next()); //使用.next来取出遍历的元素。
        }

    }
}
class Dog{
   private  String name;
   private  int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {  //重写toString方法，避免出现乱码
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


