package characteristic.extend.override;

public class dog extends animal{
    @Override//方法重写的标识.方法重写发生在继承当中。
    void sound() {
        System.out.println("狗叫汪汪");//方法重写会覆盖掉原先的父类方法；
        super.sound();//这是用来调用出父类的方法。⚠️不像调用父类构造器必须写在第一行。
    }
}
