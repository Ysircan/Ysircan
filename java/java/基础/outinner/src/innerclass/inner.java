package innerclass;

public class inner { //这是外部其他类，他们无法访问局部内部类。
    public static void main(String[] args) {
        outer o = new outer();
        o.m1(); //调用局部内部类
        o.d1(); //调用成员内部类
        //外部其他类访问成员内部类的方式
        outer.inner08 inner08 = o.new inner08();
        inner08.say();
        //外部其他类访问静态内部类的方式
        outer.inner09 inner09 = new outer.inner09();
        inner09.ss();

    }
}

class outer{  //明确类的五大成员"构造器、属性、方法、代码块、内部类"。相对概念为外部类

    public outer() {
        //构造器
    }
    private int n1 = 1;//outer类的属性
    static String name = "张三";
     static class  inner09{  //静态成员内部类 不能访问外部类的非静态成员
        public void ss(){
            System.out.println(name);
        }
    }
    class inner08{  //这是普通成员内部类。 可以访问外部类的所有成员包括私有。
        public void say(){
            System.out.println(n1+name);
        }
    }
    //调用成员内部类的方法。
    void d1(){
        inner08 i08 = new inner08();
        i08.say();  //以此来调用成员内部类。
    }
    private void m2(){
        System.out.println("m2被调用");
    }


    public void m1(){ //m1是方法
        class inner{
            //写在了方法之中，这是局部内部类(可以访问外部类的所有成员包括私有)
           private int n1  = 10;
           //当局部内部类和外部类重名，就近原则。指定要外部，用外部名.this.x；
            public void f1(){
                System.out.println(n1);
                m2();
            }
        }
        class inner03 extends inner{ //inner内部类也可以继承与被继承
        }
        //外部类如果想要调用内部类的方法的话，通过创建对象即可调用。注意要在方法作用域中。
        inner i = new inner();
        i.f1();
    }

    {
        System.out.println("这是代码块");
    }


}
