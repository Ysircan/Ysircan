package GenericDetail;

import java.util.ArrayList;
import java.util.List;

public class GD {
    public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();  //给泛型要求的类型是引用类型。不能是基本数据类型

        pig<A> apig = new pig<A>(new A());
        apig.f();
        pig<A> apig2 = new pig<A>(new B());  //仍然不会报错，因为B是A的子类。
        apig2.f();
    }
}

class A{}

class B extends A{}

class pig<E>{
    E e;
    public pig(E e) {
        this.e = e;
    }
    public void f(){
        System.out.println(e.getClass());  //运行类型
    }
}


