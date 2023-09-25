public class enumm02 {
    public static void main(String[] args) {
       /* 1、使用关键字的enum写法：使用enum替代class。告诉这是枚举类，只能读，不能增改
          2、遵照语法写。 对象名规范大写
          */
        System.out.println(season03.SPRING);
        season03 spring = season03.SPRING;
        //name方法.获取枚举常量的名称
        System.out.println(spring.name());
        //ordinal获取枚举常量的序号。
        System.out.println(spring.ordinal());
        //values 返回当前枚举中所有的常量

        //valueOf 将字符串转换成枚举对象，否则报异常。
        // 会先去枚举对象里面去寻找，找到了就返回，没有找到就报错。
        season03 winter = season03.valueOf("WINTER");
        //compareTo比较的事两个枚举常量，比较的是编号。



    }
}

interface Playing{
    void play();
}

enum season03 implements Playing{   //直接用常量名() ⚠️是逗号来连接，最后用";",而且必须放在最上面
    SPRING("春","凉爽"),WINTER("冬","cold"),W;//W调用的是无参构造器
    private String name;
    private String dec;


    private season03(){  //无参构造器。

    }




    season03(String name, String dec) {
        this.name = name;
        this.dec = dec;

    }


    public String getName() {
        return name;
    }

    public String getDec() {
        return dec;
    }

    @Override
    public String toString() {
        return "season3{" +
                "name='" + name + '\'' +
                ", dec='" + dec + '\'' +
                '}';

    }


    @Override
    public void play() {
        System.out.println("播放音乐");
        //可以实现接口，但没法再继续继承了，因为但继承机制。
    }
}