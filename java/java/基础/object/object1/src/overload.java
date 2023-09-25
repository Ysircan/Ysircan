public class overload {
    public static void main(String[] args) {


    /*
    1.重载目的是为了减轻记名，调用同名但有不同需求的方法；
    2.方法必须重名，但参数不能一致。（可以顺序，类型不一致）
    3.返回类型不一样，对方法重载不影响。
     */

        myCalulator mc = new myCalulator();
        int a = mc.calculate(1,3);//调用方法
        System.out.println(a);

        var v = new var();
       int b = v.sum(1,2,3);
        System.out.println(b);

        int[] arr= {1,2,3};
        T t = new T();
        t.t(arr);//传入实参。

    }

}
class myCalulator{
    int calculate(int a , int b){
      return a+b;
        }
        double calculate(int a ,double b){//数据类型不一致
        return a+b;
        }
    double calculate(double a ,int b){//此时顺序不一致
        return a+b;
    }
    int calculate(int a , int b, int c){//数量不一致
        return a+b+c;
    }
    }
/*
由此引出可变参数。多行代码用一行代码完成。把第1、第4整合。
1、使用时，nums当做数组来使用；.length. 然后遍历数组实线功能，所以实参可以是数组；
2、可变参数必须放置在最后，且只能有一个可变参数。
 */
class var{
    int sum(int... nums){//...表示接收可变参数，类型指定为int。
        int res = 0;
        for(int i=0;i< nums.length;i++){
            res+=nums[i];
        }
        return res;
    }
}
class T{//可变参数可以是数组
    void t(int...nums){

    }
}