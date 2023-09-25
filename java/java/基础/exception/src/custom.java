public class custom {
    public static void main(String[] args) {
        int age = 10;
        //要求范围在18-100之间，用判断函数if
        if(! (age>=18 && age<=120)){  // ! 表示整体取反 则抛出异常中断程序。
           throw  new Age("年龄需要在18到100之间");
        }
        System.out.println("输入的年龄为"+age);
    }
}
class Age extends RuntimeException{   //这是自定义异常，继承了运行异常。R是C的父类。


    public Age(String message) {  //写出构造器
        super(message);
    }
}