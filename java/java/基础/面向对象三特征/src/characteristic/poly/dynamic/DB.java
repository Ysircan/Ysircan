package characteristic.poly.dynamic;

public class DB {
    public static void main(String[] args) {

         A a = new B();
        System.out.println(a.sum());  //
        System.out.println(a.sum1()); //


    }
}
class A{ //父类
    public int I = 10;
    public int sum(){
        return getI()+10;
    }
    public int sum1(){
        return I+10;  //属性没有动态绑定机制
    }
    public int getI(){  //动态绑定机制，与运行类型绑定。所以调用的是属性重写的getI方法。
        return I;
    }

}

class B extends A{
    public int i = 20;
   /* public int sum(){  //把父类的sum方法进行重写
        return i+20;
    }*/
    public int getI(){  //把父类的getI方法重写
        return i;
    }
    public int sum1(){  //重写父类的sum1方法
        return i+10;
    }



        }