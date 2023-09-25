package characteristic.poly.up;

public class Animal {//这是父类
       String name = "动物";
       int age = 10;
       public void sleep(){//第一个方法==睡觉的动作
           System.out.println("睡");
       }
       public void run(){
           System.out.println("跑");//第二个方法==跑的动作
       }
       public void eat(){
           System.out.println("吃");//第三个动作==吃饭
       }
       public void sound() {
           System.out.println("叫");
       }
}
