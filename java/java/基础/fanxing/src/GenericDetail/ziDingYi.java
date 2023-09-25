package GenericDetail;

public class ziDingYi {
    /*
    1、普通成员可以使用泛型；
    2、使用泛型的数组不能初始化；
    3、静态方法中不能使用类的泛型；
    4、创建对象时，没有指定类型，默认为object。
     */
    public static void main(String[] args) {
        Tiger<Double,String,Integer> g = new Tiger<>("john");//<T,R,M>
        g.setT(10.9);
        //g.setT("YY")  错误，类型不对
        System.out.println(g);
        Tiger g2 = new Tiger("john!");  //默认T，R，M都是Object。
        g2.setT("yy");   //注意是g2
        System.out.println(g2);
    }
}


class Tiger<T,R,M>{  //这是泛型标识符，一般是大写字母
    String name;
    R r;
    M m;
    T t;

    public Tiger(String name){
        this.name =name;
    }


    public Tiger(String name, R r, M m, T t) { //属性使用泛型。
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }


    //以下是方法使用泛型
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}