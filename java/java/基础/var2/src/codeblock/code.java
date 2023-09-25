package codeblock;

public class code {
    public static void main(String[] args) {
        AA aa = new AA(); //new一个对象，类被加载>>>代码块伴随类的加载而执行。
       AA aa2 = new AA(); //创建子类对象实例，父类会被加载。

        System.out.println(CC.n1); //类属性可以直接 类名.类属性名访问。 此时代码块也会执行

       /* DD dd = new DD();
        DD dd1 = new DD();
          // 代码块只会进行一次加载。和 上面 AA 注意区分，因为AA属于继承了BB
        */

        System.out.println(DD.n1);  //⚠️如果把new DD注释掉，普通代码块便不会加载。
        // 因为调用静态成员只是类加载，类加载只是静态属性，代码块被执行
    }
}

class AA extends BB{
    static{ //加入static标志其为静态代码块，静态代码块只会使用一次，伴随类的加载而执行。
        System.out.println("静态代码块被执行");
    }
}

class BB{
    static {
        System.out.println("bb代码块被执行");  //⚠️父类优先输出。
    }
}

class CC{
    static {
        System.out.println("cc代码块被执行");
    }
    public static int n1 = 9;   //静态属性。
}

class DD{
    public static int n1 = 1; //静态属性
    static{
        System.out.println("dd静态代码块被执行"); //静态代码块
    }
    {
        System.out.println("dd的普通代码块被调用");
        //⚠️普通代码块创建一个对象实例便会被调用一次，且与类的加载没有关系。
    }
}


