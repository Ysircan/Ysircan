import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class object {
    public static void main(String[] args) {
        //new对象的方法：1、person p1；p1=new person();2、person p1 = new person();
      person p1 = new person();//new后面的才是对象，p1仅是名称。
        p1.age=10; p1.name="小明";
        person p2 = p1;//p2指向p1的地址。
        System.out.println("名字"+p1.name+"年龄"+p1.age+"体重"+p1.weight+
                "boolean"+ p1.ispass);
        System.out.println(p2.age);

    }
}
class person{//这是类的属性部分
    String name;//引用数据类型，这里数组也是可以出现的。
    int age;//基本数据类型
    double weight;
    boolean ispass;
}
class m{
    public static void main(String[] args) {
        method m1 = new method();//new一个对象，
        m1.speak();//调用类中的方法语句。
        m1.cal();//可以调用计算方法
        m1.cal2((byte) 5);//
        byte returnRes=m1.getSum((byte) 10, (byte) 20);//强制转换int。
        System.out.println(returnRes);
    }
}
class method {
    //下面是属性
    String name;
    int age;

    //下面是方法；
    public void speak() {
        //void表示方法没有返回值；speak()是方法名；()形参列表;{}是方法体;
        System.out.println("方法");
    }

    public void cal() {
        byte res = 0;
        for (byte i = 0; i <= 5; i++) {
            res += i;
        }
        System.out.println(res);
    }

    public void cal2(byte n) {//n是形参，可以接收用户输入
        byte sum = 0;
        for (byte i = 0; i <= n; i++) {
            sum += i;
        }
    }

    public byte getSum(byte num1, byte num2) {
        byte res = (byte) (num1+num2);//强制转换
        return res;//getSum 必须要有return语句。
    }
}
class t1{
    public static void main(String[] args) {
        tool t1 = new tool();
        int[][]map = {{0,0,1},{1,1,1},{1,1,3}};
        t1.printArr(map);//直接调用方法，可以一直重复使用的。
    }
}
class tool{
    public static void printArr(int[][] map){//接下来写对数组的一个具体操作的代码。比如遍历
        for(int i = 0;i < map.length;i++){
            for(int j = 0;j<map[i].length;j++){
                System.out.print(map[i][j]+"");
            }
            System.out.println();//换行代码
        }
    }
}
class method02{
    public static void main(String[] args) {
        AA a = new AA();
        int [] res = a.getSumAndSub(1,4);//返回的类型要与方法声明的类型一致才可以使用
    }
}
class AA{
    public int[] getSumAndSub(int n1, int n2){//把值以数组的形式返回，可以得到多个值
        int [] res = new int[2];
        res [0] = n1 + n2 ;    res[1] = n1 - n2;
        return res;
        //没有void表明要求有返回的数据类型，必须写return语句。返回的是一个值或者表达式
    }
}
class recusion{
    public static void main(String[] args) {
        T t1 = new T();//new 一个t1对象。
        t1.test(4);//在T类之中调用test方法。
        int res = t1.factorial(5);
        System.out.println("res="+res);
    }
}
class T{
    public void test (int n){
        if (n>2){
            test(n-1);//此处为递归语句。遵循后进先出，逐级返回。
    }
    System.out.println("n="+n);
}
    public int factorial (int n){
        if (n==1){
            return 1;
        }else{
            return factorial(n-1)*n;
        }
    }
}
class varparamenter{
    public static void main(String[] args) {
        //基本语法：访问修饰符、返回类型、方法名(数据类型...形参名)
        para a = new para();
        System.out.println(a.sum(1,5,100));
    }
}
class para{
    public int sum(int...nums){//int...表示可变参数。参数的个数就是num.length
        //形参列表只能有一个可变参数，如果和普通参数放在一起，可变参数须放在最后。
        int a = 0;
        for (int i = 0;i< nums.length;i++){//可变参数的本质就是数组.
            a+=nums[i];
        }
        return a;
    }
}
class ex{
    public static void main(String[] args) {
        int[][] arr = {{1, 2},{2}};
        ex2 b = new ex2();//创建对象的时候，名称要与类相一致。
        b.f1(arr);//这里是把arr传入方法。
    }
}
class ex2{
    public void f1(int[]...nums){//如果单纯一维数组，不需要加数组符号。二维语法后面要声明
        System.out.println(nums.length);
    }
}

class thisexer{
    public static void main(String[] args) {
        dog dog1=new dog("来福",3);
        dog1.info();
    }
}
class dog{
    String name;
    int age;
    public dog(String Name, int Age){//这里是构造器。初始化对象的值
        this.name=Name;
        this.age=Age;
        //这里存在作用域就近原则。用以区分当前类的属性和局部变量。[访问属性]
        //访问构造器的语法，只能在构造器中使用。语法为[this(参数列表)]必须放在第一句。
    }
    public void info(){
        System.out.println(name+"\t"+age+"\t");

    }
}
