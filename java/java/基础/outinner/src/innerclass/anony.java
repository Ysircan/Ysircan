package innerclass;

public class anony {  //外部其他类
    public static void main(String[] args) {
        anony1 a1 = new anony1();
        a1.f1();
    }
}


class anony1{  //外部类
    int n1 = 1;
    String name;
    public void f1(){
        A tiger = new A(){  //匿名内部类  编译类型是接口；运行类型是匿名内部类。
            int n1 = 0; //此时重名，遵循就近原则。

            @Override
            public void cry() {
                System.out.println("老虎叫");
                System.out.println(n1);
                //如果要指定调用外部类（外部类名.this.n1);谁调用f1方法，外部名就用哪个
                System.out.println(anony1.this.n1);
            }
        };
        tiger.cry();

        f f = new f("jack"){   //基于类创建的匿名内部类 。此时运行类型是匿名内部类
            //重写f的test方法   上方的jack会传给f类的构造器。

            @Override
            void test() {
                System.out.println("匿名内部类在运行");
            }
        };
        f.test();
        //基于抽象类的匿名内部类.⚠️抽象类中的方法一定要实现，否则报错
        m mom = new m(){
           //实现了方法之后便不会出现错误。
            void cry() {
                System.out.println("抽象类的方法被显示");
            }
        };
        mom.cry();
    }
    }
interface A{  //接口
    public void cry();

}
class f{
    public f(String name){  //构造器

    }
    void test(){

    }

}
abstract class m{ //抽象类
    abstract void cry(); //抽象方法
}
