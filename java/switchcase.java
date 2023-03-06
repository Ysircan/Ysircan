public class switchcase {
    /*
    1、语法:switch{表达式[有一个表达式就有一个值返回]}
       ⚠️：表达式有要求；只能用[byte/short/int/char/enum/String]
            case X : X必须是常量或常量表达式；不能是变量。
            break;匹配上了之后，如果没有break，就会依次输出直到有break/default。
            default:可以不写。
    2、没有匹配的case，就执行default。[如果没有default,也没有匹配则什么都不输出]
    3、switch需要小写；
     */
    public static void main(String[] args) {
        char y = 'a';
        switch (y) {
            case 'b':
                System.out.println("none");
                break;//有匹配的就会跳过，找到匹配的输出。
            case 97://表达式数据类型应当和case后的常量保持一致；case "hello" ❌【这是一个字符串】
                System.out.println("a=97");//因为a对应的编码为"97"。所以可以匹配。
                //语句在此处匹配；如果不添加break，就会一直执行直到有break或者default为止；
            case 'c'+1://表达式也可以表示出常量。
                System.out.println("ok");
                break;//输出97、ok之后，遇到break；跳出switch。
            default://若所有都不匹配，则会输出default的值。若都不匹配，也没有default，则不输出。
                System.out.println("finish");
        }
        System.out.println("继续执行");

        double a = 1.1;
        switch ((byte) a) {//表达式有要求，只能用规定的数据类型。
            case 10:
                System.out.println("?");
            case 1://此处匹配且break，但不能写小数，否则报错。
                System.out.println("?");
                break;//跳出switch。
            default:
                System.out.println("!");
        }
        System.out.println("继续执行");

        final char B = 'b';//final声明常量，变量名必须大写。
        switch (B) {
            case B://前面不加final——直接报错
                System.out.println("case语句的值必须是常量不能是变量");
            case B+1:
                System.out.println("表达式也符合语法");
            default://一直执行到default结束。
                System.out.println("finish");
        }
        System.out.println("终止");
    }
}

class For{//执行前就确定了
    public static void main(String[] args) {
        int i = 1;//这种写法i作用域更大，for循环结束以后依然可以使用。
        for(;i <= 10; ){//i=11,条件为假。int i = 1;写在for里面只能是局部变量。
            //for(;;)无限循环语法。
        System.out.println("i="+i);i++;
        }
        System.out.println("i="+i);//循环结束之后，继续执行。
    }
}

class While{
    //循环变量初始化；while(循环条件){循环体；循环变量迭代;}
    public static void main(String[] args) {
        int  i = 10;
        while (i <= 10){
            System.out.println("i="+i);
             i++;//千万别漏了，否则死循环
        }
        System.out.println("i="+i);
    }
}

class Dowhile{
    //循环变量初始化；语法do{循环语句;循环变量迭代;}while(循环条件);[先执行一次再判断]
    public static void main(String[] args) {
        int i = 1;
        do{System.out.println("i="+i);i++;
        }while(i <= 10);
        System.out.println("i="+i);
    }
}


