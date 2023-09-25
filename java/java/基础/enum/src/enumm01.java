public class enumm01 {
    public static void main(String[] args) {
        /*1、自定义枚举，第一步私有化构造器，防止被new。
        2、去掉set方法，只能读。
        3、在其内部创建固定的值。
        4、使用final+Static共同修饰，优化底层。
        5、枚举对象需要大写规范。
        ==================

         */

        System.out.println(season01.FALL);// 因为static，所以可以直接用类名引用。
        //常见问题：不加toString默认输出object。
    }
}


class season01{
    private String name;
    private String dec;

    public final static season01 SPRING = new season01("spring","warm");
    public final static season01 WINTER = new season01("winter","cold");
    public final static season01 SUMMER = new season01("summer","hot");
    public final static season01 FALL = new season01("秋天","凉爽");

    public String getName() {
        return name;
    }



    public String getDec() {
        return dec;
    }


    @Override
    public String
    toString() {
        return "season01{" +
                "name='" + name + '\'' +
                ", dec='" + dec + '\'' +
                '}';
    }

    private season01(String name, String dec) {  //加上private修饰符、无法直接new对象
        this.name = name;
        this.dec = dec;


    }
}
