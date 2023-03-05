public class Int {
    /* 1、Int默认值是0；数据类型32位，4字节。
       2、一个作用域不能有重名存在；'不同'的类中可以添加相同名称的变量名；
       3、数据类型默认为int。
     */
    public static void main(String[] args) {
        byte a = 1; //这里完成了强制转换，但注意：左边的数值不能超过byte范围；超过了就会报错。
        System.out.println(a);
        //再定义byte a = 5;这样的代码则是错误的；但a=X☑️,变量的值可以更改(须在同一类型范围)
         a = 6;
        System.out.println(a);
    }
}

class Long{
    /*
    常量代码：final int A  = 1;
     */
    public static void main(String[] args) {
        long a = 1L;// 声明long类型需要在后面加'l'或者'L'；
        System.out.println(a);
        long a1 = 1;//不加'L'的话，完成自动类型转换——不会报错。
        System.out.println(a1);
    }
        }

class Float{
    /*
    1、double比float更精准。
    2、默认都是double，声明float须在后面加'f'或'F'
     */
    public static void main(String[] args) {
        float a = 1.1F;//漏掉'F'会报错，即使没有超过float范围，必须加'F'。因为默认为double；
        double a1 = 1.1;//注意同一个作用域内不能存在两个重复的变量名。double a = 1.1 ❌
        System.out.println(a);
        System.out.println(a1);
    }
}

class Char{
    public static void main(String[] args) {
        char a = 97;
        System.out.println(a);//输出的是97对应的字符。
        char a1 = 'a';
        System.out.println((int)a1);//输出的是a对应的数字。
        char a2 = '9';//想输出字符的时候，需要用''；""表示的是字符串——报错。
        System.out.println(a2);
    }
}

class Boolean{
    //变量的值只能是'true''false'。
    public static void main(String[] args) {
        boolean isPass = true;
        if(isPass == true){
            System.out.println("a");
        } else {
            System.out.println("b");
        }
    }
}