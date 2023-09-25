public class arith {
    public static void main(String[] args) {
        //除法会把小数点去掉
        System.out.println(10/4);//保留小数需要声明float或者double。
        float a = 10/4F;
        double b = 10/4;//这里的结果是2.0，而不是2.5。
        System.out.println(a);
        System.out.println(b);
        System.out.println(10.0/4);//这种写法会保留小数
    }
}

class AM{
    public static void main(String[] args) {
        //做表达式时：++a先自增，再赋值。a++先赋值，在自增。
        byte a = 3;
        byte b = ++a;//先执行a=a+1;在执行b = a。
        byte c = 3;
        byte d = c++;//先执行d=c;再执行c=c+1。
        System.out.println("a=" + a + "b=" + b);
        System.out.println("c=" + c + "d=" + d);
    }
}