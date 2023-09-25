import java.util.Scanner;
import java.util.*;
import java.lang.reflect.*;

public class ClassLoad_ {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入Key");
        String key = scanner.next();
        switch(key){
            case "1" :
                Dog dog = new Dog();  //静态加载。具有依赖性。依赖性很强。
                dog.cry();
                break;
            case "2" :
                Class cls = Class.forName("person"); //动态加载，加载Person类
                Object  o =  cls.newInstance();
               Method m = cls.getMethod("hi");
               m.invoke(o);

                System.out.println("ok");
                break;
            default:
                System.out.println("do nothing");

        }
    }
}

class Dog{  //静态加载必须要把对象及其方法创建，否则报错。
    void cry(){

    }
}
