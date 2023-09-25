public class object1 {
    public static void main(String[] args) {
        String cat1 = "小白";
        int cat1Age = 3;
        String cat1Color = "白色";

        String cat2 = "小花";
        int cat2Age = 10;
        String cat2Color = "灰色";
        //如果变量太多，属性增减造成数据管理冗杂。

        String[] cat1Info = {"小白","3","白色"};
        String[] cat2Info = {"小花","10","灰色"};

        Cat cat3 = new Cat();
        cat3.name = "小白";
        cat3.age =3;
        cat3.color="白色";
        cat3.Sum();//调用Sum()的方法；
        cat3.Sum1(4);//n是参数，可以完成指定的参数。
        int a = cat3.getSum(1 ,2);//return 的值可以不接收；接收用int a；
        System.out.println(a);

        Cat cat4 = new Cat();
        cat4.name = "小花";
        cat4.age =10;
        cat4.color="灰色";

    }

}
//先形成一个类（把基本共同的属性提取出来）本质为数据类型。再从类里具体创造一个对象出来。
/*
1. 自定义一个猫类；
2. 写出共同的属性；
3. 具体捏一只猫即对象；基本公式：Cat cat1 = new Cat();⚠️不能重名，前后大写与自定义类名称需一致。
具体的猫就是-cat1-来接收。真正的对象是接收的数据即：Cat。
4. 打印对象的属性
 */
class Cat{//对象中包含：属性+行为。
    //属性可以是基本数据类型，可以是引用类型即：数组。
    String name;
    int age;
    String color;
    /*
    方法的写法：public void speak(){
    void 代表没有返回值；speak表示自定义方法名。()是形参列表；
    system.out.println()
    }
     */
   //1. 无传参的方法调用。
    public void Sum(){
       int res = 0;
        for (int i = 1; i<5;i++){
            res+=i;
        }
    }
    //2. 有传参的方法调用；
    public  void Sum1(int n){
        int res = 0;
        for (int i = 1; i<n;i++){
            res+=i;
        }
    }
    //3. 计算多个数的值；
    public int getSum(int num1, int num2){
        int res = num1 + num2;
        return res;//返回值。
    }
}



