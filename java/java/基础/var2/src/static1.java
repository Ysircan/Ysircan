public class static1 {
    public static void main(String[] args) {
        Child C1 = new Child("白骨精");
        Child C2 = new Child("狐狸精");
        Child C3 = new Child("老鼠精");

        //定义一个变量统计玩游戏的人数
        //int count = 0;
        C1.join();  C1.count++;  //count++;  //第一个小孩加入，count自增；
        C2.join();  C2.count++;  //count++;  //第二个小孩加入，count再自增；
        C2.join();  C3.count++;  //count++;  //游戏结束。
        //C1/C2/C3.count的访问都是count这个类变量。不论是1，2，3去输出，值都是一样的。
        //访问语法有两个：1、类名.类变量名 即Child.count;    2、对象名.类变量名/C1.C2.C3
        System.out.println("共有"+Child.count+"小孩加入游戏"); //类变量可以直接用类访问。

    }

}

class Child{
    String name;

    public Child(String name) {   //构造器
        this.name = name;
    }
    public void join(){
        System.out.println(name+"加入了游戏");
    }

    //改进，设置一个类变量。  类变量的要求：static
    public static int count = 0; //初始化类变量。此变量Child以后的对象统统都可以访问。
    //类变量不要求有对象实例。
}