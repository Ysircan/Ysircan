package finallei;

public class finaldetail {
    public static void main(String[] args) {
        System.out.println(BB.num);
    }
}

class AA{
    /*
   1、可以在属性直接赋值，也可以在构造器、代码块中赋值；
   2、final类不能被继承，但可以实例化；
   3、final方法不能重写。
   4、final+static的配合，不会导致类加载

    */
    public final double TAX = 0.9; //这是在属性中直接定义；
    public final double TAX2; //不给值的话会显示错误，但可以在构造器当中对其进行初始化。⚠️静态不行
    public final double TAX3; //不给值的话会显示错误，但可以在代码块当中对其进行初始化。⚠️静态不行
    public AA(){  //在构造器当中赋值。
        TAX2 = 0.1;
    }
    {
        TAX3 = 1;
    }
}

class BB{
    public final static byte num = 1; //加入final之后，BB类就不会被加载
    static {
        System.out.println("BB静态代码块被执行"); //类的加载会导致静态代码块被执行。
    }
}
