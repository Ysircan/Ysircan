package Absract;

public class abstractdetail {
    public static void main(String[] args) {

    }
}

abstract class animal{   //声明为抽象类，不一定要有抽象方法；但是如果反过来的，则需要声明抽象方法。
    private String name;
    public animal(String name){  //this 左边是属性的name，右边是构造器的name；
        this.name = name;
    }
    abstract   public void eat();  //抽象方法没有方法体。
    }

class cat extends animal{
    public cat(String name) {  //构造器来初始化name。
        super(name);
    }

    @Override
    public void eat() {   //重写继承的抽象类的方法。

    }
}