package extend.improve;

public class High extends student{//继承没有办法直接父类的私有属性和方法；
   //所有的类都是object的子类；子类最多只能继承一个父类。
    public void testing(){
        System.out.println("高中生"+name+" "+"高中数学");
    }
}
