package ReflexStage;

public class initial {
    public static void main(String[] args) {
        B b = new B();
    }

}
class B {
    static {
        System.out.println("B 静态代码块被执行");
        int num = 300;

    }
    static int num = 300;
    public  B (){
        System.out.println("B构造器被执行");
    }
}