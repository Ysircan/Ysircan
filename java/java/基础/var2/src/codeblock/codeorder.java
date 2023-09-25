package codeblock;

public class codeorder {
    public static void main(String[] args) {
        new B02();   //此处首先进行类加载；类加载意味着类属性、静态代码块将会伴随加载而优先执行
        // 类加载>>>>>创建对象
        /*
        顺序：
        1、getVal01;  2、 A02的一个静态代码块；  3、getVal03； 4、B02的静态代码块
        5、"A02的普通代码块" 6、"getVal02"  7、A02无参构造器
        8、"getVal04()" 9、"B02的普通代码块"  10、B02无参构造器
         */
    }
}

class A02 {
    public static int n1 = getVal01(); //定义了一个静态变量。
   static { //这是一个静态代码块
       System.out.println("2 A02的一个静态代码块");
    }

    {//这是普通代码块
        System.out.println("5 A02的普通代码块");
    }

    public int n3 = getVal02();  //普通属性
   public static int getVal01(){  //这是一个类方法 //静态方法需要被调用才会执行
       System.out.println("1 getVal01");
       return 10;
   }
    public int getVal02(){  //这是一个普通方法
        System.out.println("6 getVal02");
        return 10;
    }

    public A02() {  //这是一个无参构造器。
        System.out.println("7 A02的无参构造器");
    }
}

class B02 extends A02{
    private static int n3 = getVal03(); //这是一个类属性

    static {   //这是一个静态的代码块
        System.out.println("4 B02的一个静态代码块");
    }

    public int n5 = getVal04();

    { //这是一个普通的代码块
        System.out.println("9 B02的普通代码块");
    }
    public static int getVal03(){  //这是一个类方法
        System.out.println("3 getVal03");
        return 10;
    }

    public B02(){ //这是无参构造器
        System.out.println("10 这是B02的无参构造器");
    }
    public int getVal04(){
        System.out.println("8 getVal04()");
        return 10;



    }

}