package differ;

public class differsuccess {
    public static void main(String[] args) {
        //创建小猴子对象
        littlemonkey littlemonkey = new littlemonkey("悟空");
        littlemonkey.climb(); //继承父类可以直接用父类的方法。
        littlemonkey.swim(); //调用接口的方法。

    }

}

    interface fish{
        void swim();  //创建方法
    }
    class monkey{
        String name;
        public monkey(String name) {
            this.name = name;//左边是属性的name，右边是构造器。
        }
        public void climb(){
            System.out.println(name+"会爬树");
        }
    }

    class littlemonkey extends monkey implements fish {
        //⚠️继承在java中始终都是单继承,但可以用接口作补充。实现接口的方法（重写来实现）
        @Override
        public void swim() {
            System.out.println(name+"还会游泳");
        }

        public littlemonkey(String name) {  //有参构造器，初始化名字
            super(name);

        }
    }




