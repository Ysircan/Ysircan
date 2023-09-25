public class para{
    public static void main(String[] args) {
        meter C = new meter();
        int a = 1;    int b = 2; //此a，b属于主方法类的a，b
        C.swap(a,b);//传入1，2。
        System.out.println("最后执行"+a+b);//输出的并不是返回值，而是主方法类的a，b。

        meter2 M  = new meter2();
        int [] arr ={1,2,3};
        M.test100(arr);//此时传的是主方法类的 int[] arr;
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }

    }
}
class meter{//基本数据类型传参数
    void swap(int a , int b){//此时为主方法传入的1，2。
        System.out.println("交换前"+a+b);
        int temp = a ;
        a = b;   b = temp;  //此a，b属于方法的。
        System.out.println("交换后"+a+b);//语句输出以后，返回一个值。即20，10。
    }
}

class meter2{//引用类型传输的是地址，而非数据。
    void test100(int[] arr){//此步完成接收一个数组，接收来自主方法的arr{1,2,3};
        arr[0] = 10;
        System.out.println("test100的数组");
        for(int i = 0; i<arr.length;i++){
            System.out.println(""+arr[i]+"\t");
        }

    }
}





