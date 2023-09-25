public class gouzaoqi {
    public static void main(String[] args) {
        /*
    1. 构造器用来初始化对象，创建对象的同时给-属性-进行赋值。
    2. 构造器的名字和类的名字是相同的；
    3. 构造器没有返回值。
    4. 一个类中可以定义多个构造器（构造器重载）
     */
        person p = new person("smith",80);//通过构造器直接指定名字和年龄。
        person a = new person(80);//第二个构造器初始化
        System.out.println(p.name);
        System.out.println(p.age);

        dog dog1 = new dog("大壮",40);
        dog1.info();
        dog dog2 = new dog("大黄",2);
        dog2.info();


    }
}
class person{
    String name;
    int age;
    //以下是有参数构造器
    public person(String pName, int pAge){
        name = pName;    age = pAge;
        System.out.println("构造器被调用");
    }
    //第二个构造器。构造器重载。
    public person(int pAge){
        age = pAge;
    }
}
/*
区分名字，调用构造器>>>>>>>  this  .
1.
2.
3.
4.
 */
class dog {
    String name;
    int age;
    public dog(){
    }

    public dog(String name, int age) {//构造器重载，此处运用this区分形参和和属性。
        this.name = name;
        this.age = age;
    }
    public dog(int age){//构造器重载
    }

    public void info() {
        System.out.println(name + "\t" + age + "\t");
    }
}
