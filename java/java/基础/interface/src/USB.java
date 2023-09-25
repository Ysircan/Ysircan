public interface USB {//接口可以有属性，可以有3种方法
   //接口的属性是：public static final
    int a =10;  //访问属性的时候直接用(接口名.属性名)

    //规定相关的方法
    public void start();  //抽象方法

    public void stop();  //抽象方法

    default public void hi(){//jdk8的配置下，可以实现默认的方法，但是要注意添加default关键字。
        System.out.println("hi..");
        }
    public static void HI(){//可以添加静态方法。
        System.out.println("HI..");
    }


    }


